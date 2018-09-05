FROM openjdk:8
ADD build/libs/docker-rest-service.jar docker-rest-service.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-rest-service.jar"]