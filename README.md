![Kafka](https://kafka.apache.org/images/logo.png)

---

 - Estudo de kafka ( docker + java + node js )

 - https://medium.com/trainingcenter/apache-kafka-codifica%C3%A7%C3%A3o-na-pratica-9c6a4142a08f
 - https://pt.stackoverflow.com/questions/306097/o-que-%C3%A9-esse-tal-de-apache-kafka
 - https://www.baeldung.com/spring-kafka
 - https://medium.com/trainingcenter/apache-kafka-838882261e83
 - https://www.javainuse.com/spring/spring-boot-apache-kafka-hello-world
 
 ```java
 // iniciando o servidor
 bin/zookeeper-server-start.sh config/zookeeper.properties
 
 // iniciando o kafka
 bin/kafka-server-start.sh config/server.properties
 
 // iniciando o consumer
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic_test_kafka_java --from-beginning
 ```
 
