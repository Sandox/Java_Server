                                        **Chuck Norris.io Server APP** 

Chuck Norri.io is a free JSON API for hand curated Chuck Norris facts.

** ACKNOWLEDGEMENTS**

The App is constructed using Spring Boot, and a Spring Class named Rest Template to get data from the chucknorris.io

Branches

The branch named master contains the source code for the entire application

LANGUAGES AND FRAMEWORKS
This project created in Java with a combination of Spring boot framework to accomplish task 

**INSTALLATION** 

Fork the Repository
Fork the Spring Boot Fundamentals repository on GitHub. Clone the project to your host machine.

**DEPENDENCIES**

The project requires the following dependencies be installed on the host machine:

Java Development Kit 8 or later
Apache Maven 3 or later

**RUNNING**

The project uses Maven for build, package. The following Maven goals are the most commonly used.

spring-boot:run
The spring-boot:run Maven goal performs the following workflow steps:

compiles Java classes to the /target directory
copies all resources to the /target directory
starts an embedded Apache Tomcat server

**_To execute the spring-boot_**:run Maven goal, type the following command at a terminal prompt in the project base directory.
mvn spring-boot:run

**PACKAGES**

The package Maven goal performs the following workflow steps:

compiles Java classes to the /target directory
copies all resources to the /target directory
executes the unit test suites
produces unit test reports
prepares an executable JAR file in the /target directory
The package Maven goal is designed to prepare the application for distribution to server environments. The application and all dependencies are packaged into a single, executable JAR file.

To execute the package goal, type the following command at a terminal prompt in the project base directory.

mvn clean package
The application distribution artifact is placed in the /target directory and is named using the artifactId and version from the pom.xml file. To run the JAR file use the following command:

java -jar example-1.0.0.jar

**API DOCUMENTATION** 

Made use of Swagger for API Documentation and Testing of API's 