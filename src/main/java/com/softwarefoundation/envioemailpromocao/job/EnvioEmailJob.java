package com.softwarefoundation.envioemailpromocao.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
@Slf4j
public class EnvioEmailJob {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public Job envioEmailPromocaoJob(Step step){
        log.info(">>> Job -> Iniciando serviço de envio de e-mails");
        return jobBuilderFactory
                .get("envioEmailPromocaoJob")
                .start(step)
                .incrementer(new RunIdIncrementer())
                .build();

    }

}
