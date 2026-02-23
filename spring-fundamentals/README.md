# Spring Fundamentals

### Key Learnings
- **@RestController**: Simplifies API creation by automating JSON conversion and response handling.
- **@RequestMapping**: Defines the base root path for the API controller (e.g., `api/software-engineers`).
- **@GetMapping**: Maps GET requests; defaults to `/` if no path is specified.
- **@PostMapping / @PutMapping / @DeleteMapping**: Maps specific HTTP actions to create, update, and delete resources.
- **@RequestBody**: Crucial for mapping incoming JSON data from the request body directly into Java Objects.
- **Layered Architecture**:
    - **Controller Layer**: Handles HTTP requests and routing.
    - **Service Layer**: Contains the business logic and manages data (Singleton).
    - **Model Layer**: Defines the data structure (POJO).
- **Object Equality**: Overriding `.equals()` and `.hashCode()` to ensure `List.remove()` and other collections identify objects by ID rather than memory address.
- **Constructor Injection**: Using the constructor to inject the Service into the Controller for better dependency management.
- **Docker & Containerization**:
  - **Images**: Read-only blueprints containing the application and its environment.
  - **Containers**: Live, runnable instances of an image.
  - **Docker Compose**: Orchestrated a PostgreSQL environment using `docker-compose.yml` for local development.
- **Spring Data JPA & Hibernate**:
  - Implemented persistence using the **Repository Pattern** to abstract database operations.
  - Used Hibernate as the JPA implementation to map Java Objects to PostgreSQL tables.
  - Configured `application.yml` for seamless connection between the Spring app and the Dockerized DB.
- **CORS Configuration**: Enabled @CrossOrigin to allow the Angular frontend to securely communicate with the Spring Boot API.

- **Data Persistence:** Configured Docker volumes and Hibernate ddl-auto: update to ensure data survives container and application restarts.