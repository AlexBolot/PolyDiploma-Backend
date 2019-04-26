#!/bin/bash

# step #1: configure the bank.properties file
mkdir -p ./WEB-INF/classes/
touch ./WEB-INF/classes/mail.properties
touch ./WEB-INF/classes/university.properties
touch ./WEB-INF/classes/bank.properties
echo "mailHostName=$bank_host" >> ./WEB-INF/classes/mail.properties
echo "mailPortNumber=$bank_port" >> ./WEB-INF/classes/mail.properties
echo "universityHostName=$university_host" >> ./WEB-INF/classes/university.properties
echo "universityPortNumber=$university_port" >> ./WEB-INF/classes/university.properties
echo "bankHostName=$bank_host" >> ./WEB-INF/classes/bank.properties
echo "bankPortNumber=$bank_port" >> ./WEB-INF/classes/bank.properties

# step #2: update the webapp to load the right properties
jar uvf ./webapps/polydiploma-backend.war ./WEB-INF/classes/bank.properties ./WEB-INF/classes/mail.properties ./WEB-INF/classes/university.properties

# step #3: start the TomEE engine
catalina.sh run
