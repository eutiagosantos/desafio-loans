#Serviço de Análise de Empréstimos

Este repositório contém a implementação de um serviço para determinar quais modalidades de empréstimo estão disponíveis para um cliente com base em critérios como idade, salário e localização.

Tecnologias Utilizadas

Java Spring Boot: Framework para desenvolvimento do backend.

Maven: Gerenciador de dependências.

Postman: Para testes de API.

Endpoints Disponíveis

Analisar Modalidades de Empréstimo

POST /customer-loans

Exemplo de Requisição:

{
    "age": 26,
    "cpf": "275.484.389-23",
    "name": "Vuxaywua Zukiagou",
    "income": 7000.00,
    "location": "SP"
}

Exemplo de Resposta:

{
    "customer": "Vuxaywua Zukiagou",
    "loans": [
        {
            "type": "PERSONAL",
            "interest_rate": 4
        },
        {
            "type": "GUARANTEED",
            "interest_rate": 3
        },
        {
            "type": "CONSIGNMENT",
            "interest_rate": 2
        }
    ]
}

Regras de Negócio

Empréstimos Disponíveis

Empréstimo Pessoal:

Salário ≤ R$ 3000.

Salário entre R$ 3000 e R$ 5000, idade < 30 anos e residência em São Paulo (SP).

Empréstimo Consignado:

Salário ≥ R$ 5000.

Empréstimo com Garantia:

Salário ≤ R$ 3000.

Salário entre R$ 3000 e R$ 5000, idade < 30 anos e residência em São Paulo (SP).
