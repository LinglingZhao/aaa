import { test, expect } from '@playwright/test';

test('GitHub search test', async ({ page }) => {
  // 导航到GitHub
  await page.goto('https://github.com');
  
  // 等待搜索框出现并输入搜索内容
  await page.getByRole('textbox', { name: 'Search or jump to...' }).click();
  await page.getByRole('textbox', { name: 'Search or jump to...' }).fill('playwright');
  await page.keyboard.press('Enter');
  
  // 等待搜索结果加载
  await page.waitForURL('**/search**');
  
  // 验证搜索结果中包含Playwright仓库
  const firstResult = await page.locator('a[href="/microsoft/playwright"]').first();
  await expect(firstResult).toBeVisible();
  
  // 获取并验证仓库标题
  const repoTitle = await firstResult.textContent();
  console.log('Found repository:', repoTitle);
  await expect(repoTitle).toContain('playwright');
});

test('Basic interactions demo', async ({ page }) => {
  // 导航到Playwright官网
  await page.goto('https://playwright.dev');
  
  // 点击API链接
  await page.getByRole('link', { name: 'API', exact: true }).click();
  
  // 等待页面加载并验证URL
  await expect(page).toHaveURL(/.*api/);
  
  // 搜索特定API
  await page.getByPlaceholder('Search').fill('click');
  
  // 验证搜索结果
  const searchResults = page.getByRole('article');
  await expect(searchResults).toContainText('click');
});