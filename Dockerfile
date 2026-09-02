FROM maven:3.9.7-eclipse-temurin-17 AS build

WORKDIR /build

COPY . .

RUN chmod +x mvnw && ./mvnw -B package -DskipTests

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /build/target/cicd-demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 5000

ENTRYPOINT ["java", "-jar", "app.jar"]
