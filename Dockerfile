FROM eclipse-temurin:25
COPY target/KubeDeployTest1-0.0.1-SNAPSHOT.jar kubedeploy.jar
ENTRYPOINT ["java","-jar","kubedeploy.jar"]