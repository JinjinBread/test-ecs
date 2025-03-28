# Dockerfile

# jdk17 Image Start
FROM openjdk:17

# 인자 설정
ARG JAR_FILE=build/libs/*.jar

# jar 파일 복제
COPY ${JAR_FILE} app.jar

# 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]