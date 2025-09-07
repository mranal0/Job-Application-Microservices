# Job Microservice

A Spring Boot microservice for managing job postings in the Job Application Platform.

## Overview
This microservice handles all job-related operations including creating, reading, updating, and deleting job postings.

## Features
- CRUD operations for jobs
- RESTful API endpoints
- MySQL database integration
- JPA/Hibernate for data persistence

## API Endpoints

### Base URL: `http://localhost:8082`

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/jobs`     | Get all jobs |
| POST   | `/jobs`     | Create a new job |
| GET    | `/jobs/{id}` | Get job by ID |
| PUT    | `/jobs/{id}` | Update job by ID |
| DELETE | `/jobs/{id}` | Delete job by ID |

## Request/Response Format

### Job Object
```json
{
    "id": 1,
    "title": "Software Engineer",
    "description": "Java Developer Position",
    "minSalary": 50000.0,
    "maxSalary": 80000.0,
    "location": "New York",
    "companyId": 1
}
```

## Configuration
- Port: 8082
- Database: jobms_db
- Profile: default

## Running the Application
```bash
mvn spring-boot:run
```

## Technology Stack
- Java 17
- Spring Boot 3.5.5
- Spring Data JPA
- MySQL 8
- Maven
