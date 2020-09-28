```
                                              ______
  .   ____          _            __ _ _      |       \ ______________________________
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \     |  |__)  |    \___    ______   |  |  |  |
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \    |      _/  /\  \  |  |  |   |__|  |__|  |
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )   |       \  __   \ |  |  |    __    __   |
  '  |____| .__|_| |_|_| |_\__, | / / / /    |  |__)  | ___   \|  |  |___|  |  |  |  |
 =========|_|==============|___/=/_/_/_/     |_____ _/      \__\__|\_______/|__|  |__|
 :: Spring Boot ::        (v2.3.4.RELEASE)
```
Documentação de referência:
https://docs.spring.io/spring-batch/docs/current/reference/html/index.html

# Desenvolvimento de Jobs com Spring Batch

Neste projeto será desenvolvido um serviço de envio de e-mail promocionais.

### Configurações para execução do projeto

### Serviço de e-mail
Para configuração do e-mail é necessário criar uma conta no site https://mailtrap.io/ e utilizar
as informações do para configurar a propriedades abaixo no arquivo application.properties
```properties
spring.mail.username=
spring.mail.password=
```

## Banco de dados
Neste projeto foi utilizado o PostgreSQL e configura do o migrador Flyway, sendo
 assim para criação das tabelas e inserção dos registros iniciais é preciso apenas
 configurar a conexão e o criar os seguintes schemas:

```properties
app-envio-email
spring-batch
```
                                                                 
