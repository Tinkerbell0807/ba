FROM eclipse-temurin:17.0.9_9-jdk as build
WORKDIR /workspace/app

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY src src

RUN ./gradlew build -x test

FROM eclipse-temurin:17.0.9_9-jdk
WORKDIR /app
COPY --from=build /workspace/app/build/libs/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
