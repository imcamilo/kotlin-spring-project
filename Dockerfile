FROM java:8-jre-alpine

ADD /build/libs/api-info-people-1.0.0-RELEASE.jar /usr/local/api-info-people.jar

CMD ["java", "-jar", "/usr/local/api-info-people.jar"]