# 👥 Sistema de Gestão de Usuários

Projeto desenvolvido para consolidar os conceitos de **Herança**, **Polimorfismo** e **Encapsulamento estrito** no ecossistema Java moderno.

## 🚀 Tecnologias e Recursos Utilizados
* **Java 21+**
* **Sealed Classes (`sealed` / `permits`):** Utilizadas para blindar a árvore de herança e garantir controle estrito sobre quais classes podem estender a classe base.
* **Encapsulamento Avançado:** Modificadores de acesso `private` aplicados estritamente na classe mãe, eliminando métodos `set` perigosos (como alteração de privilégios de administrador em tempo de execução).

## 🛠️ Regras de Negócio Implementadas
* **Classe Abstrata `Usuario`:** Base para todos os usuários com dados comuns e controle de nível de acesso.
* **`Gerente`:** Usuário com permissão nativa de administrador (`true`), responsável por relatórios financeiros e consultas gerais.
* **`Vendedor`:** Controle individual de performance com incremento automatizado de vendas através de métodos focados.
* **`Atendente`:** Gerenciamento de fluxo de caixa com operadores aritméticos de atribuição e rotina de fechamento de caixa.

## 💻 Como Rodar o Teste
Execute a classe `MainUsuario.java` para validar as interações entre os objetos e a integridade do fluxo de dados no console.