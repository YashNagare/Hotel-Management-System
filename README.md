# 🌟 Hotel Review System

A **Microservices-based Hotel Review System** built with **Spring Boot** to demonstrate structured, scalable, and modular service interaction. This project includes dedicated services for managing **Users**, **Ratings**, and **Hotels**, and is architected using **best practices of distributed systems**.

> ⚙️ Powered by **Spring Cloud**, integrated with **multiple databases**, and designed with **resilience, scalability, and centralized configuration** in mind.

---

## 🚀 Features

* 🔍 **Service Discovery** using **Eureka**
* 🔐 **Centralized Configuration** via **Spring Cloud Config Server**
* 🌐 **API Gateway** as the unified entry point
* 👤 **User Service** with MySQL backend
* ⭐ **Rating Service** with MongoDB backend
* 🏨 **Hotel Service** with PostgreSQL backend
* 💪 **Resilience** with Circuit Breaker, Retry & Rate Limiting using **Resilience4j**
* 🤝 Inter-service communication using **Feign Client** and **RestTemplate**

---

## 💠 Technologies Used

| Category          | Technology                 |
| ----------------- | -------------------------- |
| Backend Framework | Spring Boot                |
| Service Discovery | Eureka                     |
| Config Management | Spring Cloud Config        |
| API Gateway       | Spring Cloud Gateway       |
| Databases         | MySQL, MongoDB, PostgreSQL |
| Communication     | Feign Client, RestTemplate |
| Resilience        | Resilience4j               |
| Config Storage    | GitHub                     |

---

## 🗂️ Microservices Overview

### 📘 1. **Service Registry**

* **Port:** `8761`
* **Purpose:** Dynamic discovery of services using **Eureka**
* **URL:** [`http://localhost:8761`](http://localhost:8761)

### ⚙️ 2. **Config Server**

* **Port:** `8085`
* **Repository:** GitHub (stores all `application.yml`)
* **Purpose:** Centralized configuration management
* **URL:** [`http://localhost:8085`](http://localhost:8085)

### 🚪 3. **API Gateway**

* **Port:** `8084`
* **Purpose:** Routes external client requests to appropriate services with optional security
* **URL:** [`http://localhost:8084`](http://localhost:8084)

### 👤 4. **User Service**

* **Port:** `8081`
* **Database:** MySQL
* **Purpose:** Manages user profiles and fetches related ratings and hotels
* **URL:** [`http://localhost:8081`](http://localhost:8081)

### 🌟 5. **Rating Service**

* **Port:** `8083`
* **Database:** MongoDB
* **Purpose:** Handles user ratings, connects with Hotel Service
* **URL:** [`http://localhost:8083`](http://localhost:8083)

### 🏨 6. **Hotel Service**

* **Port:** `8082`
* **Database:** PostgreSQL
* **Purpose:** Provides hotel details
* **URL:** [`http://localhost:8082`](http://localhost:8082)

---

## ▶️ How to Run the Project

1. ✅ **Start Databases**

   * MySQL
   * MongoDB
   * PostgreSQL

2. ✅ **Start Eureka Server**

   * Visit: [`http://localhost:8761`](http://localhost:8761)

3. ✅ **Start Config Server**

   * Ensure GitHub config repo access
   * Visit: [`http://localhost:8085`](http://localhost:8085)

4. ✅ **Start API Gateway**

   * Visit: [`http://localhost:8084`](http://localhost:8084)

5. ✅ **Start Microservices**

   * **UserService**: [`http://localhost:8081`](http://localhost:8081)
   * **RatingService**: [`http://localhost:8083`](http://localhost:8083)
   * **HotelService**: [`http://localhost:8082`](http://localhost:8082)

---

## 🤝 Contributing

We welcome contributions! 🎉

* Fork the repository
* Create your branch: `git checkout -b feature-name`
* Commit your changes: `git commit -m 'Add some feature'`
* Push to the branch: `git push origin feature-name`
* Submit a **Pull Request**

---

## 🌟 Show your support!

If you like this project, don’t forget to give it a ⭐ on GitHub!

<p align="left">
  <img src="https://forthebadge.com/images/badges/built-with-love.svg" height="28">
  <img src="https://forthebadge.com/images/badges/made-with-java.svg" height="28">
</p>
