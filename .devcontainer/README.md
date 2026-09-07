# Orders API — Enterprise Spring Boot Study

API de gestão de pedidos e clientes para estudo de padrões corporativos Java/Spring.

## Stack
- Java 21 (LTS)
- Spring Boot 3.3
- Spring Data JPA + Hibernate
- PostgreSQL 16
- Flyway (Migrations)
- RabbitMQ (Mensageria)
- Redis (Cache)
- OpenAPI/Swagger
- Spring Security (JWT/OAuth2)
- Docker + Docker Compose
- GitHub Codespaces (Ambiente de Desenvolvimento)
- GitHub Actions (CI/CD)

## Como rodar (100% em nuvem)

### 1. Abrir o Codespace
1. Acesse github.com/codespaces
2. Inicie o Codespace do projeto `orders-api`

### 2. Subir infraestrutura
\`\`\`bash
docker compose up -d
\`\`\`

### 3. Rodar a aplicação
\`\`\`bash
mvn spring-boot:run
\`\`\`

### 4. Acessar
- API: http://localhost:8080/api/health
- Swagger: http://localhost:8080/swagger-ui.html
- RabbitMQ Management: http://localhost:15672

## Decisões de Arquitetura
Ver [docs/adr](docs/adr/)

## Status
🚧 Em desenvolvimento — Semana 1 do Plano de Reconexão
