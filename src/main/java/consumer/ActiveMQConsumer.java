package consumer;

/**
 * Created by nicob on 02.11.2016.
 */

public class ActiveMQConsumer implements Runnable {

    private static ActiveMQConsumer instance;

    private ActiveMQConsumer(){

    }

    public static ActiveMQConsumer getActiveMqConsumer(){
        if (instance == null){
            instance = new ActiveMQConsumer();
        }
        return instance;
    }

    public void run() {

    }
}