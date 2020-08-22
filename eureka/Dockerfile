FROM openjdk:8-jdk-alpine
VOLUME /temp
ARG JAR_FILE
ADD ${JAR_FILE} server.jar
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/server.jar"]