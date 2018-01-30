FROM openjdk:8
ADD target/employeeFinderMySQL.jar employeeFinderMySQL.jar
EXPOSE 9091
ENTRYPOINT ["java","-jar","employeeFinderMySQL.jar"]