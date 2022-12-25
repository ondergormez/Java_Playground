# Spring Scopes and Autowiring

## Bean Scopes

* Scope != Pattern

5 Scopes;  

Valid in any configuration
* Singleton
* Prototype

Valid only in web-aware Spring projects
* Request
* Session
* Global

## Singleton Java Config

* One instantiation
* Default bean scope
* Single instance per Spring container

* Singleton - Java Config --> @Scope --> Requires AOP jar
* Default scope is singleton for beans but you can explicitly write

```Java
@Service("customerService")
@Scope("singleton")
public class CustomeServiceImpl implements CustomerService {
    // Implementations ...
}
```

## Prototype Java Config
* Prototype design pattern guaranteed the unique instance every call
* Opposite of Singleton

## Web Scopes

* Covered in Spring MVC project courses.

* Introduction to Spring MVC Course
* Request
* Session
* GlobalSession

## Autowired

```Java
@ComponentScan({"com.example})
```

## Stereotype Annotations


* @Component: Like @Bean basically same thing
* @Repository: Use the denoted class as Repository object
* @Service: Doesn't mean that web service or micro services. Put your business logic here.

* @Bean definition only applicable method level.
* @Component definition used class level.
