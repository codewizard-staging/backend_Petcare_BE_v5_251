FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend_Petcare_BE_v5_251 backend_Petcare_BE_v5_251
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend_Petcare_BE_v5_251/target/Petcare_BE_v5-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar Petcare_BE_v5-0.0.1-SNAPSHOT.jar"]