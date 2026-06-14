# 🎬 Sistema de Bilheteria de Cinema

Projeto desenvolvido para explorar os conceitos de **Polimorfismo**, **Herança** e as novas estruturas de controle de tipos do Java.

## 🚀 Recursos do Java Moderno
* **Sealed Classes (`sealed abstract class`):** Utilizadas na classe mãe `Ingresso` para limitar e rastrear quais classes (`MeiaEntrada` e `IngressoFamilia`) podem estender o comportamento do ingresso.
* **Encapsulamento Avançado:** Uso estrito de modificadores `private` e métodos de acesso focados na segurança das regras de negócio.

## 🛠️ Lógica de Negócio Implementada
* **`MeiaEntrada`:** Aplica o polimorfismo dinâmico sobrescrevendo o método `getValor()` para calcular automaticamente 50% de desconto sobre o valor base.
* **`IngressoFamilia`:** Regra de negócio condicional onde, se o grupo for maior que 3 pessoas, é aplicado um desconto de 5% cumulativo por pessoa sobre o valor total do ingresso.

## 💻 Como Executar
Rode a classe `MainCinema.java` para ver a simulação de venda de ingressos e aplicação automática de descontos direto no console.