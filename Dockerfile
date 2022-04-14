FROM openjdk:8-jdk-alpine
# Take the jarfile from the target folder.
ADD target/role_management.jar role_management.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","role_management.jar"]

#ilern docker commands:-

#1. To Build the docker image using Dockerfile with above content.
#$docker build -f Dockerfile -t role_management_image .

#2. To run the container application.
#$docker run -p 8082:8085 role_management_image
#$docker run --name role-management-container-app  -p 8082:8085  role_management_image
#$docker run --name role-management-container-app --network=ilern_network -p 8082:8085 role_management_image

#3. Postgress setup & run through the container
#docker pull postgres
#docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres
#docker run --name postgresql -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password -p 5480:5432 -v /Users/gkumar12/Documents/ilern/database_ilern:/var/lib/postgresql/data -d postgres
#docker start postgresqldb
#docker stop postgresqldb

#4. pgadmin setup & run
#docker pull dpage/pgadmin4:latest
#docker run --name my-pgadmin -p 82:80 -e 'PGADMIN_DEFAULT_EMAIL=user@domain.local' -e 'PGADMIN_DEFAULT_PASSWORD=postgresmaster'-d dpage/pgadmin4

#5. Other docker commands
# 1677  docker -ps
# 1678  docker ps -a
# 1681  docker stop d59c8f824b30
# 1683  docker kill d59c8f824b30
# 1684  docker rm d59c8f824b30
# 1686  docker run --name postgresql -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password -p 5480:5432 -v /Users/gkumar12/Documents/ilern/database_ilern:/var/lib/postgresql/data -d postgres
# 1691  docker network create ilern_network
# 1693  docker network connect ilern_network postgresql
# 1695  docker network inspect ilern_network
# 1698* docker run --network=ilern_network -p 8082:8085 role-management-container-app
# 1707  docker run --name postgresql -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password -p 5480:5432 -v /Users/gkumar12/Documents/ilern/database_ilern:/var/lib/postgresql/data -d postgres
# 1708  docker ps -a
# 1709  docker network connect ilern_network postgresql
# 1711  docker ps -a
# 1712  docker stop b91642d14e12