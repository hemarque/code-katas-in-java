Simple spring boot project to play a little ;-) 

Steps
- Execute SampleApplication 
```
mvn spring-boot:run
```
- Call http://localhost:8080/
- Call http://localhost:8080/sayHiTo?name=Helder
- Call http://localhost:8080/addUser?name=Mario
- Call http://localhost:8080/addUser?name=Enrique
- Call http://localhost:8080/addUser?name=Gofio
- Call http://localhost:8080/getUsers

we can check the database here http://localhost:8080/h2
- user: sa
- password: password