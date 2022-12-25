# Advanced Bean Configuration


* BeanPostProcessor
* FactoryBean
* SpEL
* Proxies
* Profiles

## Bean Lifecycle

* Instantiation
* Populate Properties
* BeanNameAware
* BeanFactoryAware
* PreInitialization - BeanPostProcessors
* InitializeBean
* initMethod
* Post Initialization - BeanPostProcessors

## FactoryBean

Builds on initMethod concept  
Factory Method Pattern  
Legacy Code  
Contract Without Constructor  
Static Methods  

## Spring Expression Language (SpEL)

Manipulate Object Graph  
Evaluate at Runtime  
Configuration  

```Java
    // It initialize the seedNum with the random value
    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;
```

## Proxies

Spring Utilizes Proxies  
@Transactional

## Bean Profiles

```Java

@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    // Implementation for development environment
}

@Profile("prod")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    // Implementation for production environment
}

@Profile("test")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    // Implementation for test environment
}

// In the "Edit Configuration --> VM options" you have to set flag like below;
// -Dspring.profiles.active=dev
```
