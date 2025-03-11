MercadoLite es una API REST desarrollada con Java Spring Boot siguiendo el enfoque de Arquitectura Hexagonal (Ports & Adapters). Este proyecto simula una plataforma de comercio electrónico similar a MercadoLibre, permitiendo la gestión de usuarios, productos, órdenes y pagos. Utiliza PostgreSQL como base de datos y está estructurado para facilitar la escalabilidad y el mantenimiento.

🚀 Características principales
✅ Arquitectura Hexagonal (Separación de dominio, aplicación e infraestructura)
✅ Spring Boot 3.4.3 para desarrollo eficiente de APIs REST
✅ PostgreSQL como base de datos
✅ Spring Data JPA para persistencia
✅ HikariCP como pool de conexiones
✅ Maven como herramienta de construcción
✅ Controladores RESTful con @RestController
✅ Pruebas unitarias y de integración con JUnit

📦 Instalación y Configuración

1️⃣ Clonar el repositorio
git clone https://github.com/tu-usuario/mercadolite.git
cd mercadolite

2️⃣ Configurar PostgreSQL
Asegúrate de que PostgreSQL esté instalado y configurado. Luego, crea la base de datos:
CREATE DATABASE mercadolite;

3️⃣ Configurar application.properties
Edita src/main/resources/application.properties con las credenciales de PostgreSQL:

properties:
-------------------------------
spring.datasource.url=jdbc:postgresql://localhost:5432/mercadolite
spring.datasource.username=postgres
spring.datasource.password=123
spring.datasource.driver-class-name=org.postgresql.Driver

# Configuración de JPA
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
-------------------------------

4️⃣ Compilar y ejecutar la aplicación
mvn clean install
mvn spring-boot:run

📡 Endpoints REST
🔹 Usuarios
GET	/api/users	Obtener todos los usuarios
POST	/api/users	Crear un nuevo usuario

🔥 Tecnologías utilizadas
Java 23
Spring Boot 3.4.3
PostgreSQL
Spring Data JPA
Maven
JUnit
