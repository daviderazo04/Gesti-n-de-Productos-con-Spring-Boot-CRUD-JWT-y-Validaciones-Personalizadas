# Gestión de Productos con Spring Boot CRUD, JWT, AWS y Validaciones Personalizadas

Este proyecto es una aplicación CRUD (Crear, Leer, Actualizar, Eliminar) para gestionar productos utilizando Spring Boot. Implementa autenticación mediante JWT y validaciones personalizadas para garantizar la integridad de los datos.

## Características

- **Gestión de productos**: Permite crear, leer, actualizar y eliminar productos.
- **Autenticación JWT**: Seguridad en la API mediante tokens JWT.
- **Validaciones personalizadas**: Asegura que los datos sean válidos antes de ser procesados.
- **Base de datos**: Configuración con MySQL.

## Tecnologías utilizadas

- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- Hibernate
- MySQL
- Maven

### Endpoints

- **Autenticación**
  - `POST /api/auth/login`: 
    - **Descripción**: Autenticación de usuarios.
    - **Body**: 
      ```json
      {
        "username": "tu_usuario",
        "password": "tu_contraseña"
      }
      ```

- **Productos**
  - `GET /api/products`: 
    - **Descripción**: Obtiene la lista de productos.
  - `POST /api/products`: 
    - **Descripción**: Crea un nuevo producto.
    - **Body**: 
      ```json
      {
        "nombre": "Nombre del producto",
        "descripcion": "Descripción del producto",
        "precio": 100.0,
        "sku": 1000
      }
      ```
  - `GET /api/products/{id}`: 
    - **Descripción**: Obtiene un producto por ID.
  - `PUT /api/products/{id}`: 
    - **Descripción**: Actualiza un producto existente.
    - **Body**: 
      ```json
      {
        "nombre": "Nuevo nombre",
        "descripcion": "Nueva descripción",
        "precio": 120.0,
        "sku": 1532
      }
      ```
  - `DELETE /api/products/{id}`: 
    - **Descripción**: Elimina un producto por ID.
    
[![](https://markdown-videos.deta.dev/youtube/3EfuQNFbXWc)](https://youtu.be/3EfuQNFbXWc?si=_d_4r9vm69CdIwBb)
