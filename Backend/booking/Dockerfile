# Sử dụng OpenJDK 17
FROM openjdk:17-jdk-slim

# Đặt thư mục làm thư mục chính
WORKDIR /app

# Sao chép toàn bộ file từ thư mục target vào container
COPY target/*.jar app.jar

# Chạy ứng dụng
CMD ["java", "-jar", "app.jar"]
