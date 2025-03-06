# Parcial Apps Empresariales

This project is a business application using MySQL as the database and Adminer for database management. Below are the steps to set up and run the project.

---

## Prerequisites

- **JDK 21**: Ensure JDK 21 is installed.
- **Maven**: Ensure Maven is installed.
- **Docker**: Docker and Docker Compose must be installed.

---

## Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/parcial_apps_empresariales.git
   cd parcial_apps_empresariales
Start Services with Docker Compose:

bash
Copy
docker-compose up -d
This will start MySQL and Adminer containers in the background.

Access Services
MySQL:

Host: localhost

Port: 5500

User: root (or as configured in Dockerfile)

Password: password (or as configured in Dockerfile)

Adminer:

Open your browser and go to: http://localhost:8000

Enter MySQL credentials to access the database.

Run the Application
Build the Application:

bash
Copy
mvn clean install
Run the Application:

bash
Copy
mvn spring-boot:run
Stop Services
To stop the Docker containers, run:

bash
Copy
docker-compose down
Project Structure
src/: Contains the application source code.
port:4500

docker-compose.yml: Configuration file for MySQL and Adminer services.

README.md: This file with setup and running instructions.