FROM openjdk:8
ADD target/api-rest.jar api-rest.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "api-rest.jar"]