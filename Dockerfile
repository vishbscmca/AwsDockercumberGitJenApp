FROM java:8
EXPOSE 8080
ADD /target/spring-boot-cucumber-1.0.0-SNAPSHOT.war awsdockercucumweb.jar
ENTRYPOINT ["java","-jar","/awsdockercucumweb.jar"]