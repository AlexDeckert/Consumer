package data;

/**
 * Created by nicob on 02.11.2016.
 */

public class Constants {
    //Kafka-Adresse
    public static final String KAFKA_ADDRESS = "192.168.99.100:1001";

    //Kafka-Topic
    public static final String KAFKA_TOPIC = "prodData";

    //Kafka-Attributes
    public static final String BOOTSTRAP_SERVERS = "bootstrap.servers";
    public static final String CONNECT_ZOOKEEPER = "zookeeper.connect";
    public static final String GROUP_ID = "group.id";
    public static final String CLIENT_ID = "client.id";
    public static final String KEY_DESERIALIZE = "key.deserializer";
    public static final String VALUE_DESERIALIZE = "value.deserializer";
    public static final String PARTITION = "partition.assignment.strategy";

    //Path to ERP file
    public static final String FILE_PATH = "C:\\Users\\nicob\\dockerDir";



}