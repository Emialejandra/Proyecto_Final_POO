#  API REST (Estudiante)

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.2-brightgreen)
![Java](https://img.shields.io/badge/Java-21-orange)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)


Este proyecto es una **API REST** robusta desarrollada para la gestión de un registro de Estudiantes , permitiendo agregar, modificar, buscar e eliminar un estudiante.

## Integrantes
* **Arias Ariel**
* **Tana Emilia**
* *Escuela de Formación de Tecnólogos (ESFOT) - EPN*

---

##  Características del Proyecto
- **Arquitectura MVC:** Separación clara entre Controlador, Servicio y Repositorio.
- **CRUD Completo:** Operaciones de creación, lectura, actualización y eliminación de registros.
- **Validación de Datos:** Uso de anotaciones para garantizar la integridad de la información (Email, edad mínima, campos obligatorios).
- **Documentación Interactiva:** Implementación de **Swagger UI** para pruebas directas desde el navegador.
- **Persistencia de Datos:** Conectividad con MySQL mediante JPA/Hibernate.

---

##  Estructura del Proyecto (MVC)

El proyecto está organizado siguiendo las mejores prácticas de Spring Boot, separando las responsabilidades en capas lógicas:

```text
src/main/java/com/api/estudiante/
├── 📁 controller/       
│   └── EstudianteController.java
├── 📁 service/         
│   └── EstudianteService.java
├── 📁 repository/     
│   └── EstudianteRepository.java
├── 📁 model/            
│   └── Estudiante.java
└── 📁 dto/            
    └── EstudianteDTO.java
 ```

---
##  Tecnologías Utilizadas
- **Backend:** Java 21 & Spring Boot 3.4.2.
- **Base de Datos:** MySQL Server 8.0.
- **Gestión de Dependencias:** Maven.
- **Documentación:** SpringDoc OpenAPI (Swagger).
- **Pruebas de API:** Postman.

---

##  Configurar la Base de Datos

- spring.datasource.url=jdbc:mysql://localhost:3306/nombre_tu_bd
- spring.datasource.username=tu_usuario
- spring.datasource.password=tu_contraseña
- spring.jpa.hibernate.ddl-auto=update

## Documentación de la API (Swagger)

Una vez que el servidor esté corriendo, puedes acceder a la interfaz interactiva en: 
 http://localhost:8080/swagger-ui/index.html

## Pruebas con Postman

El proyecto incluye un informe detallado que cubre:

-- **Análisis y Modelado:** Diagramas ER y estructura de datos.

-- **Seguridad:** Manejo de roles y acceso controlado.

## Video YouTube
https://youtu.be/HFLgB4wnF5A  

## ⚙️ Configuración e Instalación

### Clonar el repositorio
```bash
git clone [https://github.com/Arielpassw/Base_Datos.git](https://github.com/Arielpassw/Base_Datos.git)
