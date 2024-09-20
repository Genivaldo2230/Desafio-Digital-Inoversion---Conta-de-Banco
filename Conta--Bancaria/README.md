
# ContaTerminal

Este projeto é um programa simples em Java que simula a criação e operação de uma conta bancária. O usuário pode inserir seus dados, verificar o tipo de conta, realizar depósitos e saques, e visualizar o saldo disponível.

## Funcionalidades

1. **Entrada de Dados do Usuário**:
   - Nome do Cliente
   - Agência  = foi determinado qualquer numeral sem ponto ou virgula somente numeros
   - Número da Conta

2. **Determinação do Tipo de Conta**:
   - Conta Corrente (número da conta <= 2344) foi determinado que conta abaixo dessa sao conta corrente 
   - Conta Poupança (número da conta >= 2345) foi determinado que conta abaixo dessa sao conta poupança
   - Conta Desconhecida (outros casos)

3. **Operações Bancárias**:
   - Exibição de mensagem de boas-vindas e detalhes da conta
   - Depósito inicial de R$ 5000,00
   - Saque de um valor especificado pelo usuário
   - Verificação de saldo suficiente para saque
   - Atualização e exibição do saldo disponível

## Como Executar

1. Certifique-se de ter o Java Development Kit (JDK) instalado.
2. Compile o código-fonte:
   ```bash
   javac ContaTerminal.java


java ContaTerminal

Exemplo de Uso
Ao executar o programa, o usuário será solicitado a inserir seu nome, agência e número da conta. O programa então determinará o tipo de conta e exibirá uma mensagem de boas-vindas. O saldo inicial será definido como R$ 5000,00, e o usuário poderá realizar um saque. O programa verificará se há saldo suficiente e atualizará o saldo disponível.


Observações
O código contém algumas operações redundantes e pode ser otimizado.
O saldo é atualizado várias vezes de maneira desnecessária.
A lógica de saque e depósito pode ser simplificada para evitar confusões.
Espero que isso ajude! Se precisar de mais alguma coisa, é só avisar. 
