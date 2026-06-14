# 🏦 Simulador de Conta Bancária com Cheque Especial

Projeto focado no pilar do **Encapsulamento estrito** e no desenvolvimento de lógica de negócios complexa para operações financeiras e gestão de crédito em Java.

## 🛠️ Regras de Negócio e Gestão de Crédito
* **Proteção de Saldo:** Modificadores de acesso estritos que eliminam métodos `set` perigosos, forçando toda alteração de estado a passar por auditorias internas de fluxo.
* **Cálculo de Crédito Dinâmico:** O limite do Cheque Especial é definido no construtor baseado no aporte inicial (fixado em R$ 50,00 para depósitos até R$ 500,00 ou correspondendo a 50% do valor investido).
* **Lógica Avançada de Saque:** O sistema permite a transição suave do uso do saldo real para o limite de crédito contratado caso o saque ultrapasse o saldo em conta.
* **Cobrança de Encargos Automatizada:** Ao efetuar um depósito possuindo pendências no cheque especial, o sistema calcula e retém automaticamente uma taxa de 20% sobre o valor utilizado antes de amortizar o saldo devedor.

## 💻 Como Executar
Acesse e execute a sua classe principal de testes (`ContaMain.java`) para validar os fluxos de depósitos, saques com uso de limite, cobrança de taxas e amortização automática simulados no console.s comuns simuladas no console.