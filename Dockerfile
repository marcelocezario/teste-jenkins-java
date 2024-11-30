FROM maven:3.9.9 as maven
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:21
COPY --from=maven /home/app/target/testejenkins-0.0.1-SNAPSHOT.jar /usr/local/lib/testejenkins.jar
VOLUME /tmp
EXPOSE 8081
ENTRYPOINT ["java","-jar","/usr/local/lib/testejenkins.jar"]