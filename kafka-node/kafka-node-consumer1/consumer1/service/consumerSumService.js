const Kafka = require('no-kafka');

module.exports = function () {
    var valueSum = 0;

    var service = {
        callConsumer: function () {
            // Create an instance of the Kafka consumer
            const consumer = new Kafka.SimpleConsumer({ "connectionString": "127.0.0.1:9092" })
            var data = function (messageSet) {
                console.log("\ndata " + JSON.stringify(messageSet));
                messageSet.forEach(function (m) {

                    var value = parseInt(m.message.value.toString('utf8'));
                    console.log("\nVALOR ---> " + value);
                    //valueSum = valueSum + value;
                    console.log(valueSum);
                });
            };


            // Subscribe to the Kafka topic
            return consumer.init().then(function () {
                return consumer.subscribe('topic_kafka_test', data);
            });
        }

    }
    return service;
}