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

# Page snapshot

```yaml
- region "Skip to main content":
  - link "Skip to main content":
    - /url: "#__docusaurus_skipToContent_fallback"
- navigation "Main":
  - link "Playwright logo Playwright":
    - /url: /
    - img "Playwright logo"
    - text: Playwright
  - link "Docs":
    - /url: /docs/intro
  - link "API":
    - /url: /docs/api/class-playwright
  - button "Node.js"
  - link "Community":
    - /url: /community/welcome
  - link "GitHub repository":
    - /url: https://github.com/microsoft/playwright
  - link "Discord server":
    - /url: https://aka.ms/playwright/discord
  - button "Switch between dark and light mode (currently dark mode)" [disabled] [pressed]:
    - img
  - button "Search (Command+K)": Search
- banner:
  - heading "Playwright enables reliable end-to-end testing for modern web apps." [level=1]
  - link "Get started":
    - /url: /docs/intro
  - link "Star microsoft/playwright on GitHub":
    - /url: https://github.com/microsoft/playwright
    - text: Star
  - link "72k+ stargazers on GitHub":
    - /url: https://github.com/microsoft/playwright/stargazers
    - text: 72k+
- main:
  - img "Browsers (Chromium, Firefox, WebKit)"
  - heading "Any browser • Any platform • One API" [level=3]
  - paragraph: Cross-browser. Playwright supports all modern rendering engines including Chromium, WebKit, and Firefox.
  - paragraph: Cross-platform. Test on Windows, Linux, and macOS, locally or on CI, headless or headed.
  - paragraph:
    - text: Cross-language. Use the Playwright API in
    - link "TypeScript":
      - /url: https://playwright.dev/docs/intro
    - text: ","
    - link "JavaScript":
      - /url: https://playwright.dev/docs/intro
    - text: ","
    - link "Python":
      - /url: https://playwright.dev/python/docs/intro
    - text: ","
    - link ".NET":
      - /url: https://playwright.dev/dotnet/docs/intro
    - text: ","
    - link "Java":
      - /url: https://playwright.dev/java/docs/intro
    - text: .
  - paragraph: Test Mobile Web. Native mobile emulation of Google Chrome for Android and Mobile Safari. The same rendering engine works on your Desktop and in the Cloud.
  - heading [level=3]
  - heading [level=3]
  - heading "Resilient • No flaky tests" [level=3]
  - paragraph: Auto-wait. Playwright waits for elements to be actionable prior to performing actions. It also has a rich set of introspection events. The combination of the two eliminates the need for artificial timeouts - the primary cause of flaky tests.
  - paragraph: Web-first assertions. Playwright assertions are created specifically for the dynamic web. Checks are automatically retried until the necessary conditions are met.
  - paragraph: Tracing. Configure test retry strategy, capture execution trace, videos, screenshots to eliminate flakes.
  - heading "No trade-offs • No limits" [level=3]
  - paragraph: Browsers run web content belonging to different origins in different processes. Playwright is aligned with the modern browsers architecture and runs tests out-of-process. This makes Playwright free of the typical in-process test runner limitations.
  - paragraph: Multiple everything. Test scenarios that span multiple tabs, multiple origins and multiple users. Create scenarios with different contexts for different users and run them against your server, all in one test.
  - paragraph: Trusted events. Hover elements, interact with dynamic controls, produce trusted events. Playwright uses real browser input pipeline indistinguishable from the real user.
  - paragraph: Test frames, pierce Shadow DOM. Playwright selectors pierce shadow DOM and allow entering frames seamlessly.
  - heading [level=3]
  - heading [level=3]
  - heading "Full isolation • Fast execution" [level=3]
  - paragraph: Browser contexts. Playwright creates a browser context for each test. Browser context is equivalent to a brand new browser profile. This delivers full test isolation with zero overhead. Creating a new browser context only takes a handful of milliseconds.
  - paragraph: Log in once. Save the authentication state of the context and reuse it in all the tests. This bypasses repetitive log-in operations in each test, yet delivers full isolation of independent tests.
  - heading "Powerful Tooling" [level=3]
  - paragraph:
    - link "Codegen.":
      - /url: docs/codegen
    - text: Generate tests by recording your actions. Save them into any language.
  - paragraph:
    - link "Playwright inspector.":
      - /url: docs/debug#playwright-inspector
    - text: Inspect page, generate selectors, step through the test execution, see click points, explore execution logs.
  - paragraph:
    - link "Trace Viewer.":
      - /url: docs/trace-viewer-intro
    - text: Capture all the information to investigate the test failure. Playwright trace contains test execution screencast, live DOM snapshots, action explorer, test source, and many more.
  - heading "Chosen by companies and open source projects" [level=2]
  - list:
    - listitem:
      - link "VS Code":
        - /url: https://code.visualstudio.com
        - img "VS Code"
    - listitem:
      - link "Bing":
        - /url: https://bing.com
        - img "Bing"
    - listitem:
      - link "Outlook":
        - /url: https://outlook.com
        - img "Outlook"
    - listitem:
      - link "Disney+ Hotstar":
        - /url: https://www.hotstar.com/
        - img "Disney+ Hotstar"
    - listitem:
      - link "Material UI":
        - /url: https://github.com/mui-org/material-ui
        - img "Material UI"
    - listitem:
      - link "ING":
        - /url: https://github.com/ing-bank/lion
        - img "ING"
    - listitem:
      - link "Adobe":
        - /url: https://github.com/adobe/spectrum-web-components
        - img "Adobe"
    - listitem:
      - link "React Navigation":
        - /url: https://github.com/react-navigation/react-navigation
        - img "React Navigation"
    - listitem:
      - link "Accessibility Insights":
        - /url: https://accessibilityinsights.io/
        - img "Accessibility Insights"
- contentinfo:
  - text: Learn
  - list:
    - listitem:
      - link "Getting started":
        - /url: /docs/intro
    - listitem:
      - link "Playwright Training":
        - /url: https://learn.microsoft.com/en-us/training/modules/build-with-playwright/
    - listitem:
      - link "Learn Videos":
        - /url: /community/learn-videos
    - listitem:
      - link "Feature Videos":
        - /url: /community/feature-videos
  - text: Community
  - list:
    - listitem:
      - link "Stack Overflow":
        - /url: https://stackoverflow.com/questions/tagged/playwright
    - listitem:
      - link "Discord":
        - /url: https://aka.ms/playwright/discord
    - listitem:
      - link "Twitter":
        - /url: https://twitter.com/playwrightweb
    - listitem:
      - link "LinkedIn":
        - /url: https://www.linkedin.com/company/playwrightweb
  - text: More
  - list:
    - listitem:
      - link "GitHub":
        - /url: https://github.com/microsoft/playwright
    - listitem:
      - link "YouTube":
        - /url: https://www.youtube.com/channel/UC46Zj8pDH5tDosqm1gd7WTg
    - listitem:
      - link "Blog":
        - /url: https://dev.to/playwright
    - listitem:
      - link "Ambassadors":
        - /url: /community/ambassadors
  - text: Copyright © 2025 Microsoft
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