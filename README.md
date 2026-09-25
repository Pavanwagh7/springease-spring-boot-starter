# 🚀 SpringEase — Developer Productivity Toolkit for Spring Boot

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.4-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Build](https://img.shields.io/badge/Build-Passing-success.svg)]()
[![Status](https://img.shields.io/badge/Status-Active%20Development%20(v0.1)-blue.svg)]()

> A modular developer productivity toolkit and custom Spring Boot starter designed to eliminate repetitive boilerplate and accelerate backend engineering.

---

## 📌 The Problem
In almost every Spring Boot project, backend developers repeatedly write identical infrastructure code—such as standard JSON response envelopes, custom error handlers, input validation mappers, and file import/export utilities—before writing actual business logic.

## 💡 The Solution
**SpringEase** packages these common utilities into clean, reusable, auto-configured Spring Boot starter modules. Simply add the dependency to your project, and the infrastructure is ready out of the box with zero manual configuration.

---

## 🗺️ Roadmap & Modules

| Module | Status | Description |
| :--- | :---: | :--- |
| **Starter Foundation** | ✅ Done | Core modular starter layout and Maven dependency engine. |
| **API Response Starter** | 🚧 In Progress | Standardized generic `ApiResponse<T>` wrapper for all REST endpoints. |
| **Global Error Shield** | ⏳ Planned | Zero-code automated `@RestControllerAdvice` exception mapping. |
| **Validation Starter** | ⏳ Planned | Custom validation annotations (`@ValidPhone`, `@StrongPassword`). |
| **Excel Import Engine** | ⏳ Planned | Streamlined Apache POI mapper converting spreadsheets to Java POJOs. |
| **PDF Generator** | ⏳ Planned | Template-based dynamic PDF generation (receipts, reports, certificates). |

---

## 🛠️ Tech Stack
* **Language:** Java 17
* **Framework:** Spring Boot 3.3.4
* **Build Tool:** Maven (Wrapper enabled)
* **Validation:** Jakarta Bean Validation & Hibernate Validator
* **JSON Processing:** Jackson

---

## 🚀 Building Locally

Clone the repository and compile using the Maven wrapper:

```bash
git clone https://github.com/Pavanwagh7/springease-spring-boot-starter.git
cd springease-spring-boot-starter
./mvnw clean compile