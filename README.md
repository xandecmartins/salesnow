# Project
- Example of Application for Sales Management using Spring+Hibernate+Mysql+Rest
- CRUD Customer
- CRUD Products
- CRUD Sales

#  Architecture
  - SalesNowBusiness (Back-end - Database access and rest service provider)
  - SalesNowWeb (Front-end - under construction)

# Quick Start
```
git clone https://github.com/xandecmartins/salesnow
cd salesnow
mvn clean install tomcat7:deploy
```

# Persistence
This project is configured to use mysql. However you can update the persistence.xml for another database

# Technology Stack
The project uses the following technologies: <br/>
- **web/REST**: [Spring](http://www.springsource.org/) 4.2.x <br/>
- **persistence**: [Spring Data JPA](http://www.springsource.org/spring-data/jpa) and [Hibernate](http://www.hibernate.org/) <br/>
- **persistence providers**: MySQL
