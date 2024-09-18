import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsumerTest {
    Consumer consumer;

    @BeforeEach
    void init(){
        consumer = new Consumer(1001,"delhi","electricity","ram kumar");
    }

    @Test
    void testConsumer(){
        Assertions.assertEquals(consumer.getConsumerId(),1001);
        Assertions.assertEquals(consumer.getConsumerLocation(),"delhi");
        Assertions.assertEquals(consumer.getConsumerType(),"electricity");
        Assertions.assertEquals(consumer.getConsumerName(),"ram kumar");
    }
}
