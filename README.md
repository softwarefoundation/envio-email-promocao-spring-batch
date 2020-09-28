```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.4.RELEASE)
```
Documentação de referência:
https://docs.spring.io/spring-batch/docs/current/reference/html/index.html

# Desenvolvimento de Jobs com Spring Batch

Neste projeto será desenvolvido um serviço de envio de e-mail promocionais.

###Configurações para execução do projeto

### Serviço de e-mail
Para configuração do e-mail é necessário criar uma conta no site https://mailtrap.io/ e utilizar
as informações do para configurar a propriedades abaixo no arquivo application.properties
```properties
spring.mail.username=
spring.mail.password=
```

## Banco de dados
Neste projeto foi utilizado o PostgreSQL com o seguintes schemas:

```properties
app-envio-email
spring-batch
```
                                                                 
