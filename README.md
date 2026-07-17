# LUMORA API

Backend service for **LUMORA**, an AI-Powered Decision Intelligence Platform.

LUMORA is a SaaS platform designed to transform business data into actionable insights through analytics and artificial intelligence.

---

## Overview

LUMORA API is the backend application responsible for:

- REST API endpoints
- Business logic
- Data persistence
- Database communication
- Future AI service integration

---

## Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Git / GitHub

---

## Project Structure

```text
src/main/java/com/lumora

controller   - REST API endpoints
service      - Business logic layer
repository   - Database access layer
model        - Domain entities
dto          - Data Transfer Objects
config       - Application configuration
exception    - Error handling
```

---

## Architecture

The application follows a layered architecture:

```text
Controller
    |
    v
Service
    |
    v
Repository
    |
    v
Database
```

- **Controller:** Handles HTTP requests and REST endpoints.
- **Service:** Contains business rules and application logic.
- **Repository:** Manages database communication using Spring Data JPA.
- **Model:** Represents domain entities.

---

## Local Setup

### Requirements

- Java 17+
- Maven
- PostgreSQL

### Run Application

```bash
mvn spring-boot:run
```

---

## Current Status

Under active development.

Current focus:

- Backend foundation
- Database integration
- REST API development
- Application architecture

---

## Future Roadmap

- Authentication and authorization
- Business dashboard APIs
- Analytics services
- AI-powered insights
- Frontend integration

---

## Author

LUMORA IQ

AI-Powered Decision Intelligence Platform