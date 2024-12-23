# Wellness360

## Project Overview

Demonstation project for the Internship as described in the job description

## Features

- Task tracking system
- CRUD operations on the tasks
- Added security for authentication

## Technology Stack

- **Backend:** Spring Boot
- **Database:** Persisted in-memory
- **Build Tool:** Maven/Gradle


## Setup Instructions

### Prerequisites

- **Java Development Kit (JDK):** Version 11 or higher.
- **Maven/Gradle:** Ensure the project build tool is installed.
- **Auth Setup:** Configure the authentication as basic if required to test. Please comment the exclude path in main class:
  - (exclude = { SecurityAutoConfiguration.class }) 
  - The username and password are as specified in the `application.properties` file.
- **Git:** Clone the repository.

### Clone the Repository

```bash
git clone https://github.com/sumitsumo/wellness360.git
cd wellness360

open the pom.xml as a new project in any IDE of choice
