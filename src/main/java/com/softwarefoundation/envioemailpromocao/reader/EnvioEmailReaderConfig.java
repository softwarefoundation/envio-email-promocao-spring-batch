package com.softwarefoundation.envioemailpromocao.reader;

import com.softwarefoundation.envioemailpromocao.entity.Cliente;
import com.softwarefoundation.envioemailpromocao.entity.ClienteProduto;
import com.softwarefoundation.envioemailpromocao.entity.Produto;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class EnvioEmailReaderConfig {


    @Bean
    public JdbcCursorItemReader<ClienteProduto> consultarClienteReader(@Qualifier("appDatasource") DataSource dataSource) {
        log.info(">>> Reader -> Consultando registros");
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT * FROM TB03_CLIENTE_PRODUTO CP ");
        sql.append(" JOIN TB01_CLIENTE C ON C.ID = CP.CLIENTE_ID ");
        sql.append(" JOIN TB02_PRODUTO P ON P.ID = CP.PRODUTO_ID ");
        return new JdbcCursorItemReaderBuilder<ClienteProduto>()
                .name("consultarClienteReader")
                .dataSource(dataSource)
                .sql(sql.toString())
                .rowMapper(rowMapper())
                .build();
    }

    private RowMapper<ClienteProduto> rowMapper() {
        return new RowMapper<ClienteProduto>() {
            @Override
            public ClienteProduto mapRow(ResultSet rs, int i) throws SQLException {
                
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));

                Produto produto = new Produto();
                produto.setId(rs.getInt(6));
                produto.setNome(rs.getString(7));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getDouble("preco"));

                ClienteProduto clienteProduto = new ClienteProduto(cliente, produto);

                System.out.println(cliente);

                return clienteProduto;

            }
        };
    }

}
