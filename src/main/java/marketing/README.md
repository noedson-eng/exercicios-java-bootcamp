## 📢 Sistema de Envio de Mensagens de Marketing

Exercício prático focado na substituição de herança por acoplamento fraco através do uso de **Interfaces** e **Polimorfismo** em Java.

### 📝 Enunciado do Problema
Escreva um código para enviar mensagens de marketing. O sistema deve ter a possibilidade de enviar a mesma mensagem para serviços diferentes. Esses serviços devem expor um método para receber a mensagem como parâmetro.
Os serviços disponíveis são:
* SMS
* E-mail
* Redes Sociais
* WhatsApp

### 🏗️ Conceitos Aplicados
* **Interfaces (Contratos):** Criação da interface `Notificador` estabelecendo o comportamento padrão de envio.
* **Polimorfismo:** Agrupamento de diferentes implementações em uma lista genérica (`List<Notificador>`), permitindo disparar mensagens em lote com um único laço de repetição.
* **Java Moderno:** Utilização de estruturas simplificadas de inicialização de coleções (`List.of()`).