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

  // 导航到网页
  await page.goto('https://www.bing.com');

  // 等待5秒，这样我们可以看到浏览器窗口
  await page.waitForTimeout(5000);

  // 关闭浏览器
  await browser.close();
})();