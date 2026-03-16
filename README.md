Atividade: Monolítico vs Modular

Este projeto em Java demonstra a diferença prática entre um código monolítico e um código modularizado. O sistema base calcula descontos progressivos dependendo da quantidade de itens comprados.

O repositório é composto por três ficheiros principais:

1. LojaRoupasMonolitica.java
Este ficheiro contém a versão monolítica do sistema. A regra de cálculo de desconto e a impressão do recibo estão acopladas no mesmo bloco de código, dificultando a reutilização.
Resultado da execução: O código processa a venda de 12 camisetas. Exibe o valor original de R$ 600,00, aplica o desconto correspondente de R$ 60,00 e mostra o total a pagar de R$ 540,00.

2. ModulosReutilizaveis.java
Este ficheiro resolve o problema do acoplamento. Nele, a lógica foi separada em módulos independentes: uma classe responsável apenas por calcular a matemática dos descontos e outra responsável apenas por exibir o recibo no ecrã.

3. Atacadao.java
Este ficheiro demonstra a vantagem da modularização. Simula um novo sistema, de um atacado de alimentos, que reutiliza as lógicas de cálculo e impressão do ficheiro "ModulosReutilizaveis.java" sem precisar de reescrever as regras. 
Resultado da execução: O código processa duas vendas distintas (25 fardos de arroz e 8 caixas de óleo). Calcula os descontos dinamicamente (R$ 112,50 e R$ 3,56, respetivamente) usando a exata mesma lógica que foi separada no passo anterior.
