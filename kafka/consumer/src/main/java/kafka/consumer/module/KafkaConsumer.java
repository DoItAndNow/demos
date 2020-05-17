package kafka.consumer.module;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2020/2/22 17:13
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"firstTopic"})
    public void consumer(String message){
        System.out.println(message);
    }
}
