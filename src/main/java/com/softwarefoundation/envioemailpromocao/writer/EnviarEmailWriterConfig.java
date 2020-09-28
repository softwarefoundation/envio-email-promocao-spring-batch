package com.softwarefoundation.envioemailpromocao.writer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.mail.SimpleMailMessageItemWriter;
import org.springframework.batch.item.mail.builder.SimpleMailMessageItemWriterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;

@Configuration
@Slf4j
public class EnviarEmailWriterConfig {

    @Bean
    public SimpleMailMessageItemWriter enviarPromocaoClienteWriter(MailSender mailSender){
        log.info(">>> Writer -> enviando e-mails");

        return new SimpleMailMessageItemWriterBuilder()
                .mailSender(mailSender)
                .build();
    }

}
