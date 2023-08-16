#Use maven
FROM maven
WORKDIR /usr/src/app
COPY pom.xml .
RUN mvn -B -e -C -T 1C org.apache.maven.plugins:maven-dependency-plugin:3.1.2:go-offline
COPY . .
#build file .jar to run application
RUN mvn clean install
RUN mvn -f pom.xml clean compile package
ENTRYPOINT ["java", "-jar","target/demo.jar"]
EXPOSE 9999