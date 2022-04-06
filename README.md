Spring Guru Framework Chuck Norris Joke App
## Generates random Chuck Norris Joke
###### from Chuck Norris For Actuator maven repo

Generate app.jar file:
```
./mvnw package && java -jar target/chuck-jokes-spring-boot-docker-0.0.1-SNAPSHOT.jar
```
Create docker image:
```
docker build -t chuck-spring-boot-docker .
```
Run container:
```
docker -p 3000:8081 -d --name chuck-joke-app --rm chuck-spring-boot-docker 
```
