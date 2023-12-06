FROM openjdk:21-jdk
EXPOSE 8080
ADD target/microservice-atelier1-0.0.1-SNAPSHOT.jar Condidat-MS-docker.jar
ENTRYPOINT ["java", "-jar", "Condidat-MS-docker.jar"]