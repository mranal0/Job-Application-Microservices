[![Java 17](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Spring Boot 3.x](https://img.shields.io/badge/Spring%20Boot-3.x-green)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)](https://www.mysql.com/)
[![Docker](https://img.shields.io/badge/Docker-%230db7ed.svg?logo=docker&logoColor=white)](https://www.docker.com/)
[![Kubernetes](https://img.shields.io/badge/Kubernetes-%23326ce5.svg?logo=kubernetes&logoColor=white)](https://kubernetes.io/)

# 🚀 Job Portal: Monolith → Microservices

A hands-on showcase of building a scalable backend system—from a CRUD monolith to a full microservices ecosystem—using Spring Boot and cloud-native patterns.

---

## 🌟 Why This Project?
- **Personal Growth:** Gain end-to-end experience designing, refactoring, and optimizing a real-world Spring Boot application.  
- **Skill Showcase:** Demonstrate API design, data modeling, microservice decomposition, resilience patterns, and containerization.  
- **Industry Alignment:** Work with Spring Data JPA/MySQL, Eureka, Cloud Gateway, Resilience4J, Docker/Kubernetes—technologies widely adopted in the enterprise.

---

## ✨ Key Highlights
- Clean **layered architecture**: controllers → services → repositories  
- Domain-based **module separation** for easy microservice split  
- Centralized **error handling** & meaningful HTTP responses  
- Built-in **metrics** and **health checks** via Spring Actuator  
- Ready for **polyglot persistence** (MySQL, H2 dev profile, optional MongoDB)  
- Future-ready for **async messaging** with Kafka/RabbitMQ

---

## 🔍 Snapshot
| Phase           | Status         | Focus                                      |
|-----------------|----------------|--------------------------------------------|
| Monolith        | ✅ Completed    | CRUD APIs & persistence (Jobs, Companies, Reviews) |
| Microservices   | 🔄 In Progress  | Service decomposition & REST integration   |
| Resilience      | ⏳ Upcoming     | Circuit breakers, retries, metrics         |
| Deployment      | ⏳ Upcoming     | Docker & Docker-Compose, Kubernetes        |

---

## 🛠️ Tech Stack & Tools
- **Backend:** Java 17, Spring Boot 3.x  
- **Database:** Spring Data JPA, MySQL (H2 for local dev; MongoDB experiments)  
- **Cloud-Native:** Eureka (service discovery), Spring Cloud Gateway  
- **Resilience:** Resilience4J (timeouts, retries, circuit breakers)  
- **Observability:** Spring Actuator, Micrometer, Prometheus/Grafana  
- **Containers:** Docker, Docker Compose, Kubernetes (future)  
- **Messaging (future):** Apache Kafka, RabbitMQ  

---

## 🗺️ Roadmap — Tick as I Progress
### 🏗️ Monolith  
- [x] Scaffold controllers, services, repositories  
- [x] CRUD endpoints for Jobs, Companies, Reviews  
- [x] Data persistence with Spring Data JPA + MySQL  

### 🔄 Microservices Transition  
- [ ] Split into **job-service**, **company-service**, **review-service**  
- [ ] RESTful inter-service communication (WebClient / Feign)  
- [ ] Service Discovery via **Eureka**  
- [ ] Central API Gateway (Spring Cloud Gateway)  

### ⚙️ Resilience & Observability  
- [ ] Timeouts, retries, circuit breakers (Resilience4J)  
- [ ] Monitoring & dashboards (Actuator, Micrometer, Prometheus)  

### 🐳 Containerization & Deployment  
- [ ] Dockerize each service & gateway  
- [ ] Define multi-service orchestration with Docker Compose  
- [ ] Explore Kubernetes manifests & Helm charts  

---

## 📫 Connect with Me
- GitHub: [mranal0](https://github.com/mranal0)  
- LinkedIn: [mranal0](https://www.linkedin.com/in/mranal0)  

---

> _This README evolves as the project grows. every stage is saved in the form of release   
