# 🚀🧑‍💻 Fullstack Person CRUD

Sistema full stack para gerenciamento de pessoas, desenvolvido com
**Java (Spring Boot)** no backend e **Delphi (VCL)** no frontend,
realizando comunicação via API REST.

------------------------------------------------------------------------

## 📌 Sobre o projeto

Este projeto tem como objetivo demonstrar a integração entre tecnologias
distintas (Java + Delphi), implementando um CRUD completo com boas
práticas de arquitetura, validação de regras de negócio e automação de
mapeamento de dados.

------------------------------------------------------------------------

## 🧠 Funcionalidades

-   Cadastro de pessoas\
-   Listagem em grid (Delphi)\
-   Edição de registros (PUT)\
-   Exclusão com confirmação (DELETE)\
-   Validação de documento duplicado\
-   Preenchimento automático de endereço via CEP\
-   Mapeamento automático com RTTI (Delphi)\
-   Tratamento global de exceções (Spring Boot)

------------------------------------------------------------------------

## 🛠️ Tecnologias utilizadas

### Backend

-   Java 17\
-   Spring Boot\
-   JPA / Hibernate\
-   MySQL

### Frontend

-   Delphi VCL 10.1\
-   Consumo de API REST\
-   RTTI

------------------------------------------------------------------------

## 📡 Endpoints

GET /person\
GET /person/{id}\
POST /person\
PUT /person\
DELETE /person/{id}

------------------------------------------------------------------------

## ⚙️ Como executar

### Backend

mvn spring-boot:run

### Frontend

Abrir projeto Delphi e executar

------------------------------------------------------------------------

## 📸 Screenshots

![Tela Principal](docs/images/Cadastro.PNG)

------------------------------------------------------------------------

## 💡 Destaques

-   Integração Java + Delphi\
-   Uso de RTTI\
-   Arquitetura em camadas\
-   Tratamento de exceções

------------------------------------------------------------------------
## 📖 Documentação da API (Swagger)

A API possui documentação interativa gerada automaticamente com Swagger (OpenAPI).

Após subir o projeto, acesse:

http://localhost:8080/swagger-ui.html

ou (dependendo da versão):

http://localhost:8080/swagger-ui/index.html

### 🔎 O que você pode fazer no Swagger:

Visualizar todos os endpoints disponíveis
Testar requisições diretamente no navegador
Ver parâmetros, payloads e respostas
Validar contratos da API

------------------------------------------------------------------------

## 📄 Licença

Uso livre para estudos.
