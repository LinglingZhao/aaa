# Playwright 测试项目

本项目包含使用Playwright进行自动化测试的示例和配置。

## 目录结构

```
test/playwright/
├── tests/                  # 测试文件目录
│   └── github.spec.ts      # GitHub搜索测试
├── screenshots/            # 截图输出目录
├── browser-advanced.js     # 高级浏览器自动化示例
├── browser-interactive.js  # 交互式浏览器自动化示例
├── browser.js             # 基础浏览器自动化示例
└── playwright.config.ts    # Playwright配置文件
```

## 可用命令

```bash
# 运行所有测试
npm test

# 运行测试（有浏览器界面）
npm run test:headed

# 在UI模式下运行测试
npm run test:ui

# 查看测试报告
npm run report
```

## 示例脚本

1. **browser.js** - 基础示例
   - 演示如何启动浏览器
   - 访问网页
   - 基本等待操作

2. **browser-interactive.js** - 交互示例
   - 表单填写
   - 按钮点击
   - 页面截图
   - 内容获取

3. **browser-advanced.js** - 高级示例
   - 多浏览器支持
   - 移动设备模拟
   - 网络请求拦截
   - 错误处理

## 配置说明

配置文件 `playwright.config.ts` 包含以下主要设置：
- 测试目录位置
- 截图输出目录
- 浏览器配置
- 并行执行设置
- 重试策略