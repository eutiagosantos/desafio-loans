**Desafio de Análise de Empréstimos**

Este repositório apresenta um serviço para avaliar quais modalidades de empréstimos estão disponíveis para um cliente com base em idade, renda e localização.

🛠️ **Tecnologias Utilizadas**

Java Spring Boot - Framework para criação do backend.

Maven - Gerenciador de dependências.

Postman - Testes de API.

🔄 **Endpoints**

🔗 POST /customer-loans

Exemplo de Requisição:
```
{
    "age": 26,
    "cpf": "275.484.389-23",
    "name": "Vuxaywua Zukiagou",
    "income": 7000.00,
    "location": "SP"
}
```
Exemplo de Resposta:
```
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
```
🔬 **Regras de Negócio**

Empréstimo Pessoal:

Salário ≤ R$ 3000.

Salário entre R$ 3000 e R$ 5000, idade < 30 anos e residência em SP.

Empréstimo Consignado:

Salário ≥ R$ 5000.

Empréstimo com Garantia:

Salário ≤ R$ 3000.

Salário entre R$ 3000 e R$ 5000, idade < 30 anos e residência em SP.

