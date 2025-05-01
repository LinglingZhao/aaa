# Test info

- Name: Basic interactions demo
- Location: D:\workspace\aaa\test\playwright\tests\github.spec.ts:25:5

# Error details

```
Error: page.goto: Test timeout of 30000ms exceeded.
Call log:
  - navigating to "https://playwright.dev/", waiting until "load"

    at D:\workspace\aaa\test\playwright\tests\github.spec.ts:27:14
```

# Test source

```ts
   1 | import { test, expect } from '@playwright/test';
   2 |
   3 | test('GitHub search test', async ({ page }) => {
   4 |   // 导航到GitHub
   5 |   await page.goto('https://github.com');
   6 |   
   7 |   // 等待搜索框出现并输入搜索内容
   8 |   await page.getByRole('textbox', { name: 'Search or jump to...' }).click();
   9 |   await page.getByRole('textbox', { name: 'Search or jump to...' }).fill('playwright');
  10 |   await page.keyboard.press('Enter');
  11 |   
  12 |   // 等待搜索结果加载
  13 |   await page.waitForURL('**/search**');
  14 |   
  15 |   // 验证搜索结果中包含Playwright仓库
  16 |   const firstResult = await page.locator('a[href="/microsoft/playwright"]').first();
  17 |   await expect(firstResult).toBeVisible();
  18 |   
  19 |   // 获取并验证仓库标题
  20 |   const repoTitle = await firstResult.textContent();
  21 |   console.log('Found repository:', repoTitle);
  22 |   await expect(repoTitle).toContain('playwright');
  23 | });
  24 |
  25 | test('Basic interactions demo', async ({ page }) => {
  26 |   // 导航到Playwright官网
> 27 |   await page.goto('https://playwright.dev');
     |              ^ Error: page.goto: Test timeout of 30000ms exceeded.
  28 |   
  29 |   // 点击API链接
  30 |   await page.getByRole('link', { name: 'API', exact: true }).click();
  31 |   
  32 |   // 等待页面加载并验证URL
  33 |   await expect(page).toHaveURL(/.*api/);
  34 |   
  35 |   // 搜索特定API
  36 |   await page.getByPlaceholder('Search').fill('click');
  37 |   
  38 |   // 验证搜索结果
  39 |   const searchResults = page.getByRole('article');
  40 |   await expect(searchResults).toContainText('click');
  41 | });
```