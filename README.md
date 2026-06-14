<div align="center">

# My Cloud Drive

### 现代化文件管理网盘系统

一个基于 Spring Boot 4.x 的企业级文件管理网盘系统，支持分片上传、秒传、断点续传，采用 SPI 插件化存储架构。

<img src="https://img.shields.io/badge/Spring%20Boot-4.0.3-blue.svg" alt="Spring Boot">
<img src="https://img.shields.io/badge/Java-21-orange.svg" alt="Java 21">
<img src="https://img.shields.io/badge/React-19-blue.svg" alt="React 19">
<img src="https://img.shields.io/badge/license-Apache%202.0-blue.svg" alt="License">

</div>

---

> **声明**：本项目基于 [dromara/free-fs](https://github.com/dromara/free-fs) (Apache 2.0) 学习研究与二次开发，感谢原作者 [@xddcode](https://github.com/xddcode) 的优秀作品。

---

## 项目简介

My Cloud Drive 是一个前后端分离的企业级云盘系统，支持大文件分片上传、断点续传、秒传、十余种文件格式在线预览等功能。存储层通过 SPI 插件机制支持本地磁盘、MinIO、阿里云 OSS、七牛云 Kodo 等多种平台，一键切换。

---

## 技术栈

| 层级 | 技术 |
|------|------|
| 后端框架 | Spring Boot 4.0.3 |
| JDK | Java 21（全局虚拟线程） |
| ORM | MyBatis Flex |
| 认证鉴权 | Sa-Token + JWT |
| 数据库 | MySQL 8.0+ / PostgreSQL 14+ |
| 缓存 | Redis |
| 前端框架 | React 19 |
| 构建工具 | Vite 8 |
| UI | TailwindCSS 4 + Radix UI |
| 状态管理 | Zustand + TanStack Query |
| 包管理 | pnpm |

---

## 项目亮点

- **分片上传** — 大文件自动切片，支持断点续传，网络中断不重传
- **秒传机制** — 基于 MD5 校验，相同文件零传输完成上传
- **SPI 插件化存储** — 热插拔存储平台，本地 / MinIO / 阿里云 OSS / 七牛云 Kodo 等一键切换
- **SSE 实时推送** — 上传进度精确到分片级别，前端实时展示
- **RBAC 权限模型** — 用户 → 角色 → 权限三层控制，多工作空间隔离
- **策略模式预览** — 图片、文档、音视频、压缩包等十余种文件类型在线预览
- **Java 21 虚拟线程** — 全局启用虚拟线程，提升并发处理能力
- **国际化** — 中英文双语支持

---

## 功能模块

### 文件管理
- 分片上传、断点续传、秒传
- 文件/文件夹创建、重命名、移动、删除
- 十余种格式在线预览（图片、文档、音视频、代码、压缩包等）
- 文件分享（授权码分享 + 有效期）
- 回收站（批量还原、自动清理）
- 下载限速控制

### 存储平台
- 本地磁盘 | MinIO | 阿里云 OSS | 七牛云 Kodo | 华为云 OBS | S3 协议兼容

### 认证与权限
- 用户名密码登录 / 邮箱验证码登录
- Sa-Token + JWT 无状态认证
- RBAC 权限控制
- 多工作空间 + 成员管理

---

## 环境要求

- JDK >= 21
- Maven >= 3.8
- MySQL >= 8.0
- Redis
- Node.js >= 18（前端）

---

## 快速开始

### 1. 克隆项目

```bash
git clone https://github.com/Wayne0327Lim/my-cloud-drive.git
cd my-cloud-drive
```

### 2. 初始化数据库

```sql
CREATE DATABASE IF NOT EXISTS `free-fs` DEFAULT CHARACTER SET utf8mb4;
```

在 Navicat 中运行 `_sql/mysql/free-fs-new.sql`

### 3. 修改配置

编辑 `fs-admin/src/main/resources/application-dev.yml`，修改数据库密码、Redis 密码、本地存储路径。

### 4. 启动后端

```bash
mvn clean install -DskipTests
cd fs-admin
mvn spring-boot:run
```

访问 http://localhost:8080/swagger-ui.html

### 5. 启动前端

```bash
cd free-fs-frontend
pnpm install
pnpm dev
```

访问 http://localhost:5173

### 6. 登录

默认账号：**admin** / **admin**

---

## 学习记录

| 模块 | 内容 | 状态 |
|------|------|------|
| 分片上传 | init → check → chunk → merge 完整链路 | ✅ |
| 存储插件 | SPI 接口 + 多实现 + 动态切换 | ✅ |
| 认证登录 | Sa-Token + JWT + 登录策略 | 🟡 |
| RBAC 权限 | 用户 → 角色 → 权限 | ⬜ |
| 文件预览 | 十余种文件类型策略模式 | ⬜ |
| SSE 推送 | 上传进度实时通知 | ⬜ |
| 文件分享 | 授权码 + 有效期 | ⬜ |
| 回收站 | 逻辑删除 + 定时清理 | ⬜ |
| 工作空间 | 多租户数据隔离 | ⬜ |

---

## 新增功能

- 待补充

---

## License

Apache 2.0 © [dromara/free-fs](https://github.com/dromara/free-fs)
