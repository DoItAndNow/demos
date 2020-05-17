package kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: kafka消费者启动类
 *
 * @author songcx
 * @date 2020/2/22 17:06
 */
@SpringBootApplication(scanBasePackages = "kafka.consumer")
public class KafkaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class);
    }
}
