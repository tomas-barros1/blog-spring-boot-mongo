# Blog MongoDB Application

Este projeto é uma aplicação de blog desenvolvida utilizando Spring Boot e MongoDB, desenvolvida com base no curso Spring Boot, Hibernate, REST, Ionic, JWT, S3, MySQL, MongoDB ofertado pelo professor Nelio Alves na Udemy. A aplicação permite criar, visualizar, atualizar e excluir postagens de blog. A documentação da API é gerada automaticamente com Swagger.

## Tecnologias Utilizadas

- **Java 17+**: Linguagem de programação usada para desenvolver a aplicação.
- **Spring Boot**: Framework para construção de aplicações Java, facilitando o desenvolvimento e a configuração.
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar as postagens do blog.
- **Lombok**: Biblioteca Java que reduz a verbosidade do código, gerando automaticamente getters, setters e outros métodos comuns.
- **Docker**: Ferramenta de containerização utilizada para subir o MongoDB em um contêiner.
- **Swagger**: Ferramenta para documentação e teste da API REST, acessível em `http://localhost:8080/swagger-ui/index.html`.

## Estrutura do Projeto

- `BlogMongodbApplication.java`: Classe principal que inicializa a aplicação.
- `controllers`: Contém os controladores que lidam com as requisições HTTP.
- `DTOs`: Contém os Data Transfer Objects usados para transferir dados entre camadas.
- `entities`: Contém as entidades que representam os documentos no MongoDB.
- `repositories`: Contém as interfaces dos repositórios que interagem com o MongoDB.
- `services`: Contém as classes de serviço que implementam a lógica de negócios.

## Configuração do Ambiente

### Pré-requisitos

- **Java 17+**: Certifique-se de ter o Java 17 ou superior instalado.
- **Docker**: Para subir o MongoDB em um contêiner.
- **Maven**:  Para gerenciar as dependências e construir o projeto..

### Passos para Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

2. Navegue até o diretório do repositório
    ```bash
   cd seu-repositorio
   
3. Inicie o MongoDB usando Docker:
    ```bash
   docker-compose up -d

4. Execute a aplicação Spring Boot:
    ```bash
   ./mvnw spring-boot:run

### Documentação

Documentação da API
A documentação da API pode ser acessada em http://localhost:8080/swagger-ui/index.html após iniciar a aplicação.