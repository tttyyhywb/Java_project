# Java_project

##About project
Database: Mongodb v3.6.4
Properties configuration: yaml
Gradle: 4.2.1
Checkstyle file path: ~/config/checkstyle

###About Dokcer
> * 'docker exec -it container-name bash' to connect the container then you can exec some shell command

###About MongoDb
> * 'db.adminCommand( { listDatabases: 1, nameOnly: true} )' to show all databases
> * 'db.system.users.find().pretty()' to show all users

###About MongoDb roles
all roles: 
> * Read: allow the user read the specified database
> * readWrite: allow the user to write data to specified database
> * dbAdmin: allow the user to exec management command,like create/delete index, check statistic, check system.profile
> * userAdmin: allow user insert data into system.users
> * dbOwner: owner of database, include readWrite、dbAdmin、userAdmin
> * clusterAdmin: only used in admin, allow the user copy or shard the database
> * readAnyDatabase: only used in admin, allow the user read all database
> * readWriteAnyDatabase: only used in admin, allow the user write to all database
> * userAdminAnyDatabase: only used in admin, give all userAdmin's authorities to user
> * dbAdminAnyDatabase: only used in admin, give all dbAdmin's authorities to user
> * root: only userd in admin. super user, super authorities

##How to connect to local DataBase

####1.start a database service in local host with docker
> * 1.1 first you should run this in command 'docker run -p 27017:27017 -v $PWD/db:/data/db -d mongo' to start a mongodb service
> * 1.2 then you should run this 'docker run -it mongo mongo --host 172.17.0.1' to connect to the service which started in step 1

####2.config properties (in this project I use yml)
> * host: localhost
> * port: 27017
> * database: test
you can connect to the local mongoDB service after config this 3 properties

####3.authentication
> * 3.1 use 'db.createUser()' method to add a user to the specified database(remember to switch to the database with command 'use database-name'')
> * 3.2 enable authentication with command 'mongod --auth'
> * 3.3 use 'db.stopServer()' to stop service
> * 3.4 restart the mongodb service with 'run -p 27017:27017 -v $PWD/db:/data/db -d mongo --auth'
> * 3.5 and now if you want to do something in database you should auth(db.auth('username','password')) firstly and have the rights
> * 3.6 then you should config another 2 properties (username , password) 

##How to exec shell command in docker container
> * docker exec -it container-name bash
