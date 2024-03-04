FROM mcr.microsoft.com/java/jdk:11-zulu-debian

# Install Maven
RUN apt-get update && apt-get install -y maven

# Set the working directory
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the app when the container launches
CMD ["mvn", "spring-boot:run"]