package com.softwarefoundation.envioemailpromocao.step;

import com.softwarefoundation.envioemailpromocao.entity.ClienteProduto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
@Slf4j
public class EnvioEmailStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step enviarEmailClienteStep(
            ItemReader<ClienteProduto> reader, 
            ItemProcessor<ClienteProduto, SimpleMailMessage> processor, 
            ItemWriter<SimpleMailMessage> writer) {
        log.info(">>> Step -> enviar e-mail promocional");
        
        Step step = stepBuilderFactory
                .get("enviarEmailClienteStep")
                .<ClienteProduto,SimpleMailMessage>chunk(1)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
         return step;
    }

}
