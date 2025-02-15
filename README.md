# Backend_Traini8_RiyaSharma

## Creation Steps :

1. Building the initial scaffold from Spring Initializer
2. Opening this new project in an IDE. I used STS(Spring Tool Suite) for development of this project.
3. Inside the container package, create various other component packages.
4. I started with creating the controller first. The controller class of my project is placed within the controllers package.
5. Used the annotation "@RestController" for our InitialController class
6. Used the required @GetMapping and @PostMapping annotations for defining handlers in our controller for the APIs.
7. Created the entities TrainingCenters and Address inside entities package. This package is for POJO objects basically.
8. Created Service classes inside services package. These will interact with the InitialController to provide it with the required information.
9. Inside the repositories package, create an interface named TrainingCenterRepository. This repository will interact with the database and handle CRUD operations for TrainingCenter entities. Extend JpaRepository<TrainingCenter, Long> to get built-in database operations.
10. Open the application.properties file in src/main/resources and configure the MySQL database connection.

## Setup steps

1. Download and Install Prerequisites

-Java 17 or later
-Spring Tool Suite (STS) or IntelliJ IDEA
-Maven (to manage dependencies)
-MySQL Server (ensure it's running)
-Postman (to test APIs)

2. Clone or Initialize the Project :

   git clone https://github.com/your-repo/Backend_Traini8_RiyaSharma.git
   cd Backend_Traini8_RiyaSharma

3. Build the Project

   mvn clean install

4. Run the Application

   mvn spring-boot:run