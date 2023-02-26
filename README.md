
# SpringJPA Backend

This project contains the backend of a rental car system, developed using Java Spring Boot and Hibernate.

## Getting Started
These instructions will guide you on how to run the project on a local machine.

### Prerequisites
To run this project, you need to have the following installed:
- Java 8 or higher
- Maven
- PostgreSQL

 ### Installation
 * Clone this repository to your local machine:
```bash
git clone https://github.com/yemreturker/SpringJPABackend.git
```
* Navigate to the project directory in your terminal:
```bash
cd SpringJPABackend
```
* Open src/main/resources/application.properties and update the following properties with your [PostgreSQL](https://jdbc.postgresql.org/) Server details:
```properties
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.hibernate.show-sql=true
spring.datasource.url=jdbc:postgresql://localhost:5432/{project_name}
spring.datasource.username=username
spring.datasource.password=password
spring.jpa.properties.javax.persistence.validation.mode = none
```
* Run the following command to start the application:
```bash
mvn spring-boot:run
```
The application will run on [LOCALHOST](http://localhost:8080) once it is successfully started.
## Usage
This project includes features for a rental car system, which include:
* Customers can register to the system and login.
* Customers can search for available cars to rent by date and location.
* Customers can make reservations for a car.
* Admins can manage the car inventory, including adding and deleting cars, and updating their details.
## Contributing
Contributions are welcome. If you have any questions or suggestions about the project, please create an issue on GitHub or submit a pull request.
## License
This project is licensed under the [MIT License](https://choosealicense.com/licenses/mit/).
## Authors and Acknowledgments
This project was developed as part of [Engin Demirog](https://github.com/engindemirog)'s Java Camp.
## Contact
If you have any questions or feedback about the project, please [create an issue on GitHub](https://github.com/yemreturker/SpringJPABackend/issues) or [send an email](mailto:yemreturker@outlook.com).
