# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar app.jar



# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]