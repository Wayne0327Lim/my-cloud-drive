<div align="center">

# My Cloud Drive

### 现代化文件管理网盘系统

一个基于 Spring Boot 4的企业级文件管理网盘系统，支持分片上传、秒传、断点续传，采用 SPI 插件化存储架构。

<img src="https://img.shields.io/badge/Spring%20Boot-4.0.3-blue.svg" alt="Spring Boot">
<img src="https://img.shields.io/badge/Java-21-orange.svg" alt="Java 21">
<img src="https://img.shields.io/badge/React-19-blue.svg" alt="React 19">
<img src="https://img.shields.io/badge/license-Apache%202.0-blue.svg" alt="License">

</div>

---

> **声明**：本项目基于 [dromara/free-fs](https://github.com/dromara/free-fs) (Apache 2.0) 学习研究与二次开发

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

## 新增功能

### AI 文件摘要

本次新增了轻量级 AI 文件摘要功能，用于在云盘场景中快速理解文本类文件内容。

#### 功能说明

- 在前端文件列表和网格视图中新增 `AI 摘要` 操作入口。
- 支持在弹窗中查看文件摘要、关键要点和标签。
- 摘要结果会持久化保存到 `file_ai_summary` 表，避免重复生成。
- 后端提供摘要查询和重新生成接口。
- 配置大模型 API Key 后，可调用 OpenAI-compatible Chat Completion 接口生成摘要。
- 未配置 API Key 时，会自动使用本地规则摘要兜底，方便本地演示和学习。

#### 当前支持的文件类型

第一版优先支持文本类文件，包括：

```text
txt, md, markdown, log, csv, json, xml, yaml, yml,
properties, ini, conf, java, js, jsx, ts, tsx, py,
sql, sh, bat, ps1, html, css, scss, vue
```

#### 后端接口

```http
GET  /apis/file/{fileId}/summary
POST /apis/file/{fileId}/summary/regenerate
```

#### 配置方式

可通过环境变量开启远程 AI 摘要：

```bash
FS_AI_SUMMARY_ENABLED=true
FS_AI_SUMMARY_API_KEY=你的 API Key
FS_AI_SUMMARY_ENDPOINT=https://api.openai.com/v1/chat/completions
FS_AI_SUMMARY_MODEL=gpt-4o-mini
```

如果 `FS_AI_SUMMARY_ENABLED` 为 `false`，或没有配置 API Key，系统会使用本地规则摘要模式。

---

## License

Apache 2.0 © [dromara/free-fs](https://github.com/dromara/free-fs)
