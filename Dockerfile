FROM openjdk:11

COPY target/springboot-restapi-mysql.jar /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java","-jar","springboot-restapi-mysql.jar"]