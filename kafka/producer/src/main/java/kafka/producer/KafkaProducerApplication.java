package kafka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description: 启动类
 *
 * @author songcx
 * @date 2020/2/22 16:19
 */
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "kafka.producer")
public class KafkaProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class,args);
    }
}
