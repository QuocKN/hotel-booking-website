# # Sử dụng Java 17 làm base image
# FROM openjdk:17-jdk-slim

# # Đặt thư mục làm việc trong container
# WORKDIR /app

# # Copy file .jar vào container
# COPY target/booking-0.0.1-SNAPSHOT.jar app.jar

# # Chạy ứng dụng
# CMD ["java", "-jar", "app.jar"]

# web: java -jar target/booking-0.0.1-SNAPSHOT.jar

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY ./target/booking-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]
