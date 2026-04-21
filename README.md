# Projeto - Cidades ESG Inteligentes

Sistema acadêmico desenvolvido para demonstrar práticas DevOps.

## Executar com Docker

docker-compose up --build

Aplicação:
http://localhost:8080

Health check:
/esg/health

## Pipeline CI/CD

Implementado com GitHub Actions.

Etapas:

1 Build da aplicação
2 Testes automatizados
3 Build da imagem Docker
4 Deploy simulado staging
5 Deploy produção

## Containerização

Docker + Docker Compose.

Serviços:

API Spring Boot
Banco PostgreSQL

## Tecnologias

Java
Spring Boot
Docker
Docker Compose
GitHub Actions
PostgreSQL
Maven
