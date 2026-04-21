# PROGRAMA-O_WEB - API de Gestão Médica

API REST desenvolvida com **Spring Boot** para gerenciamento de médicos, pacientes e consultas.  
No estado atual do projeto, o módulo de **médicos** está funcional com operações de cadastro, listagem, atualização e exclusão.

## Tecnologias

- Java 17
- Spring Boot 3.5.13
- Spring Web
- Spring Data JPA
- Spring Validation (Jakarta Validation)
- H2 Database (runtime)
- Maven
- Lombok

## Funcionalidades atuais

- Endpoint de teste da API (`/ola`)
- CRUD básico de médicos (`/medicos`)
- Listagem simples e paginada de médicos
- Validação de campos no cadastro

## Estrutura do projeto

```text
src/main/java/com/medicos/api
├── controller
│   ├── OlaController.java
│   ├── MedicoController.java
│   ├── PacienteController.java
│   └── ConsultaController.java
├── model
│   ├── medico
│   ├── paciente
│   ├── consulta
│   └── endereco
└── ApiApplication.java
```

## Pré-requisitos

- JDK 17+
- Maven (ou Maven Wrapper incluído no projeto)

## Como executar o projeto

### Windows

```bash
cd api
.\mvnw.cmd spring-boot:run
```

### Linux/macOS

```bash
cd api
./mvnw spring-boot:run
```

Aplicação disponível em: `http://localhost:8080`

## Endpoints disponíveis

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/ola` | Retorna mensagem de teste da API |
| POST | `/medicos` | Cadastra um médico |
| GET | `/medicos/todos` | Lista médicos (entidade completa) |
| GET | `/medicos/listar` | Lista médicos (DTO resumido) |
| GET | `/medicos` | Lista médicos paginados |
| PUT | `/medicos` | Atualiza dados de um médico |
| DELETE | `/medicos/{id}` | Remove médico por ID |

## Exemplo de payload (cadastro de médico)

```json
{
  "nome": "Dr. João Silva",
  "email": "joao.silva@clinica.com",
  "telefone": "11999999999",
  "crm": "123456",
  "especialidade": "CARDIOLOGIA",
  "endereco": {
    "logradouro": "Rua das Flores",
    "bairro": "Centro",
    "cep": "01001000",
    "complemento": "Sala 10",
    "cidade": "São Paulo",
    "uf": "SP"
  }
}
```

## Testes

Para executar os testes:

### Windows

```bash
.\mvnw.cmd test
```

### Linux/macOS

```bash
./mvnw test
```

## Status do projeto

- Em desenvolvimento.
- `PacienteController` e `ConsultaController` ainda estão como estrutura inicial (sem endpoints implementados).
- Próximo passo recomendado: implementar regras de negócio para pacientes e consultas.
