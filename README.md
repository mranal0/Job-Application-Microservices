# Job Application System – Monolithic to Microservices Journey  

This repository is part of my learning journey in **Spring Boot development**, where I’m building a complete application step by step, starting from a **monolithic architecture** and moving towards a **full microservices ecosystem**.  

---

## 📌 Current Stage – Monolithic Application  

Right now, the project is a **Spring Boot monolith** that contains three core components:  

- **Jobs** – Manage job postings.  
- **Companies** – Store company details and metadata.  
- **Reviews** – Allow users to submit and view company/job reviews.  

### ✅ Features Implemented  
- RESTful **HTTP endpoints** for CRUD operations on Jobs, Companies, and Reviews.  
- Connected to a **relational database** for persistence.  
- Runs on a single **Spring Boot server**, where all three modules are bundled together.  
- Basic **application structure** with services, controllers, and repository layers.  

### 📂 Tech Stack  
- **Spring Boot** (REST APIs, server)  
- **Spring Data JPA** (database interaction)  
- **PostgreSQL** (database)  
- **H2 Database** (for dev/testing)  

---

## 🎯 Next Step – Breaking the Monolith  

The next milestone is to **refactor this monolithic application into a microservices architecture**.  

Planned changes:  
- Split the app into independent services:  
  - **Job Service**  
  - **Company Service**  
  - **Review Service**  
- Introduce **inter-service communication** (starting with REST, later exploring Feign, Kafka, RabbitMQ, etc.).  
- Add **service discovery** with Eureka.  
- Centralize requests through an **API Gateway**.  
- Containerize services using **Docker** and orchestrate with **Kubernetes** in later stages.  

---

## 🛠️ Roadmap  

- [x] Build monolith with Jobs, Companies, Reviews  
- [ ] Convert monolith into microservices  
- [ ] Add API Gateway & Service Registry  
- [ ] Implement asynchronous communication with Kafka/RabbitMQ  
- [ ] Secure services with OAuth2/Keycloak  
- [ ] Deploy with Docker & Kubernetes  
- [ ] Add monitoring, tracing, and fault tolerance  

---

## 🚀 Why This Project?  

This project is **not just code**, but a structured **learning journey** covering:  
- Spring Boot basics → REST APIs → Databases  
- Scaling into **microservices architecture**  
- Modern practices: **Docker, Kubernetes, API Gateway, Eureka, Kafka, Config Server, Security, Monitoring**  

The end goal is to have a **full-stack application** with a **Spring Boot backend** and a **React frontend**, deployed and monitored like a production-grade system.  

---

## 🔗 Learning Source  

This implementation follows a **hands-on tutorial playlist** on Spring Boot Microservices development, covering everything from **monoliths to distributed systems**.  
