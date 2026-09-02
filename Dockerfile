FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/cicd-demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 5000

ENTRYPOINT ["java", "-jar", "app.jar"]
