FROM java:8-jre-alpine

ADD /build/libs/kt-start-1.0.0-SNAPSHOT.jar /usr/local/kt-start.jar

CMD ["java", "-jar", "/usr/local/kt-start.jar"]