<http://www.iocoder.cn/Spring-Boot/Kafka/?github>


https://github.com/louyanfeng25/kafka-sort-consume

数据类型不一致
Caused by: org.apache.kafka.common.errors.SerializationException: Error deserializing key/value for partition DEMO_01-1 at offset 0. If needed, please seek past the record to continue consumption.


ERROR 39681 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-2, groupId=demo01-B-consumer-group-DEMO_01] Offset commit failed on partition DEMO_01-2 at offset 3: The coordinator is not aware of this member.

curl -i  http://localhost:8080/?msgNum=10000&topicName="test.delay"

curl -i  http://localhost:8080/?msgNum=10000&topicName="test.delay"
curl -i  http://localhost:8080/?msgNum=100000&topicName="test.delay"
curl -i  http://localhost:8080/?msgNum=10&topicName="DEMO_01"


cd /Users/husx/data/dev/tools/kafka_2.13-3.3.1/bin


10.8.14.47:9092,10.8.14.47:9093,10.8.14.47:9094

./kafka-consumer-groups.sh --bootstrap-server 10.8.14.47:9092,10.8.14.47:9093,10.8.14.47:9094 --list