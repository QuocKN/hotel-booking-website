# Sử dụng OpenJDK 17
FROM openjdk:17-jdk-slim

# Đặt thư mục làm thư mục chính
WORKDIR /app

# Copy file JAR vào container
COPY target/booking-0.0.1-SNAPSHOT.jar app.jar

# Chạy ứng dụng
CMD ["java", "-jar", "app.jar"]
