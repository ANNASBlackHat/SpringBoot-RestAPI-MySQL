# SpringBoot-RestAPI-MySQL
Creating Rest API using Springboot, JPA, and MySQL database

### INSTALLATION
To run this project, you should already have JRE installed on your computer. And then follow these steps bellow :
  - Download this project
  - Run your MySQL service
  - Open terminal
```sh
  $ cd target
  $ java -jar course-api-jpa-0.0.1-SNAPSHOT.jar
```
  - Open browser **http://localhost:8080/course**
  

> You dont have to create your own database, because this app, will created the database automatically.

---

### API
Action handled by this app :

**1. Topic**

| METHOD | PATH | DESCRIPTION |
| ------ | ------ | ----------- |
| GET | /topic | Get All Topic |
| GET | /topic/{id} | Get Topic base on ID |
| POST | /topic | Add Topic |
| PUT | /topic/{id} | Update Topic base on ID |
| DELETE | /topic/{id} | Delete Topic base on ID |

**2. Course**

| METHOD | PATH | DESCRIPTION |
| ------ | ------ | ----------- |
| GET | /topic/{topicId}/course | Get course by Topic ID |
| GET | /topic/{topicId}/course/{id} | Get Course by Course ID |
| POST | /topic/{topicId}/course | Add course related to Topic |
| PUT | /topic/{topicId}/course/{id} | Update Course |
| DELETE | /topic/{topicId}/course/{id} | Delete Course

---

###JSON OUTPUT EXAMPLE
***http://localhost:8080/topic/2/course***
```json
[
  {
    "id": 1,
    "name": "Java OOP",
    "description": "Java OOP description",
    "topic": {
      "id": 2,
      "name": "Java",
      "description": "Java description"
    }
  },
  {
    "id": 2,
    "name": "Java 8 Stream",
    "description": "Java 8 Stream description",
    "topic": {
      "id": 2,
      "name": "Java",
      "description": "Java description"
    }
  }
]
```
