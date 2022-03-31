FROM openjdk:8-jdk-alpine
COPY ./target/*.jar ./demo.jar
WORKDIR ./
RUN sh -c 'touch demo.jar'
ENTRYPOINT ["java","-jar","demo.jar"]