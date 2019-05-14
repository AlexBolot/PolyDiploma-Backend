# Build ejbs

mvn clean install -f Pay
mvn clean install -f SuperviseParticipant
mvn clean install -f PlanCeremony
mvn clean install -f CommunicateWithHost
mvn clean install -f GetGraduated
mvn clean install -f AlumnWebService
mvn clean install -f OrganisationWebService
mvn clean install -f PayWebService

#Build clients
mvn clean package -f ClientCompta
mvn clean package -f ClientOrganisation
mvn clean package -f ClientAlum

# Build war

mvn clean package -f PolyDiploma


# Build external services

cd UniversityService.
bash ./compile.sh
cd MailService
bash ./compile.sh
cd BankService
bash ./compile.sh


# Setup files for DockerFile to works

mv ./UniversityService/university_server.exe ./UniversityService/docker/university_server.exe
mv ./BankService/bank_server.exe ./BankService/docker/bank_server.exe
mv ./MailService/mail_server.exe ./MailService/docker/mail_server.exe
mv ./PolyDiploma/target/polydiploma-backend.war ./PolyDiploma/docker/.

# Create docker images
docker build -t team-e-mail-service ./MailService/docker/DockerFile
docker build -t team-e-bank-service ./BankService/docker/DockerFile
docker build -t team-e-university-service ./UniversityService/docker/DockerFile
docker build -t team-e-polydiploma ./PolyDiploma/docker
