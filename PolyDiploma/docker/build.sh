#!/bin/bash

#Preparing environment
cd ..
echo "Compiling Polydiploma system"
mvn -q -DskipTests clean package
echo "Done"
cp ./target/polydiploma-backend.war ./docker/.

# building the docker image
cd ./docker/
docker build -t build -t team-e/polydiploma-backend .

# cleaning up the environment
rm -rf polydiploma-backend.war
