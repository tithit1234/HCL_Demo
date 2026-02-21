# Inventory Search API

## 📘 Overview
This project provides a REST API to search inventory items based on optional filter criteria.  
All parameters are optional and combined using **AND conditions**.

Tech stack:
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven/Gradle

---

## 📂 Project Structure
src/main/java/com/example/inventory/
├── controller        # REST endpoints
├── service           # Business logic
├── repository        # JPA repository
├── model             # Entity classes
├── dto               # Data Transfer Objects
├── specification     # Dynamic query filters
└── exception         # Error handling



---

## 🚀 Running the Project
1. Clone or download the project.
2. Run with Maven:
   ```bash
   mvn spring-boot:run


./gradlew bootRun





