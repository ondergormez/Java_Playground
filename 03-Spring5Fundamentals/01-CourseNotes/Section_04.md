# Spring Configuration Using Java

* Earlier Spring Boot developments needs a lot of XML configuration file generations.
  
## @Configuration Annotation

* applicationContext.xml replaced by @Configuration annotation.
* @Configuration at class level
* Spring Beans defined by @Bean

We need to define configuration for the classes that use the spring boot.
* We need to use beans to inject dependencies inside the classes.

```Java
@Configuration
public class AppConfig {
    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}
```

## Setter Injection

* Simple as a method call.
* "Mystrey" of injection goes away.
* Setter Injection simply calling a setter

## Constructor Injection

* Just like setter injection
