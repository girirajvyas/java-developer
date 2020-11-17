# Spring Core

What is Dependency Injection and it types and advantages?    
Inversion of control (IOC) vs Dependency Injection(DI)  
Write a code to show where exactly there is dependency injection?  
Spring - XML Vs Annotations Vs Java Based Configuration?  
Dependency resolution if two beans have same name in xml?

Spring container classes?  
What is BeanFactory?
Does BeanFactory support Annotations?  
What is ApplicationContext?   
Difference between BeanFactory and ApplicationContext?  
  
What are the Bean Scopes?    
When are the beans initialized in Spring?  
Spring Bean Life-cycle?     
Can you inject a singleton bean into prototype bean and Scope of singleton  bean inside prototype bean?  
Can you inject a singleton bean into singleton bean?  
Can you inject a prototype bean into singleton bean and Scope of prototype bean inside singleton bean?  
Can you inject a prototype bean into prototype bean?  

What is Autowiring and its Types?  
Spring Circular Dependency management?
Spring life-cycle BeanAware or BeanName  
Difference between @Service and @Component and @Resource?  
Difference between <context:annotation-config> vs <context:component-scan>?  
How to get property file in Spring?  

What is connection pool and why do we use it?  
creating new objects in spring
lookup annotation spring

# Spring MVC
Spring MVC flow?  
Use of filters in MVC?  
What is DispatcherServlet?  
Controller to DB call code?  

# Spring ORM
Explain all the Propagations available in spring?(Transaction management)  
How did you configure spring with Hibernate  
Why DB security(ROLE BASED authentication) Vs ORM  

# Spring AOP
What is AOP?  
How Aspects work and its uses?   
AspectJ or Spring xml based?  
Aspect code in aop? 
Load time weaving Vs Runtime weaving Vs compile time weaving?  

# Spring Boot
How to configure spring boot?  
How WSDL are generated in SOAP for Spring Boot app?  
How to configure transaction via Spring?  
What is Proxy and why?  

# Answers to Questions Above
When are the beans initialized in Spring?  
A: All singleton beans are initialized as context initialization while using applicationContext and at getBean when BeanFactory is used.  
@Component, @Resource, @Service?  
Ans: In Spring 2.0 and later, the @Repository annotation is a marker for any class that fulfills the role or stereotype (also known as Data Access Object or DAO) of a repository. Among the uses of this marker is the automatic translation of exceptions.

Spring 2.5 introduces further stereotype annotations: @Component, @Service, and @Controller. @Component is a generic stereotype for any Spring-managed component. @Repository, @Service, and @Controller are specializations of @Component for more specific use cases, for example, in the persistence, service, and presentation layers, respectively.

Therefore, you can annotate your component classes with @Component, but by annotating them with @Repository, @Service, or @Controller instead, your classes are more properly suited for processing by tools or associating with aspects. For example, these stereotype annotations make ideal targets for pointcuts.

Thus, if you are choosing between using @Component or @Service for your service layer, @Service is clearly the better choice. Similarly, as stated above, @Repository is already supported as a marker for automatic exception translation in your persistence layer.

| Annotation | Meaning                                             |
| ---------- | -------------------------------------------------: |
| @Component | generic stereotype for any Spring-managed component |
| @Repository | stereotype for persistence layer                    |
| @Service   | stereotype for service layer                        |
| @Controller | stereotype for presentation layer (spring-mvc)      |

How to get property file in Spring?  
A: PropertyPlaceHolderConfigurer.  


Q: Difference between The BeanFactory and the ApplicaitonContext in spring framework?  
**Ref**: https://stackoverflow.com/questions/243385/beanfactory-vs-applicationcontext
Ans: Actually they both are ways to get beans from your spring IOC container but still there are some difference.
I would like to give some reference which may clear your doubts.
BeanFactory is the actual container which instantiates, configures, and manages a number of beans. These beans typically collaborate with one another, and thus have dependencies between themselves. These dependencies are reflected in the configuration data used by the BeanFactory.
A BeanFactory is represented by the interface "org.springframework.beans.factory". BeanFactory, for which there are multiple implementations.
ClassPathResource myResource= new ClassPathResource("beans.xml"); XmlBeanFactory factory = new XmlBeanFactory(myResource);
is a way to get beans.  

Difference
  1. BeanFactory instantiate bean when you call getBean() method whileApplicationContext instantiate Singleton bean when container is started,  It doesn't wait for getBean() to be called.   
  2. BeanFactory doesn't provide support for internationalization butApplicationContext provides support for it.  
  3. Another difference between BeanFactory vs ApplicationContext is ability to publish event to beans that are registered as listener. 
  4. One of the popular implementation of BeanFactory interface is XMLBeanFactorywhile one of the popular implementation of ApplicationContext interface isClassPathXmlApplicationContext.  
  5. If you are using auto wiring and using BeanFactory than you need to registerAutoWiredBeanPostProcessor using API which you can configure in XML if you are using  ApplicationContext. In summary BeanFactory is OK for testing and non production use but ApplicationContext is more feature rich container implementation and should be favored over BeanFactory  
 
Bean Factory  
  •	Bean instantiation/wiring  
Application Context  
  •	Bean instantiation/wiring  
  •	Automatic BeanPostProcessor registration  
  •	Automatic BeanFactoryPostProcessor registration  
  •	Convenient MessageSource access (for i18n)  
  •	ApplicationEvent publication  

Q. Difference between <context:annotation-config> vs <context:component-scan>?** 
Ref: http://stackoverflow.com/questions/7414794/difference-between-contextannotation-config-vs-contextcomponent-scan 

**Q: How to configure spring in Tomcat(xml and java config approach)?**
**Ans:** From the spring docs: 
Spring can be easily integrated into any Java-based web framework.  
All you need to do is to declare the ContextLoaderListener in your web.xml and use a contextConfigLocation to set which context files to load.

**A. XML Approach**
1. Web.xml
```
<context-param>
  <param-name>contextConfigLocation</param-name>
  <param-value>/test/resources/com/reg/applicationcontext.xml</param-value>
</context-param>
<listener>
  <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>
```

2. Sample Spring MVC XML config
```
<?xml version="1.0" encoding="UTF-8"?>
<web-app version="2.5" xmlns="http://java.sun.com/xml/ns/javaee"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">

<!-- The definition of the Root Spring Container shared by all Servlets and Filters -->
<context-param>
  <param-name>contextConfigLocation</param-name>
  <param-value>/WEB-INF/spring/root-context.xml</param-value>
</context-param>

<!-- Creates the Spring Container shared by all Servlets and Filters -->
<listener>  
  <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>

<!-- Processes application requests -->
<servlet>
  <servlet-name>appServlet</servlet-name>
  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  <init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/spring/appServlet/servlet-context.xml</param-value>
   </init-param>
  <load-on-startup>1</load-on-startup>
</servlet>

<servlet-mapping>
  <servlet-name>appServlet</servlet-name>
  <url-pattern>/</url-pattern>
</servlet-mapping>
```

You can also specify context location relatively to current classpath, which may be preferable
```
<param-value>classpath*:applicationContext*.xml</param-value>
```


**B. Java Config Approach with web.xml (non spring boot approach)**   
**Ref:** https://stackoverflow.com/questions/8075790/how-to-register-spring-configuration-annotated-class-instead-of-applicationcont  
```
<web-app>
  <context-param>
    <param-name>contextClass</param-name>
    <param-value>
            org.springframework.web.context.support.AnnotationConfigWebApplicationContext 
    </param-value>
  </context-param>
  <context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>com.foo.Application</param-value>
  </context-param>
<listener>
  <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>
...
</web-app>
```

Configuration class 
```
@Configuration
@ComponentScan(basePackages={"com.foo.service"})
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            @Override
            public String getMessages() {
                return "Hello Spring World!";
            }
        };
    }
}
```

Different Bean Injection Scenarios Possible or not
  * can you inject a singleton bean into prototype bean?
  * can you inject a singleton bean into singleton bean?
  * can you inject a prototype bean into singleton bean?
  * can you inject a prototype bean into prototype bean?
Ans:
Singleton bean is wired with yet another singleton bean, there is absolutely no problem  
Spring core comes out-of-the-box with two scopes: singletons and prototypes. Singletons implement the Singleton pattern, meaning there's only a single instance at runtime (in a JVM). Spring instantiates them during context creation, caches them in the context, and serves them from the cache when needed (or something like that). Prototypes are instantiated each time you access the context to get the bean.

**References:**
http://stackoverflow.com/questions/25708452/spring-web-context-without-spring-mvc  
http://stackoverflow.com/questions/7414794/difference-between-contextannotation-config-vs-contextcomponent-scan  
http://howtodoinjava.com/spring/spring-mvc/spring-mvc-difference-between-contextannotation-config-vs-contextcomponent-scan/  
http://www.javacreed.com/why-should-we-use-maven/  
http://stackoverflow.com/questions/7031885/how-to-choose-the-right-bean-scope  


 *Spring Boot Actuator*
 * https://spring.io/guides/gs/actuator-service/
 * http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready
 
 *Spring cloud*
 * http://projects.spring.io/spring-cloud/

 *Spring cloud security*
 * http://cloud.spring.io/spring-cloud-security/spring-cloud-security.html

 Class and respective Jars  

| Class Name | Jar Name |
| ------------- |:-------------:|
| org.springframework.stereotype.Controller | spring context |
| org.springframework.ui.ModelMap | spring context |
| org.springframework.web.bind.annotation.RequestMapping | spring web |
| org.springframework.web.bind.annotation.PathVariable | spring web |
