package net.javag.springboot;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopiConfig
{
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("Wikistream_recent_update")
                .build();

    }
}
