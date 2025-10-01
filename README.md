
🎬 Projeto de Streaming

Aplicação de um **Streaming** desenvolvida em **Java** com **Spring Boot 3.5.6**, utilizando **Spring Data JPA** e **MySQL** para persistência de dados.

## 👥 Equipe
| Integrante        | E-mail                             |
|-------------------|------------------------------------|
| Gustavo Alexandre | barongucontacts@gmail.com          |
| João Rosa         | joaovitorrosamachado1103@gmail.com |
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

streaming_jpa/
├── .idea/
├── .mvn/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/univille/jpa/streaming/
│ │ │ ├── entity/
│ │ │ │ ├── avaliacao.java
│ │ │ │ ├── categoria.java
│ │ │ │ ├── perfil.java
│ │ │ │ ├── usuario.java
│ │ │ │ ├── video.java
│ │ │ │ └── visualizacao.java
│ │ │ ├── Repository/
│ │ │ │ ├── avaliacaoRepository.java
│ │ │ │ ├── categoriaRepository.java
│ │ │ │ ├── perfilRepository.java
│ │ │ │ ├── usuarioRepository.java
│ │ │ │ ├── videoRepository.java
│ │ │ │ └── visualizacaoRepository.java
│ │ │ └── StreamingApplication.java
│ │ └── resources/
│ │ └── application.properties
│ └── test/
├── target/
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml

````

---

## ⚙️ Configuração do Banco de Dados

No arquivo `application.properties` (ou `application.yml`), configure as credenciais do banco MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/streaming_jpa
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
````

---

## ▶️ Como Executar o Projeto

Clone o repositório e entre no diretório do projeto:

```bash
git clone https://github.com/GustaBaron/streaming_jpa

```

Compile e execute a aplicação:

```bash
./mvnw spring-boot:run
```

## 🧪 Testes

Para rodar os testes:

```bash
./mvnw test
```

---

## 📖 Funcionalidades

* Cadastro de usuários
* Catálogo de filmes 
* Persistência em banco de dados MySQL
* Integração com Spring Data JPA
* APIs REST para consumo externo

---







