#Imagen base con java 21
FROM eclipse-temurin:21-jdk

#Directorio de trabajo dentro del contenedor
WORKDIR /app

#Copiar archivos del proyecto
COPY . .

#Construir el proyecto
RUN ./mvnw clean package -DskipTests

#Exponer el puerto
EXPOSE 8080

#Ejecutar el JAR
CMD ["java", "-jar", "target/curp-api-0.0.1-SNAPSHOT.jar"]