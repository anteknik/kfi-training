Monolith sample code 
This application runs on h2:
```properties
spring.datasource.url=jdbc:h2:mem:TEST;DB_CLOSE_DELAY=-1;
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.platform=h2
#spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

To quickly get a running instance of PostgreSQL, you can run it in the official PostgreSQL docker container:
```bash
docker run -d --name demo-postgres \
        -e POSTGRES_USER=developer \
        -e POSTGRES_PASSWORD=p4SSW0rd \
        -e POSTGRES_DB=demo \
        -p 5432:5432 postgres:latest
```
