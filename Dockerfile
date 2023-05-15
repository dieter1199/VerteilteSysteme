# Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Add the application's jar to the container
ADD build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT ["java","-jar","/app.jar"]
