
🎬 Projeto de Streaming

Aplicação de um **Streaming** desenvolvida em **Java** com **Spring Boot 3.5.6**, utilizando **Spring Data JPA** e **MySQL** para persistência de dados.

---

## 📌 Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3.5.6**
- **Spring Data JPA**
- **MySQL**
- **Maven**

---

## 📂 Estrutura do Projeto
```

streaming/
┣ src/
┃ ┣ main/
┃ ┃ ┣ java/
┃ ┃ ┃ ┣Entity
┃ ┃ ┃ ┃ ┣
┃ ┃ ┃ ┣Repository
┃ ┃ ┃ ┃ ┣
┃ ┃ ┃ ┣StreamingApplication.java    # Código fonte
┃ ┃ ┗ resources/   # Configurações e arquivos de recursos
┃ ┗ test/          # Testes automatizados
┣ .gitignore
┣ .gitattributes
┣ pom.xml
┣ mvnw / mvnw.cmd  # Maven Wrapper

````

---

## ⚙️ Configuração do Banco de Dados

No arquivo `application.properties` (ou `application.yml`), configure as credenciais do banco MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/streamingdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
````

---

## ▶️ Como Executar o Projeto

Clone o repositório e entre no diretório do projeto:

```bash
git clone https://github.com/seu-usuario/streaming.git
cd streaming
```

Compile e execute a aplicação:

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em:
👉 [http://localhost:8080](http://localhost:8080)

---

## 🧪 Testes

Para rodar os testes:

```bash
./mvnw test
```

---

## 📖 Funcionalidades (em desenvolvimento)

* Cadastro de usuários
* Catálogo de filmes e séries
* Persistência em banco de dados MySQL
* Integração com Spring Data JPA
* APIs REST para consumo externo

---

## 📜 Licença

Este projeto é distribuído sob a licença MIT.
Sinta-se à vontade para usar, modificar e compartilhar.

```

---

Quer que eu personalize esse README com **exemplos de endpoints da API REST** (por exemplo, `/usuarios`, `/filmes`, etc.), ou prefere deixar mais genérico por enquanto?
```
