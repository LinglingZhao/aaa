const { chromium, firefox, webkit } = require('playwright');

async function runDemo(browserType, browserName) {
  console.log(`\n=== 使用 ${browserName} 运行演示 ===`);
  
  const browser = await browserType.launch({
    headless: false
  });

  // 创建上下文
  const context = await browser.newContext({
    viewport: { width: 1280, height: 720 },
    userAgent: 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) Playwright Demo'
  });

  // 监听所有页面的控制台消息
  context.on('page', async page => {
    page.on('console', msg => {
      console.log(`页面控制台 [${msg.type()}]: ${msg.text()}`);
    });
  });

  // 创建页面
  const page = await context.newPage();

  try {
    // 1. 基本导航
    console.log('正在导航到测试页面...');
    await page.goto('https://www.bing.com');
    
    // 2. 执行搜索
    console.log('执行搜索操作...');
    await page.fill('#sb_form_q', 'Playwright automation testing');
    await page.click('#search_icon');
    
    // 3. 等待并获取结果
    await page.waitForSelector('#b_results');
    const searchResults = await page.$$eval('#b_results > li', 
      elements => elements.slice(0, 3).map(el => el.textContent.trim())
    );
    console.log('前3个搜索结果:', searchResults);

    // 4. 截图
    console.log('保存截图...');
    await page.screenshot({ 
      path: `search-${browserName}.png`,
      fullPage: true 
    });

    // 5. 模拟移动设备
    console.log('切换到移动设备模式...');
    await context.close();
    const mobileContext = await browser.newContext({
      ...require('playwright').devices['iPhone 12']
    });
    const mobilePage = await mobileContext.newPage();
    await mobilePage.goto('https://www.bing.com');
    await mobilePage.screenshot({ 
      path: `mobile-${browserName}.png` 
    });
    await mobileContext.close();

    // 6. 网络请求拦截
    const newContext = await browser.newContext();
    const newPage = await newContext.newPage();
    await newPage.route('**/*', route => {
      console.log(`拦截到请求: ${route.request().url()}`);
      route.continue();
    });
    await newPage.goto('https://www.bing.com');
    await newContext.close();

  } catch (error) {
    console.error(`在 ${browserName} 中运行时出错:`, error);
  } finally {
    // 关闭浏览器
    await browser.close();
    console.log(`${browserName} 演示完成`);
  }
}

// 运行所有浏览器的演示
(async () => {
  try {
    // 依次在不同浏览器中运行
    await runDemo(chromium, 'Chromium');
    await runDemo(firefox, 'Firefox');
    await runDemo(webkit, 'WebKit');
    
  } catch (error) {
    console.error('运行过程中出现错误:', error);
  }
  console.log('\n所有浏览器演示完成！');
})();