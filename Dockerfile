FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} target/role_management-0.0.1-SNAPSHOT.jar
ADD target/role_management-0.0.1-SNAPSHOT.jar role_management-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","role_management-0.0.1-SNAPSHOT.jar"]

#ilern docker commands:-
#To Build Image:
#$docker build -f Dockerfile -t chk-tmp-1st-role-mgmt .
#To Run:
#$docker run -p 8082:8085 chk-tmp-1st-role-mgmt
#docker run --network=ilern_network -p 8082:8085 chk-tmp-1st-role-mgmt
#--network=

#Postgress
#docker pull postgres
#docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres
#docker run --name postgresql -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password -p 5480:5432 -v /Users/gkumar12/Documents/ilern/database_ilern:/var/lib/postgresql/data -d postgres
#docker start postgresqldb
#docker stop postgresqldb

#pgadmin
#docker pull dpage/pgadmin4:latest
#docker run --name my-pgadmin -p 82:80 -e 'PGADMIN_DEFAULT_EMAIL=user@domain.local' -e 'PGADMIN_DEFAULT_PASSWORD=postgresmaster'-d dpage/pgadmin4