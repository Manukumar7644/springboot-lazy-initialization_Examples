# 🚀 Spring Boot Lazy Initialization

A simple and beginner-friendly guide to understanding **Lazy Initialization in Spring Boot**.

This repository explains how **Spring Boot creates beans only when they are needed**, instead of creating them at application startup.

---

## 📌 What is Lazy Initialization?

Lazy Initialization means that a **bean is not created at application startup**.
Instead, Spring creates the bean **only when it is requested for the first time**.

This helps in improving **application startup time and memory efficiency**.

---

## ⚡ Why Use Lazy Initialization?

Using Lazy Initialization provides several benefits:

* 🚀 Faster application startup
* 💾 Better memory management
* ⚙️ Heavy beans load only when needed
* 📦 Improves overall application performance

---

## 🛠 Example of Lazy Bean

```java
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyService {

    public MyService() {
        System.out.println("MyService Bean Created");
    }
}
```

### 🔍 Explanation

* `@Lazy` annotation tells Spring **not to create the bean immediately**
* The bean will be created **only when it is first used**

---

## 🧩 Lazy Injection Example

```java
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final MyService myService;

    public MyController(@Lazy MyService myService) {
        this.myService = myService;
    }
}
```

Here the `MyService` bean will be **injected lazily**.

---

## 🔄 Lazy vs Eager Initialization

| Feature       | Lazy Initialization | Eager Initialization   |
| ------------- | ------------------- | ---------------------- |
| Bean Creation | When required       | At application startup |
| Startup Time  | Faster              | Slower                 |
| Memory Usage  | Efficient           | Higher                 |

---

## 🌍 Enable Lazy Initialization Globally

You can enable Lazy Initialization for the entire application using:

```properties
spring.main.lazy-initialization=true
```

---

## 🎯 Key Takeaway

Lazy Initialization helps **optimize application startup time and resource usage** by creating beans **only when they are actually required**.

---

## 👨‍💻 Author

**Manu Kumar**

If you found this repository helpful, feel free to ⭐ the repo and share it with others!

Happy Coding 🚀
