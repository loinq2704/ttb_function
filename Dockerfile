FROM maven
WORKDIR /usr/src/app
COPY pom.xml .
RUN mvn -B -e -C -T 1C org.apache.maven.plugins:maven-dependency-plugin:3.1.2:go-offline
COPY . .
#RUN mvn -B -e -o -T 1C verify
RUN mvn clean install
RUN mvn -f pom.xml clean compile package
#ADD target/demo.jar demo.jar
ENTRYPOINT ["java", "-jar","target/demo.jar"]
EXPOSE 9999