## Spring Data Elasticsearch

### Relevant Articles:
https://www.journaldev.com/18148/spring-boot-elasticsearch

### Build the Project with Tests Running
```
mvn clean install
```

### Run Tests Directly
```
mvn test
```

#sample curl to create one offer
curl --header 'Content-Type: application/json' --request POST --data '{"description":"test","discount": 11, 
"valid": true}'  http://localhost:8080/offers

#response for above:
{"id":"7d57950a-f0e9-49c2-8862-7f239c6ef672","description":"test","discount":11,"valid":true}


# to see the inserted offer use
curl http://localhost:8080/offers/7d57950a-f0e9-49c2-8862-7f239c6ef672

# to delete 
curl --request DELETE http://localhost:8080/offers/7d57950a-f0e9-49c2-8862-7f239c6ef672