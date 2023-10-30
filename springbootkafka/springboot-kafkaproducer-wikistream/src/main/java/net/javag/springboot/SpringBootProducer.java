package net.javag.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducer implements CommandLineRunner {

    // Start the ZooKeeper service
    // bin/zookeeper-server-start.sh config/zookeeper.properties

    // Start the Kafka broker service
    // bin/kafka-server-start.sh config/server.properties

    // Consumer
    // bin/kafka-console-consumer.sh --topic wikistream Wikistream_recent_update --from-beginning --bootstrap-server localhost:9092

    public static void main(String [] args){
        SpringApplication.run(SpringBootProducer.class);

    }

    @Autowired
    private WikiStreamChangesProducer wikimediaChangesProducer;
    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();
    }
}
