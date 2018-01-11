# SimpleCrudApp
A Java Spring Boot CRUD web API for students.

## Usage
* `GET http://www.localhost:8080/student` gets a list of students 
* `GET http://www.localhost:8080/student/{id}` gets a specific student
* `POST http://www.localhost:8080/student` creates a new student
* `PUT http://www.localhost:8080/student/{id}` updates an old student or creates a new student(if the student does not exist)
* `DELETE http://www.localhost:8080/student/{id}` deletes a specific student

## Setup Prerequisite
* Postgres 9.6+
* Java 8 SDK
* Spring STS (not required but ideal)

## Setup
1. Fork & Clone
2. Install the database provided in /database/db.tar and run it on your local machine
3. Load the project into Spring STS
4. Right click on the folder, mouse over Maven and then hit update project
5. A popup will appear but you just need to click OK
6. Run the Project and Enjoy

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details