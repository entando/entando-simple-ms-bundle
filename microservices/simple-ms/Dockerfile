FROM openjdk:11

WORKDIR /app

COPY target/simple-ms.jar /app/simple-ms.jar

CMD ["java", "-Dserver.servlet.context-path=/", "-jar", "simple-ms.jar"]

EXPOSE 8081