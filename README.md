# umg.edu.gt.ordenatareasestructura
# Task Manager - Persistence Module

Este módulo forma parte del sistema de gestión de tareas y se encarga del manejo de la persistencia de datos. Contiene las entidades JPA y estructuras relacionadas con la base de datos (MySQL/MariaDB). Sirve como capa intermedia entre la lógica de negocio y la base de datos.

## 📦 Estructura del Proyecto

```
task-manager-persistence
├── src/main/java/
│   └── umg/edu/gt/taskmanagerpersistence/
│       ├── entity/
│       │   ├── User.java
│       │   ├── Task.java
│       │   └── TaskHistory.java
│       └── repository/
│           ├── UserRepository.java
│           ├── TaskRepository.java
│           └── TaskHistoryRepository.java
├── pom.xml
└── README.md
```

## 🧩 Funcionalidades Principales

* **Entidades**: Modelos de datos para usuarios, tareas e historial de tareas.
* **Repositorios**: Interfaces que extienden `JpaRepository` para operaciones CRUD automáticas.
* **Diseño limpio**: El módulo no contiene lógica de negocio ni lógica de presentación.

## 🗃️ Entidades

### User.java

Representa a un usuario del sistema.

```java
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    // Getters, setters, constructor
}
```

### Task.java

Representa una tarea creada por un usuario.

```java
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    @ManyToOne
    private User user;
    // Getters, setters, constructor
}
```

### TaskHistory.java

Representa un historial de cambios o estados de una tarea.

```java
@Entity
public class TaskHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private LocalDateTime changedAt;
    @ManyToOne
    private Task task;
    // Getters, setters, constructor
}
```

## 📚 Repositorios

### UserRepository.java

```java
public interface UserRepository extends JpaRepository<User, Long> {}
```

### TaskRepository.java

```java
public interface TaskRepository extends JpaRepository<Task, Long> {}
```

### TaskHistoryRepository.java

```java
public interface TaskHistoryRepository extends JpaRepository<TaskHistory, Long> {}
```

## 🔗 Dependencias Principales

Ubicadas en `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.mariadb.jdbc</groupId>
        <artifactId>mariadb-java-client</artifactId>
    </dependency>
    <dependency>
        <groupId>jakarta.persistence</groupId>
        <artifactId>jakarta.persistence-api</artifactId>
    </dependency>
</dependencies>
```

## ✅ Uso en Otros Módulos

Este módulo es utilizado como dependencia en el módulo principal (`task-manager-springboot`).
