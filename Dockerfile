
FROM amazoncorretto:17-alpine-jdk
MAINTAINER tommy
COPY target/backend-0.0.1-SNAPSHOT.jar backend-0.0.1-SNAPSHOT.jar
entrypoint ["java","-jar","/backend-0.0.1-SNAPSHOT.jar"]
