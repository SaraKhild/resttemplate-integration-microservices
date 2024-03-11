# Microservices Communication using RestTemplate

<br>

## Overview
In synchronous communication, the client sends a request and waits for a response from the service.And one of Synchronous Communication multiple Microservices is RestTemplate.<br> <br>
In this project, I have implemented department-service, user-service, and integration-service that communicate with these two Microservices. Besides that, I have separated the database for each Microservice.
 
 <br>
 
## Usages
- Spring Boot
- Lombok
- RestTemplate
- MySQL
    
<br> 

## Architecture of the Project

 ### 1-src folder
 
  - User
    - controller
    - model
    - dto
    - objectmapper
    - service
    - repository
    
  - Department
    - controller 
    - model 
    - models 
    - dto
    - objectmapper
    - service 
    - repository
    
  - Integration
    - client 
    - controller
    - model 
   
### 2-Maven pom.xml

  - User and Department pom.xml:

  ```
 <dependencies>
   <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
   </dependency>
</dependencies>
  ```

<br>

  - Integration pom.xml:
  
  ```
<dependencies>
  <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
   </dependency>
</dependencies>
  ```

### 3- User Application.properties.yml

```
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3312/db
spring.datasource.username=db
spring.datasource.password=nFLhPPKOnkW1FA1e
spring.jpa.show-sql=true

server.port = 8081

 ```

### 3- Department Application.properties.yml

```
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3312/db
spring.datasource.username=db
spring.datasource.password=nFLhPPKOnkW1FA1e
spring.jpa.show-sql=true

server.port = 8080

 ```
### 3- Integration Application.properties.yml

```
server.port = 8082

```
## Let's Start :mechanical_arm:

---
<br>

### Good Luck <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="30px"> 




