FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD AxisServiceRCE.jar app.jar
EXPOSE 8087
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
