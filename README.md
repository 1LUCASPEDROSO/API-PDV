API-PDV

Descrição

Projeto de API para um sistema de Ponto de Venda (PDV) com autenticação. A aplicação é desenvolvida utilizando Java 17, Spring Boot 3.4.2, e PostgreSQL como banco de dados relacional. O sistema oferece funcionalidades essenciais para gestão de vendas e produtos, com validação de dados e um ambiente de desenvolvimento com recarregamento automático.

Tecnologias Utilizadas

Java 17: Linguagem principal da aplicação.

Spring Boot 3.4.2: Framework para desenvolvimento rápido de aplicações Java.

Spring Data JPA: Abstração para acesso e manipulação de dados em bancos relacionais.

Spring Validation: Validação automática de dados de entrada.

Spring Boot DevTools: Ferramenta para recarregamento automático durante o desenvolvimento.

PostgreSQL: Banco de dados relacional para persistência dos dados.

JUnit: Framework de testes para garantir a qualidade do código.

Requisitos

Java 17 instalado.

PostgreSQL configurado.

Maven para gerenciamento de dependências.

Configuração do Banco de Dados

Certifique-se de ter o PostgreSQL rodando e crie um banco de dados para a aplicação. No arquivo application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/pdv_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Como Executar o Projeto

Clone o repositório:

git clone https://github.com/seuusuario/api-pdv.git

Acesse o diretório do projeto:

cd api-pdv

Execute o comando abaixo para compilar e rodar o projeto:

mvn spring-boot:run

Considerações

Este projeto foi desenvolvido com foco na simplicidade e manutenção fácil, utilizando as melhores práticas do Spring Boot e PostgreSQL.

Autor

Lucas Pedroso - Backend Developer

