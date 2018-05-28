# Java_project

##How to connect to local DataBase

####1.start a database(in this project I use mongoDB) service in local host with docker
> * 1.1 first you should run this in command docker 'run -p 27017:27017 -v $PWD/db:/data/db -d mongo' to start a mongodb service
> * 1.2 then you should run this 'docker run -it mongo mongo --host 172.17.0.1' to connect to the service which started in step 1

####2.config properties (in this project I use yml)
> * host: localhost
> * port: 27017
> * database: test
you can connect to the local mongoDB service after config this 3 properties

##How to exec shell command in docker container
> * docker exec -it container-name bash

