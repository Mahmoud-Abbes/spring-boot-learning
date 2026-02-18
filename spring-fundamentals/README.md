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