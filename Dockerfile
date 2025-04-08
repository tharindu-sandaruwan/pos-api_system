FROM openjdk:17
LABEL maintainer="tharindusandaruwan011@gmail.com"
WORKDIR /app
COPY target/pos-app.jar /app/pos-app.jar
ENTRYPOINT ["java", "-jar", "pos-app.jar"]