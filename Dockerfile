FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} target/role_management-0.0.1-SNAPSHOT.jar
ADD target/role_management-0.0.1-SNAPSHOT.jar role_management-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","role_management-0.0.1-SNAPSHOT.jar"]

#To Build Image:
#$docker build -f Dockerfile -t chk-tmp-1st-role-mgmt .
#To Run:
#$docker run -p 8085:8085 chk-tmp-1st-role-mgmt