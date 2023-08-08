# Use a base image do OpenJDK
FROM openjdk:17-jdk-alpine

# Copie o arquivo JAR da aplicação para dentro do contêiner
COPY ./target/zero-to-deploy-0.0.1.jar /app/zeroToDeploy-backend.jar

# Defina o diretório de trabalho padrão
WORKDIR /app

# Defina o comando para executar a aplicação quando o contêiner iniciar
CMD ["java", "-jar", "zeroToDeploy-backend.jar"]
