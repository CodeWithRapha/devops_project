
# Projeto - Cidades ESG Inteligentes

Este projeto foi desenvolvido como atividade pratica de DevOps, com foco em **containerizacao** e **pipeline de CI/CD**.

A aplicacao foi feita em **Java com Spring Boot** e usa **PostgreSQL** como banco de dados.

## Como executar localmente com Docker

### Pre-requisitos
- Docker instalado
- Docker Compose instalado

### Passo a passo
1. Clone o projeto:
   ```bash
   git clone <url-do-repositorio>
   cd esg-smartcity-devops
   ```

2. Crie o arquivo `.env` com base no `.env.example`:
   ```bash
   cp .env.example .env
   ```

3. Suba os containers:
   ```bash
   docker-compose up --build
   ```

4. Acesse a aplicacao:
   - API: `http://localhost:8080`
   - Health check: `http://localhost:8080/esg/health`

## Pipeline CI/CD

Atualmente o projeto usa **GitHub Actions**.

Arquivo do pipeline:
`.github/workflows/ci-cd.yml`

### Etapas que ja existem
- Checkout do codigo
- Configuracao do Java 17
- Build da aplicacao (`mvn clean package`)
- Execucao de testes (`mvn test`)
- Build da imagem Docker (`docker build -t esg-api .`)

### Etapas que ainda serao feitas
- Deploy automatizado para ambiente **staging**
- Deploy automatizado para ambiente **producao**
- Evidencias/prints da execucao completa do pipeline com deploy

## Containerizacao

### Dockerfile
O projeto possui `Dockerfile` funcional, que:
- usa imagem base `eclipse-temurin:17-jdk`
- copia o arquivo JAR gerado
- expoe a porta `8080`
- inicia a aplicacao com `java -jar app.jar`

### Docker Compose
O projeto possui `docker-compose.yml` com:
- servico da API (`api`)
- servico do banco PostgreSQL (`db`)
- variaveis de ambiente por `.env`
- volume persistente para o banco (`postgres_data`)
- rede dedicada (`esg_network`)

## Estrutura do projeto

Estrutura minima atual:

```text
esg-smartcity-devops/
|-- .github/workflows/ci-cd.yml
|-- Dockerfile
|-- docker-compose.yml
|-- src/
|-- README.md
`-- .env.example
```

## Prints do funcionamento


<img width="1396" height="992" alt="docker_compose" src="https://github.com/user-attachments/assets/343fd2e9-8ec3-4a95-883d-dd56986dec8b" />


<img width="1902" height="745" alt="pipeline_build" src="https://github.com/user-attachments/assets/04cfe2fd-b441-4b45-932d-7469dfa51d02" />


<img width="1424" height="1018" alt="docker_db" src="https://github.com/user-attachments/assets/d716ff56-e18c-41ce-a665-e291c957c0da" />



<img width="1409" height="1016" alt="mvn_test" src="https://github.com/user-attachments/assets/ef41af4c-53e2-4954-9649-176c57b5e1e4" />


## Tecnologias utilizadas

- Java 17
- Spring Boot
- Maven
- PostgreSQL
- Docker
- Docker Compose
- GitHub Actions

## Checklist de entrega

| Item | Status |
|---|---|
| Projeto compactado em .ZIP com estrutura organizada | ☐ Pendente |
| Dockerfile funcional | ☑ OK |
| docker-compose.yml ou arquivos Kubernetes | ☑ OK |
| Pipeline com etapas de build, teste e deploy | ☐ Pendente (falta deploy) |
| README.md com instrucoes e prints | ☐ Parcial (faltam prints) |
| Documentacao tecnica com evidencias (PDF ou PPT) | ☐ Pendente |
| Deploy realizado nos ambientes staging e producao | ☐ Pendente |

## Observacao importante

Antes da entrega final/publicacao, revisar o `.env.example` para garantir que ele tenha apenas **valores de exemplo** (sem credenciais reais).
