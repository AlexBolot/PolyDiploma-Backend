FROM tomee:8-jdk-7.0.1-plus
MAINTAINER Hugo Ojvind Francois (hugo.ojvind.francois@gmail.com)

# Working inside the local TomEE system
WORKDIR /usr/local/tomee/

# Loading the executable server inside the image
COPY ./polydiploma-backend.war ./webapps/.

# Creating the tomee/eemot user to access to the web admin console
COPY ./resources/tomcat-user.xml ./conf/tomcat-users.xml

# Allow one to access to the manager from outside the container
COPY ./resources/manager-context.xml ./webapps/manager/META-INF/context.xml

# Configure the link to the external partners
ENV mail_host=localhost
ENV mail_port=9090
ENV university_host=localhost
ENV university_port=9091
ENV bank_host=localhost
ENV bank_port=9092

# Copy the startup script
COPY ./resources/start-polydiploma.sh .
RUN ["chmod", "u+x", "./start-polydiploma.sh"]

# Creating an health check verification to check TomEE status
HEALTHCHECK --interval=5s CMD curl --fail http://localhost:8080/ || exit 1

# exposing the 8080 port to support external connections
EXPOSE 8080

# Starting the service
ENTRYPOINT ["./start-polydiploma.sh"]
