# First Example of Spring Boot

## USAGE

```bash
mvn install
java -jar target/hello-springboot-1.0-SNAPSHOT.jar
```

It will try to start a server at `127.0.0.1:8080`, and it will fail because of the MySQL connection.

Just open `src/main/resources/application.properties`, change the following lines according to your MySQL server:

```
spring.datasource.url=jdbc:mysql://127.0.0.1:3309/test
spring.datasource.username=root
spring.datasource.password=mysql-test
```

If you want the server listening to another port, say 8081, you can run
```bash
java -jar -Dserver.port=8081 target/hello-springboot-1.0-SNAPSHOT.jar
```

or add the following line to `src/main/resources/application.properties`:
```
server.port=8081
```

## Reference

  * Beginning Spring Boot 2 - Application and Microservices with the Spring Framework, 2017

