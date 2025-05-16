# exemplo-feign
Descrição:
----------
Projeto em Java usando o Feign para consultar a API do Github.

Endpoints:
----------
A documentação dos endpoints pode ser vista através do Swagger e do Redoc.<br>

<b>Documentação dos endpoints via Swagger:</b>
```shell script
http://localhost:8082/swagger-ui.html
```

<b>Documentação dos endpoints via Redoc:</b>
```shell script
http://localhost:8082/redoc.html
```

Gerando o arquivo .jar:
-----------------------
Para gerar o arquivo <b>.jar</b>, execute o comando via terminal no diretório raiz de cada um dos projetos:
```shell script
mvn clean install -DskipTests
```

Rodando o projeto localmente:
-----------------------------
Para rodar cada projeto localmente, execute o comando no diretório raiz de cada um dos projetos:
```shell script
mvn spring-boot:run
```

Rodando o projeto no Docker:
----------------------------
Para rodar o projeto no Docker, primeiro deve-se gerar o .jar de cada um dos projetos.<br>
Após isso, deve-se gerar o build das imagens e subir os containers do Docker.<br><br>
<b>Fazendo o build das imagens do Docker:</b>
```shell script
docker-compose build
```

<b>Subindo os containers do Docker:</b>
```shell script
docker-compose up -d
```

Ao subir o Docker, irá ser criado um container para a aplicação que envia mensagem o Kafka e para a aplicação que recebe mensagem do Kafka, um conainter do Zookeeper, um conainter do Kafka e um conainter para o banco de dados.

##
Para automatizar esse processo, basta executar o Shellscript <b>`docker_build_and_run.sh`</b>:
```shell script
./docker_build_and_run.sh
```

Autor:
------
<b>Rodrigo Amora</b>

LinkedIn: https://linkedin.com/in/rodrigoamora <br>
E-mail: rodrigo.amora.freitas@gmail.com
