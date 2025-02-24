# Agro

Sistema *proof of concept* Java para gerenciamento Gerenciamento Agronômico, com cadastro de proprietários, fazendas, localidades e funcionarios. Usa Apache Ant para compilação e execução e SQLite para persistência dos dados.

## Estrutura

-   `bancodedados`: Classes e scripts SQL para interação com o banco de dados.
-   `modelos`: Entidades do sistema (Usuário, Restaurante, Prato, Avaliação).
-   `permanencia`: Interfaces e classes DAO para acesso aos dados.
-   `telas`: Interfaces Gráficas com o Usuário (SWing)

## Execução
Necesário JDK e Apache Ant.
1.  Compile: `ant compile`.
2.  Execute: `ant run`.

O diretório `test` inclue testes de unidade e funcionalidade dos CRUDS das entidades (JUnit)


