## 💰 Sistema de Cálculo de Tributos por Tipo de Produto

Exercício prático focado na aplicação de regras de negócio distintas utilizando **Interfaces** para padronizar o comportamento de cálculo de impostos, combinado com o uso de **Polimorfismo**.

### 📝 Enunciado do Problema
Escreva um código que calcule o valor de tributos de produtos de acordo com a sua categoria. Todos os produtos devem expor um método para retornar o valor do imposto com base nas seguintes regras:
* **Alimentação:** 1%
* **Saúde e Bem-estar:** 1,5%
* **Vestuário:** 2,5%
* **Cultura:** 4%

### 🏗️ Conceitos Aplicados
* **Dynamic Binding & Polimorfismo:** Criação da lista `List<Tributavel>` para iterar sobre tipos heterogêneos de produtos de forma genérica.
* **Reflexão (Reflection):** Utilização do método `item.getClass().getSimpleName()` para extrair dinamicamente o nome de cada classe executada no console.
* **Clean Code:** Métodos com responsabilidade única e desacoplados da lógica de exibição.