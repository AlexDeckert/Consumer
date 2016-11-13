package sender;

import data.Constants;
import kafka.producer.KeyedMessage;
import kafka.javaapi.producer.Producer;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/**
 * Created by nicob on 13.11.2016.
 * write messages to kafka
 */
public class KafkaProducer {
    private static KafkaProducer instance;
    private String topicName = Constants.PRODUCER_KAFKA_TOPIC;
    private Producer<String, String> producer;

    public static KafkaProducer getInstance() {
        if (instance == null) {
            instance = new KafkaProducer();
        }
        return instance;
    }

    private KafkaProducer() {
        Properties properties = new Properties();
        putProperties(properties);
        ProducerConfig producerConfig = new ProducerConfig(properties);
        producer = new Producer<String,String>(producerConfig);
    }

    private void putProperties(Properties properties){
        properties.put(Constants.PRODUCER_CONNECT_ZOOKEEPER, Constants.getServer() + ":" + Constants.KAFKA_CONSUMER_PORT);
        properties.put(Constants.PRODUCER_SERIALIZER, "kafka.serializer.StringEncoder");
        properties.put(Constants.PRODUCER_BROKER_LIST, Constants.getServer() + ":" + Constants.KAFKA_PRODUCER_PORT);
    }

    public void sendMessage(String data) {
        KeyedMessage<String, String> keyedMessage = new KeyedMessage<String, String>(topicName, data);
        producer.send(keyedMessage);
        producer.close();
    }

}
