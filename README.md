# Desafio Bridge

## Tecnologias utilizadas
### Backend
As tecnologias utilizadas no backend foram Java com Springboot, iniciando com as seguintes dependências:
* Spring Web: aplicada na construção da API REST com Spring MVC;
* Spring Data JPA: responsável por trabalhar a persistência na API a partir de Spring Data e Hibernate;
* PostgreSQL Driver: para a conexão com a base de dados Postgre;
* Validation: empregada nas validações das entradas dos endpoints no backend.

O teorema matemático utilizado na resolução do desafio pode ser encontrado em https://math.stackexchange.com/questions/1118616/find-how-many-positive-divisors-a-number-has-what-would-you-do.

### Frontend
A implementação do frontend foi realizada através do framework React e a estilização através de React Bootstrap, com algumas estilizações aplicadas com CSS nativo.

##  Como executar

### Configurando o banco de dados
-> Rodar postgres no localhost na porta 5432;
-> Criar um db chamado "numberdb";
-> Criar um schema "numberschema";
-> Criar uma tabela "number" no schema criado;

ou

-> Rodar o seguinte script:
```
CREATE DATABASE numberdb;
CREATE SCHEMA numberschema;

USE DATABASE numberdb;

CREATE TABLE numberschema.number(
id SERIAL PRIMARY KEY,
k int not NULL,
  result int,
  time int
);
```

### Backend
-> Acessar a pasta raíz do projeto "number_challenge":
-> Realizar o maven install das dependências;
-> Realizar o build da aplicação na IDE de sua escolha.

### Frontend
-> Instalar requirements;
-> Acessar a pasta "frontend";
-> Utilizar o comando "npm start" no terminal;
-> Acessar na web http://localhost/3000;