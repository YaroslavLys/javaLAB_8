## Lab 9
### Task
 - Build REST service
 - Use JAX-RS
 - Create ArmamentController and implement GET/POST/PUT/DELETE
 - Check code with findbags/checkstyle/pmd plugins
 - Code from ArmamentController and RestApplication must be in different packages
 - Use Map for saving objects
 - modify your pom.xml

## To run server:
 - git clone 
 - Intellij IDEA: push 'RUN'
## Or:
 - Run `mvn compile`
 - Run `mvn package`
 - Run `java -cp target/LAB_2-1.0-SNAPSHOT.jar ua.lviv.iot.military_unit.Main` 

## For sending requests use this commands
 - GET : `curl -v http://localhost:8080/armament/1`
 - POST : `curl -v -d "name=name" http://localhost:8080/armament`
 - PUT : `curl -v -X PUT -d "name=newName http://localhost:8080/armament/1`
 - DELETE : `curl -v -X DELETE http://localhost:8080/armament/1`