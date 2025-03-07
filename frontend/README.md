# Tech Conference Management - Frontend

The **Tech Conference Management - Frontend** is a modern and interactive client-side application built with **React** and **JavaScript**. This project serves as the front-end interface for the TicketWave system, providing users with features such as event browsing, ticket booking, and user management. It utilizes **Vite** for fast builds and hot module replacement, ensuring a seamless development experience.


---

## Overview

The Tech Conference Management - Frontend is designed to deliver an intuitive and responsive user experience for the Ticketing system. It integrates with the backend via REST APIs, offering a streamlined workflow for users to explore events, manage bookings, and access personalized features.

---

## Features


1. **User Authentication**  
    Includes user registration, and session management.

2. **Event Browsing**  
    Allows users to view for events with detailed descriptions.

3. **Ticket Booking**  
    Enables seamless ticket booking with validation and error handling.

4. **Type Safety**  
    Built with TypeScript to enhance code quality and maintainability.

---

## Technologies Used

- **React**: A library for building user interfaces.
- **JavaScript**: For static type checking and better code maintainability.
- **Vite**: A fast build tool for modern front-end projects.
- **Rest API**: For HTTP requests and API integration.
- **React Router**: For handling client-side routing.
- **CSS**: Cascade Sysle Sheets for responsive, modern interfaces.

---

## Installation and Setup

### Prerequisites

- **Node.js (v18 or higher)**  
   Install Node.js from [Node.js Official Website](https://nodejs.org/).

- **Package Manager**  
   Either `npm` (comes with Node.js) or `yarn`.

### Setup Instructions

1. Navigate to the frontend directory
    ```bash
    cd frontend
    ```

2. Build the Docker image
    ```bash
    docker build -t tech-conference-frontend .
    ```

3. Run the Docker container 
    ```bash
    docker run -d -p 80:80 tech-conference-frontend
    ```



