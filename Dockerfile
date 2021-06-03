FROM java:8
EXPOSE 8080
ADD /target/awsdockercucumgenjenapp-1.0.0-SNAPSHOT.war awsdockercucumgenjenapp.jar
ENTRYPOINT ["java","-jar","/awsdockercucumgenjenapp.jar"]