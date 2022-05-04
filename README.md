
The application is to demonstrate Spring Kafka connectivity 

# Below is the sample curl requests
### End point 1 to put message to Kafka
curl -X POST -H "Content-Type: application/json" -d '{"topicName": "abc", "message": "Message1"}' http://localhost:8080/api/kafka/putMessage
### End point 2 to Get Last Message
curl -X GET http://localhost:8080/api/kafka/getLastMessage
