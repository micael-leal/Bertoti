# Bertoti
  "We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google

Comentário = Apesar do cargo ser diferente um engenheiro de software se envolve na programação, porém os engenheiros possuem uma responsabilidade maior do que os programadores. Por exemplo, estar atento às mudanças no mercado, testes de software, gerência de requerimentos e organização.

TRADE OFF

Na engenharia de software, assim como em muitas áreas, os trade-offs estão presentes. Eles se manifestam do nível micro ao macro. Os engenheiros de software precisam escolher entre diferentes opções de tipos de dados, algoritmos, estruturas de dados, frameworks, bibliotecas, linguagens, tecnologias, servidores, bancos de dados, sistemas de mensagens, padrões, modelos, designs, arquiteturas e etc que estão trocando qualidades, como extensibilidade e capacidade de manutenção. Alguns níveis de teste são inerentemente mais caros, mais lentos e mais frágeis do que outros, então não deve escrever todos eles igualmente é necessário implementar um teste pirâmide.

REQUISITOS

Situação:
Uma loja de carros precisa de um sistema na qual irá cadastrar seus clientes e então localizá-los pelo CPF, também é possível localizar através dos atributos de cada pedido podendo fazer uma comparação entre os pedidos.

Requisitos Funcionais:

• Cadastro de clientes: Cadastrar os clientes com o CPF e pedido;

• Cadastro de pedidos: modeloDoCarro, anoDoCarro, placaDoCarro, corDoCarro;

Diagrama de Casos de Uso
![Untitled (1)](https://user-images.githubusercontent.com/101812272/204935630-6a4a53b3-be98-486f-9184-2602ba795f2e.png)

Requisitos Não Funcionais:

• Usabilidade

• Transparência

• Plataforma Intuitiva e Flexível


Diagrama de Classes UML
![diagrama](https://user-images.githubusercontent.com/101812272/204941800-740fa876-279f-45d3-a463-93d280b37b3d.png)


