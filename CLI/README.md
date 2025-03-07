# TechConferenceManagement - Command Line Interface

TechConferenceManagement is a full-stack application with a Command Line Interface (CLI) for managing configurations, simulating events, and maintaining user data. It uses **Java** and **MySQL** for data storage.

## Features

1. **Add Configuration Parameters**
2. **Start Simulation**
3. **Stop Simulation**
---

## Technologies Used

- **Java**: Core programming language.
- **MySQL**: Relational database management system.
- **JDBC**: Java Database Connectivity for database interaction.
- **Maven**: Build automation tool for managing dependencies and builds.

---

## Installation and Setup

### Prerequisites
- **Java Development Kit (JDK 17 or higher)**
- **MySQL Server**
- **IDE (ex: IntelliJ IDEA, Eclipse, Visual Studio Code)**

### Setup Instructions

1. **Navigate to the Command Line Interface Folder**
   ```bash
   cd TechConferenceManagement/CLI
   ```
   
3. **Import the Project in Your IDE**
    - Open your preferred Java IDE (ex: IntelliJ IDEA, Eclipse, Visual Studio Code).
    - Import the project as a Maven project.

4. **Configuring the MySQL Database**
   - Update the database connection details in the `DatabaseConnector.java` file to reflect your MySQL setup:
   ```java
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE_NAME = "DATABASE_NAME";
    private static final String FULL_URL = URL + DATABASE_NAME + "?createDatabaseIfNotExist=true";
    private static final String USERNAME = "USERNAME";
    private static final String PASSWORD = "PASSWORD";
   ```
    - Steps:
        - Replace the `USERNAME`, `PASSWORD` and `DATABASE_NAME ` fields in the `DatabaseConnector.java` file.
        - The database will be created automatically if it does not already exist due to the `?createDatabaseIfNotExist=true` parameter.

5. **Run the Application**
    - Build the project using Maven.
    - Run the `Main.java` file to launch the application.

---

## Usage

1. Launch the application by running the `Main` class.
2. Follow the on-screen menu to perform operations:
    - Add configuration parameters.
    - Start simulations based on the users.
