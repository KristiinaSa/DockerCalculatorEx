FROM maven:latest

LABEL author="Kristiina"

WORKDIR /app

COPY pom.xml /app/

COPY . /app/

RUN mvn package

CMD ["java", "target/calculator.jar"]

ENTRYPOINT ["java", "-jar", "target/calculator.jar"]