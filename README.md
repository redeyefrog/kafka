# Kafka



Consumer
-
|Key|Default Value|Description|
|---|-------------|-----------|
|spring.kafka.consumer.bootstrap-servers| |Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Overrides the global property, for consumers.|
|spring.kafka.consumer.group-id| |Unique string that identifies the consumer group to which this consumer belongs.|
|spring.kafka.consumer.key-deserializer| |Deserializer class for keys.|
|spring.kafka.consumer.max-poll-records|500|Maximum number of records returned in a single call to poll().|
|spring.kafka.consumer.security.protocol|PLAINTEXT|Security protocol used to communicate with brokers.|
|spring.kafka.consumer.value-deserializer| |Deserializer class for values.|

Producer
-
|Key|Default Value|Description|
|---|-------------|-----------|
|spring.kafka.producer.bootstrap-servers| |Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Overrides the global property, for producers.|
|spring.kafka.producer.key-serializer| |Serializer class for keys.|
|spring.kafka.producer.retries|2147483647|When greater than zero, enables retrying of failed sends.|
|spring.kafka.producer.security.protocol|PLAINTEXT|Security protocol used to communicate with brokers.|
|spring.kafka.producer.value-serializer| |Serializer class for values.|
