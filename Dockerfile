# Use OpenJDK base image
FROM openjdk:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy application files
COPY App.java /app

# Compile the Java application
RUN javac App.java

# Run the application
CMD ["java", "App"]
