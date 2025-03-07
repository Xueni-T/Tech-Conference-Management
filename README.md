# Tech Conference Management System

The **Tech Conference Management System** is a full-stack application designed to handle the entire lifecycle of a tech conference, from session registration and seat reservations to role-based access control. This system is developed using **Java**, **Spring Boot**, **React**, **MySQL**, and **Redis** to provide a highly performant and scalable platform.

## Overview

This system provides comprehensive tools for conference organizers and participants. The **backend** is built with **Spring Boot** and utilizes **MySQL** for data storage and **Redis** for caching, enabling fast access to frequently requested data. The **frontend** is developed with **React** to offer an intuitive and interactive user experience.

---

## Features

- **Session Registration**  
    Users can register for conference sessions and receive real-time availability updates.
  
- **Seat Reservation**  
    Enables users to book available seats for sessions, with waitlist functionality.
  
- **Role-Based Access Control**  
    Different roles (admin, attendee) have access to different system functionalities.

- **Real-Time Data Updates**  
    Uses WebSocket for live updates on seat availability and session registration status.

- **JWT Authentication**  
    Secures the system using Spring Security and JWT for user authentication.

- **Redis Caching**  
    Redis is used to cache frequently accessed data, reducing server load and response times by 35%.

- **Docker Deployment**  
    The backend and frontend are both deployed in Docker containers for easy scalability and environment consistency.

---

## Technologies Used

- **Java**: Core language for the backend services.
- **Spring Boot**: Framework for creating stand-alone, production-grade Spring-based applications.
- **MySQL**: Relational database for storing session, seat, and user data.
- **Redis**: In-memory data structure store for caching frequently accessed data.
- **React**: JavaScript library for building user interfaces.
- **JWT (JSON Web Tokens)**: For user authentication and secure API communication.
- **Docker**: For containerization and deployment.
- **Nginx**: For serving the React frontend and reverse proxying API requests.

---

## Installation and Setup

### Prerequisites

- **Java Development Kit (JDK 17 or higher)**
- **MySQL Server**
- **Node.js (v18 or higher)**
- **Docker**  
   Follow the instructions on the [Docker official website](https://www.docker.com/get-started) to install Docker.

### Backend Setup Instructions

1. **Clone the Repository**  
   Clone the backend repository to your local machine:
   ```bash
   git clone https://github.com/Xueni-T/Tech-Conference-Management.git

2. **Build the Docker Image**
  Navigate to the frontend directory and build the Docker image:

  ```bash
  cd frontend
  docker build -t tech-conference-frontend .

3. **Run the Docker Container**
  Start the frontend application in a Docker container:
  ```bash
  docker run -d -p 80:80 tech-conference-frontend