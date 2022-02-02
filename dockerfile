dockerfile

API REST foi desenvolvida utilizando Java com Spring Boot. O buildSystem foi realizado em Maven. 
Para executar o projeto é necessário baixar o projeto e executar o arquivo que encontra-se na pasta Target. 
É possível que os casos de testes não funcione pela conclusão parcial do projeto. Para falar sobre os casos de testes planejados irei falar um pouco sobre 
a ideia do projeto: 
    Como o projeto foi uma criação livre de uma API Rest, considerou-se o uso de Java como linguagem e Spring boot para auxiliar o desenvolvimento. 
A api consiste em POST, GET, DELETE e UPDATE onde há usuários com saldo e uma ID para identificação. Os casos desenhados para testes foram: 
    1-Ser possível criar usuários com saldos positivos e negativos; 
    2-Criar usuário com saldo acima de 6 dígitos, em caso de erros apresentar mensagem de erro; 
    3-Ser possível consultar todos os usuários e saldos; 
    4-Ter a possibilidade de consultar um usuário de cada vez; 
    5-Não ser possível consultar usuário sem ID; 
    6-Apresentar erro em caso de ID inexistente; 
    7-Ser possível deletar todos os usuários; 
    8-Consultar um usuário e ser possível deletar; 
    9-Consultar um ID e fazer a troca de alguma informação, deve ser possível.

Todos os casos de teste foram executados utilizando a ferramenta Postman para ter certeza que estava acontecendo como esperado. 
Para testes automatizados não foi possível executar.


Gostaria de agradecer a oportunidade dada. =D

Hiago