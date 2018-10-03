FROM java:8-jre

ADD ./target/Academic-0.0.1-SNAPSHOT.jar /usr/src/Academic-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "Academic-0.0.1-SNAPSHOT.jar"]

