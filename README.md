# 🛒 MercadoLite - API REST con Arquitectura Hexagonal en Spring Boot

**MercadoLite** es una API REST desarrollada con **Java Spring Boot** siguiendo el enfoque de **Arquitectura Hexagonal (Ports & Adapters)**.  
Este proyecto simula una plataforma de comercio electronico similar a MercadoLibre, permitiendo la gestion de usuarios, productos, ordenes y pagos.  
Utiliza **PostgreSQL** como base de datos y esta estructurado para facilitar la escalabilidad y el mantenimiento.

## 🚀 Caracteristicas principales

✅ **Arquitectura Hexagonal** (Separacion de dominio, aplicacion e infraestructura)  
✅ **Spring Boot 3.4.3** para desarrollo eficiente de APIs REST  
✅ **PostgreSQL** como base de datos  
✅ **Spring Data JPA** para persistencia  
✅ **HikariCP** como pool de conexiones  
✅ **Maven** como herramienta de construccion  
✅ **Controladores RESTful** con `@RestController`  
✅ **Pruebas unitarias y de integracion** con JUnit  

---

## 📦 Instalacion y Configuracion

### 1️⃣ Clonar el repositorio
```sh
git clone https://github.com/alanium/java-project-hexagonal-architecture.git
cd mercadolite
```

### 2️⃣ Configurar PostgreSQL
Asegurate de que PostgreSQL este instalado y configurado. Luego, crea la base de datos:
```sql
CREATE DATABASE mercadolite;
```

### 3️⃣ Configurar `application.properties`
Edita `src/main/resources/application.properties` con las credenciales de PostgreSQL:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/mercadolite
spring.datasource.username=postgres
spring.datasource.password=123
spring.datasource.driver-class-name=org.postgresql.Driver

# Configuracion de JPA
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4️⃣ Compilar y ejecutar la aplicacion
```sh
mvn clean install
mvn spring-boot:run
```

---

## 📡 Endpoints REST

### 🔹 Usuarios
| Metodo | Endpoint       | Descripcion                |
|--------|---------------|----------------------------|
| GET    | `/api/users`  | Obtener todos los usuarios |
| POST   | `/api/users`  | Crear un nuevo usuario     |

(Agregar mas endpoints segun el desarrollo...)

---

## 🔥 Tecnologias utilizadas
- **Java 23**
- **Spring Boot 3.4.3**
- **PostgreSQL**
- **Spring Data JPA**
- **Maven**
- **JUnit**

---

## 📜 Licencia
Este proyecto esta bajo la licencia **MIT**.