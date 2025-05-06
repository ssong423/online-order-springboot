🛒 Online Order - Spring Boot E-Commerce System

A full-stack online shop system built with **Spring Boot**, **ReactJS**, and **Docker**, featuring secure user authentication, cart management, and order checkout functionality. This project demonstrates best practices in API design, layered architecture, and cloud deployment using AWS.

---

## ✨ Features

- ✅ **CRUD REST APIs** for user registration, cart operations, and order placement  
- 🔐 Authentication with **Spring Security** (session-based)  
- 💾 Data persistence using **Spring Data JDBC** with **PostgreSQL** on **AWS RDS**  
- 🧱 Clean layered architecture with **Controller–Service–Repository** pattern  
- ⚙️ Dependency Injection for testability and maintainability  
- 🌐 Front-end integration via **ReactJS** + **Ant Design**  
- 🐳 Fully **Dockerized** and deployed using **AWS App Runner** (with auto-scaling)

---

## 🧱 Tech Stack

- **Backend**: Java, Spring Boot, Spring Security, Spring Data JDBC  
- **Frontend**: ReactJS, Ant Design  
- **Database**: PostgreSQL (hosted on AWS RDS)  
- **DevOps**: Docker, AWS App Runner  
- **Build Tool**: Gradle

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Gradle
- Docker
- PostgreSQL

### Run Locally

```bash
# Build the project
./gradlew build

# Run with Spring Boot
./gradlew bootRun
Docker
bash
Copy
Edit
# Build Docker image
docker build -t online-order-app .

# Run the container
docker run -p 8080:8080 online-order-app
📁 Project Structure
css
Copy
Edit
src/
  └── main/
      ├── java/
      │   └── com.laioffer.onlineorder/
      │       ├── controller/
      │       ├── service/
      │       ├── repository/
      │       ├── model/
      │       └── OnlineOrderApplication.java
      └── resources/
          ├── application.yml
          └── database-init.sql
📦 Deployment
This app is containerized with Docker and deployed to AWS App Runner with auto-scaling support.
