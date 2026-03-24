# 🎬 Movie API

REST API para gerenciamento de filmes, desenvolvida com **Java** e **Spring Boot**.

## 📋 Sobre o Projeto

Esta API permite cadastrar, listar, editar e deletar filmes. Foi desenvolvida como projeto de estudo para praticar os conceitos de API REST com Java e Spring Boot.

> ⚠️ Os dados são armazenados em memória. Ao reiniciar o servidor, os dados são perdidos. A integração com banco de dados será adicionada em breve.

---

## 🚀 Tecnologias Utilizadas

- [Java 17](https://www.oracle.com/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)

---

## 📌 Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `GET` | `/movies` | Lista todos os filmes |
| `GET` | `/movies/{id}` | Busca um filme pelo ID |
| `POST` | `/movies` | Cadastra um novo filme |
| `PUT` | `/movies/{id}` | Atualiza um filme existente |
| `DELETE` | `/movies/{id}` | Deleta um filme |

---

## 📦 Como Executar

### Pré-requisitos

- Java 17+
- Maven

### Passos

```bash
# Clone o repositório
git clone https://github.com/LuisGomes12/movie-api.git

# Acesse a pasta do projeto
cd movie-api

# Execute o projeto
./mvnw spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 🔧 Exemplos de Uso

### Cadastrar um filme
```http
POST /movies
Content-Type: application/json

{
  "nome": "Matrix",
  "nota": 10
}
```

### Listar todos os filmes
```http
GET /movies
```

### Buscar filme por ID
```http
GET /movies/1
```

### Atualizar um filme
```http
PUT /movies/1
Content-Type: application/json

{
  "nome": "Matrix Reloaded",
  "nota": 8
}
```

### Deletar um filme
```http
DELETE /movies/1
```

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com/luis/gameapi/
            ├── controller/
            │   └── MovieController.java
            ├── model/
            │   └── Movie.java
            └── GameapiApplication.java
```

---

## 🔜 Próximos Passos

- [ ] Integração com banco de dados (MySQL)
- [ ] Validação de campos
- [ ] Tratamento de erros
- [ ] Frontend para consumir a API

---

## 👨‍💻 Autor

Feito por **Luís Eduardo** — [GitHub](https://github.com/LuisGomes12) · [LinkedIn](https://www.linkedin.com/in/luís-eduardo-silva-gomes-batista-249409221)