package kafka.producer.module;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: kafka消息生产者controller
 *
 * @author songcx
 * @date 2020/2/22 16:37
 */
@RequestMapping("/kafka/")
@Slf4j
@RestController
@Api("kafka消息producer")
@AllArgsConstructor
public class KafkaProducerController {

    private KafkaTemplate<String,String> kafkaTemplate;

    /**
     * Description:推送消息
     * @author songcx
     * @date 16:40 2020/2/22
     * @param message 1
     * @return void
     **/
    @GetMapping("send")
    @ApiOperation(value = "推送消息", notes = "推送消息")
    @ApiImplicitParam(name = "message",value = "消息",paramType = "query",required = true,dataType = "String")
    public void pushMessage(String message){

        kafkaTemplate.send("firstTopic","myMessage",message);
    }
}
