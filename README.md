
# Sistema de Cadastro de Alunos

Sistema desenvolvido com Java 17, Spring Boot, Oracle XE e Docker para gerenciamento de alunos através de uma API REST.

---

# Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- Docker
- Docker Compose
- Oracle XE
- Swagger OpenAPI

---

# Funcionalidades

- Cadastro de alunos
- Listagem de alunos
- Atualização de alunos
- Remoção de alunos
- API REST
- Documentação automática com Swagger

---

# Estrutura do Projeto

```bash
.
├── src
├── Dockerfile
├── docker-compose.yml
├── pom.xml
└── README.md


---

# Pré-requisitos

Antes de executar o projeto, é necessário ter instalado:

* Docker
* Docker Compose
* Git

---

# Como Executar o Projeto

## 1. Clonar o repositório

```bash
git clone https://github.com/Matheus-Almeida-Ribeiro/devops-biblioteca.git
```

---

## 2. Entrar na pasta do projeto

```bash
cd devops-biblioteca
```

---

## 3. Subir os containers

```bash
sudo docker compose up --build
```
## Executar sem Docker

Caso queira executar a aplicação em Docker:
```bash
./mvnw spring-boot:run
````

Esse comando irá:

* Criar a imagem da aplicação Spring Boot
* Baixar a imagem do Oracle XE
* Criar os containers
* Executar a aplicação automaticamente

---

# Containers

| Container  | Descrição             |
| ---------- | --------------------- |
| oracle-db  | Banco Oracle XE       |
| spring-app | Aplicação Spring Boot |

---

# Acessando a Aplicação

Após subir os containers, acesse:

```bash
http://localhost:8080/ ou http://4.204.8.70:8080
```

---

# Swagger

A documentação da API pode ser acessada em:

```bash
http://4.204.8.70:8080/swagger-ui/index.html
```

---

# Banco de Dados

## Oracle XE

* Porta: 1521
* Banco Oracle executando em container Docker

---

# Comandos Docker Úteis

## Ver containers em execução

```bash
sudo docker ps
```

---

## Parar os containers

```bash
sudo docker compose down
```

---

## Reiniciar os containers

```bash
sudo docker compose up --build
```

---

## Ver logs da aplicação

```bash
sudo docker logs spring-app
```

---

# Estrutura da Aplicação

O projeto utiliza:

* Spring Boot para construção da API
* Oracle XE como banco de dados
* Docker para containerização
* Swagger para documentação

---

# Autor

Matheus Almeida

