package kafka.producer;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Description: 创建topic
 *
 * @author songcx
 * @date 2020/2/22 11:07
 */
public class CreateTopic {
    public static void main(String[] args) {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "118.89.19.254:9092");
        KafkaAdmin admin = new KafkaAdmin(configs);

        NewTopic newTopic = new NewTopic("firstTopic", 1, (short) 1);

        AdminClient adminClient = AdminClient.create(admin.getConfig());
        List<NewTopic> topicList = Arrays.asList(newTopic);
        adminClient.createTopics(topicList);

        adminClient.close(10, TimeUnit.SECONDS);
    }
}
