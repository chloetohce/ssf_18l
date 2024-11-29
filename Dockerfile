FROM eclipse-temurin:23-jdk

LABEL maintainer="chloetohce"

WORKDIR /app

COPY ./mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

ENV PORT=8080

RUN chmod a+x ./mvnw && ./mvnw package -Dmaven.test.skip=true

EXPOSE ${PORT}

ENTRYPOINT SERVER_PORT=${PORT} java -jar target/ssf_17l-0.0.1-SNAPSHOT.jar