# Bertoti
  "We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google

Comentário = Apesar do cargo ser diferente um engenheiro de software se envolve na programação, porém os engenheiros possuem uma responsabilidade maior do que os programadores. Por exemplo, estar atento às mudanças no mercado, testes de software, gerência de requerimentos e organização.

TRADE OFF

Na engenharia de software, assim como em muitas áreas, os trade-offs estão presentes. Eles se manifestam do nível micro ao macro. Os engenheiros de software precisam escolher entre diferentes opções de tipos de dados, algoritmos, estruturas de dados, frameworks, bibliotecas, linguagens, tecnologias, servidores, bancos de dados, sistemas de mensagens, padrões, modelos, designs, arquiteturas e etc que estão trocando qualidades, como extensibilidade e capacidade de manutenção. Alguns níveis de teste são inerentemente mais caros, mais lentos e mais frágeis do que outros, então não deve escrever todos eles igualmente é necessário implementar um teste pirâmide.

REQUISITOS

Situação:
Um restaurante estabelece um sistema chamado garçom para o cadastro de clientes, onde ele poderá localizar por seu nome ou através dos atributos incluído no pedido, sendo possível comparar os dados entre os pedidos.

Requisitos Funcionais:

• Cadastro de clientes: Realiza o cadastro do cliente com os seguintes dados, nome e pedido;

• Cadastro de pedidos: Introduz os dados, numeroDaMesa, horaDoPedido, tipoDeGrao, tipoDeSalada, acompanhamento;

Diagrama de Casos de Uso
![image](https://user-images.githubusercontent.com/101812272/203682840-1b123870-7dff-4dee-8a51-ec632352e9a7.png)

Requisitos Não Funcionais:

• Usabilidade

• Transparência

• Plataforma Intuitiva e Flexível


Diagrama de Classes UML
![Sem título](https://user-images.githubusercontent.com/101812272/203975722-7ef53b78-d8cc-4c1b-9b55-405c8b626fae.png)


