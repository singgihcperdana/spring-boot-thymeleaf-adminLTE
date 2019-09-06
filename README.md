# 项目简介
&emsp;&emsp;Spring Boot 整合基于 Bootstrap 的后端框架 AdminLTE（已汉化）,模版引擎使用 Thymeleaf，便于快速开发 

![](https://img.shields.io/badge/Spring%20Boot-v2.1.6.RELEASE-brightgreen)
![](https://img.shields.io/badge/Bootstrap-AdminLTE-blue)
![](https://img.shields.io/badge/thymeleaf-v3.0.11.RELEASE-orange)

# templates 目录结构
```
├── UI
├── charts
├── forms
├── commons
├── orders
├── separate
├── tables
└── travelogue
```
- `UI`：UI 组件
- `charts`：图表
- `forms`：表单
- `commons`：公共碎片，通过 thymeleaf 标签引入头部导航条，左侧导航条，页脚，css 及 js 文件
- `orders`：订单
- `separate`：抽离部分内容，或许你会用到
- `tables`：表格
- `travelogue`：游记

# 相关参考
- [AdminLTE](https://github.com/ColorlibHQ/AdminLTE)