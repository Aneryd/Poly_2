# FROM openjdk
FROM maven:3.8.4-openjdk-17

COPY . .

# RUN mvn -f pom.xml

RUN mvn clean package

# RUN javac Polynoms.java

CMD ["java", "src/main.java.Polynoms.java"]
