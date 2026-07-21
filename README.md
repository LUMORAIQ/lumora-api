# LUMORA API


> 🚧 Currently under active development

Backend service for **LUMORA**, an AI-Powered Decision Intelligence Platform.

LUMORA is a SaaS application that transforms business data into actionable insights through analytics and artificial intelligence.

> Enterprise SaaS Backend built with Spring Boot.
---

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

---

## Project Structure

```text
src/main/java/com/lumora

controller   - REST API endpoints
service      - Business logic
repository   - Data access layer
entity       - JPA entities
dto          - Data Transfer Objects
config       - Application configuration
exception    - Global exception handling
```

---

## Architecture

```text
Controller
    │
    ▼
Service
    │
    ▼
Repository
    │
    ▼
PostgreSQL
```

---

## Current Status

✅ Project structure

✅ Database connection

✅ JPA entities

✅ Entity relationships

✅ Spring Data JPA repositories

✅ Service layer

⬜ REST API

⬜ Swagger / OpenAPI

⬜ Security (JWT)

---

## Run

```bash
mvn spring-boot:run
```

---

## Author

**Sonia Francella Rojas Castillo**

Founder of **LUMORAIQ**