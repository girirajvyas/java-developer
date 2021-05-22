# Rest

## Guiding principles of Rest
  - Contract first approach / Uniform Resource identifiers
  - Statelessness
  - Client-Server model
  - Caching
  - Layered architecture
Good read: https://www.vinaysahni.com/best-practices-for-a-pragmatic-restful-api

Restful
 - [Richardson maturity model](https://martinfowler.com/articles/richardsonMaturityModel.html)
   - level 0: Swamp of POX (plain old xml)
   - level 1: Correct resource URI
   - level 2: Correct Response codes and HTTP methods
   - level 3: HATEOAS Hypermedia as the engine of Application state
 - 
## REST Alternatives:
 - https://grpc.io/
 - http://graphql.org/
 - Messaging queues (RabbitMQ, Kafka, Redis)
 - Event stream - kafka
 - cqrs - axon framework

## Best Practices
 - Accept and respond with JSON.
 - Use nouns instead of verbs in endpoint paths.
 - Name collections with plural nouns.
 - Nesting resources for hierarchical objects.
 - Handle errors gracefully and return standard error codes.
 - Allow filtering, sorting, and pagination.
 - Maintain Good Security Practices.
 - Cache data to improve performance

Reference: 
 - https://stackoverflow.blog/2020/03/02/best-practices-for-rest-api-design/
 - https://medium.com/@dilankam/restful-api-design-best-practices-principles-ded471f573f3

## Methods

## Status codes


## Frequent Questions
 - SOAP vs REST (JAX-WS and JAX-RS)
 - HTTP questions: Origin port
 - Http status, Idempotent, CORS -> option method
 - Design a api
 - Versioning and naming conventions
 - Exception handling in REst
 - Return type conversion from xml and json
 - Security
 - Swagger
 - CORS
 - Options call
 - Request Lifecycle
 - RequestParam vs 
 - https://stackoverflow.com/questions/56729786/difference-between-idempotent-and-safe-http-methods-in-rest-apis
 - Put vs Post (idempotent)
 - Http safe methods?
 - What is patch (patch vs put)
 - What is Restful?
 - Why rest is Stateless?
 - Why rest lightweight?
 - How to maintain session rest?
 - Custom datatype?
 - E-Tag?
 - put vs patch?
 - Implement security in Rest?
 - Rest methods and which one is idempotent?
 - Which Framework you have used and why?
 - How did you configure the said framework?
 - How did you handle CORS?
 - Authentication in Rest? OAUTH/OAuth2/Basic
 - Exception Handling in Rest?
 - Custom Response 200 even if there is exception?
 - API Documentation? Springfox-swagger2
 - Code for any of the Rest call?
 - What are the annotations that are from Spring and which are form JAX-RS ?
 - Stateless vs StateFul SOAP vs REST
 - Spring Implementation:  @Controller vs @Restcontroller, @ResponseBody vs RequestBody, @Path vs @RequestMapping
 - Jersey Implementation: Json to object in rest jersey implementation?

