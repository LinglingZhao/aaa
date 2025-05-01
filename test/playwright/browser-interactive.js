const { chromium } = require('playwright');

(async () => {
  // 启动浏览器（使用有界面模式）
  const browser = await chromium.launch({
    headless: false  // 设置为false以显示浏览器界面
  });

  // 创建新的浏览器上下文
  const context = await browser.newContext();

  // 创建新页面
  const page = await context.newPage();

  // 导航到必应搜索
  await page.goto('https://www.bing.com');
  console.log('页面已加载');

  // 等待搜索框出现
  await page.waitForSelector('#sb_form_q');
  console.log('找到搜索框');

  // 在搜索框中输入文本
  await page.fill('#sb_form_q', 'Playwright automation');
  console.log('输入搜索内容');

  // 等待一秒，以便看到输入效果
  await page.waitForTimeout(1000);

  // 点击搜索按钮
  await page.click('#search_icon');
  console.log('点击搜索按钮');

  // 等待搜索结果加载
  await page.waitForSelector('#b_results');
  console.log('搜索结果已加载');

  // 获取第一个搜索结果的文本
  const firstResult = await page.textContent('#b_results > li:first-child');
  console.log('第一个搜索结果:', firstResult);

  // 等待5秒，以便查看结果
  await page.waitForTimeout(5000);
  console.log('等待5秒完成');

  // 截取页面截图
  await page.screenshot({ path: 'search-results.png' });
  console.log('截图已保存为 search-results.png');

  // 关闭浏览器
  await browser.close();
  console.log('浏览器已关闭');
})().catch(error => {
  console.error('运行过程中出现错误:', error);
  process.exit(1);
});