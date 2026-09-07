# 0000 - Propósito do Projeto Orders API

**Data:** 2026-09-07

**Status:** Aceito

## Contexto

Após 20 anos em gestão, estou retomando o desenvolvimento técnico com foco em 
sistemas corporativos (varejo, bancos, seguros). O projeto "Orders API" serve como 
veículo de aprendizado para dominar o ecossistema Java moderno.

## Decisão

Criar uma API de gestão de pedidos e clientes usando:
- Java 21 (LTS)
- Spring Boot 3.3
- Maven
- PostgreSQL 16 (Neon - serverless cloud)
- RabbitMQ (CloudAMQP)
- Redis (Upstash)
- Flyway (Migrations)
- GitHub Codespaces (ambiente de desenvolvimento)
- GitHub Actions (CI/CD - a partir da Semana 13)

## Alternativas Consideradas

| Alternativa | Prós | Contras |
|-------------|------|---------|
| .NET (C#) | Ótimo ecossistema | Menos alinhado com minha experiência Java |
| Python (FastAPI) | Simplicidade | Menos usado em enterprise corporativo Java |
| Node.js | Popular | Tipagem fraca, menos adequado para enterprise |

## Consequências

### Positivas
- Alinhado com stack corporativa (bancos, varejos)
- Base Java reaproveitável
- Ecossistema maduro
- 100% em nuvem (zero instalação local)

### Negativas
- Curva de aprendizado mais íngreme
- Verbosidade do Java

### Riscos
- Spring Boot 3 tem diferenças significativas do Spring antigo
- Java 21 tem muitas novidades desde o Java 8
