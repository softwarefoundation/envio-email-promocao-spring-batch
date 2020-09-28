package com.softwarefoundation.envioemailpromocao.processor;

import com.softwarefoundation.envioemailpromocao.entity.ClienteProduto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EnvioEmailProcessor implements ItemProcessor<ClienteProduto,SimpleMailMessage> {


    @Override
    public SimpleMailMessage process(ClienteProduto clienteProduto) throws Exception {
        log.info(">>> Processor -> Preparando e-mail para envio");
        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom("xpto@no-reply.com");
        email.setTo(clienteProduto.getCliente().getEmail());
        email.setSubject("Super Promoção!!!");
        email.setText(gerarTextoPromocao(clienteProduto));
        Thread.sleep(2000);
        return email;
    }

    private String gerarTextoPromocao(ClienteProduto clienteProduto){
        StringBuilder texto = new StringBuilder();
        texto.append(String.format("Olá, %s", clienteProduto.getCliente().getNome()));
        texto.append("\n\n");
        texto.append(clienteProduto.getProduto().getDescricao());

        return texto.toString();
    }

}
