# Sử dụng Java 17 làm base image
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Copy file .jar vào container
COPY target/*.jar app.jar

# Expose cổng chạy ứng dụng
EXPOSE 8080

# Chạy ứng dụng
CMD ["java", "-jar", "app.jar"]
