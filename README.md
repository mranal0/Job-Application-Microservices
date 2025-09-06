# Job Application System – From Monolith to Microservices 🚀  

This repository documents my **learning journey with Spring Boot**, where I’m building a job application system step by step.  

The project starts as a **monolithic Spring Boot application** and will gradually evolve into a **modern microservices-based system**.  
I’m using this project as a playground to understand **backend architecture, databases, and distributed systems** in practice.  

---

## 📌 Current Stage – Monolithic Application  

Right now, the project is a **Spring Boot monolith**.  

### 🏗️ What does “monolith” mean?  
A **monolithic application** is a single, unified codebase where all the components of the system — Jobs, Companies, and Reviews — live together, run on the same server, and share the same database.  

It’s simple to build and run but comes with limitations when scaling or adding new features, which is why I’ll later migrate it into microservices.  

### ✅ Features Implemented (so far)  
- RESTful **HTTP endpoints** for:  
  - Creating, reading, updating, and deleting **Jobs**  
  - Managing **Companies**  
  - Submitting and viewing **Reviews**  
- A **MySQL database** for persistence (with future flexibility to use **MongoDB** for certain services if needed).  
- Organized into a standard **Spring Boot layered structure**: controllers → services → repositories.  
- A single **Spring Boot server** hosting the entire system.  

### 📂 Tech Stack  
- **Spring Boot** (backend framework)  
- **Spring Data JPA** (data persistence)  
- **MySQL** (primary database)  
- **MongoDB** (optional, for future learning/experiments)  

---

## 🎯 Next Step – Breaking the Monolith  

The next milestone is to refactor this into a **microservices architecture**, where each major module becomes its own independent service:  

- **Job Service** – manage job listings  
- **Company Service** – handle company data  
- **Review Service** – manage feedback and reviews  

Planned changes and learning goals:  
- Enable **inter-service communication** (first via REST, then exploring Feign Clients, WebClient, Kafka, RabbitMQ).  
- Add **Service Discovery** with Eureka.  
- Route all client requests through an **API Gateway**.  
- **Containerize** each service with Docker.  
- Explore orchestration with **Kubernetes** in later stages.  
- Improve **resilience, monitoring, and configuration management** as the system grows.  

---

## 🛠️ Roadmap (YDIS – Your Development in Steps)  

- [x] Build monolith with Jobs, Companies, Reviews  
- [ ] Convert monolith into microservices  
- [ ] Add API Gateway & Service Registry (Eureka + Spring Cloud Gateway)  
- [ ] Implement async messaging (Kafka / RabbitMQ)  
- [ ] Secure services with OAuth2/Keycloak  
- [ ] Containerize with Docker & deploy to Kubernetes  
- [ ] Add monitoring, tracing, and fault tolerance (Actuator, Zipkin, Micrometer, Resilience4J)  
- [ ] Integrate AI APIs for advanced features  

---

## 🚀 Why This Project Exists  

This is a **learning-first project**.  
I’m using it to:  
- Understand the **difference between monoliths and microservices**.  
- Learn how to design, build, and connect backend services.  
- Practice **databases (MySQL, MongoDB)** with Spring Boot.  
- Gain real-world exposure to **Docker, Kubernetes, and distributed systems concepts**.  
- Build towards a **production-ready, full-stack system** (Spring Boot backend + React frontend).  

---

## 🔗 Learning Source  

This project is inspired by a **hands-on video series on Spring Boot & Microservices**, which demonstrates how to go from a monolith to a distributed, enterprise-style system.  

