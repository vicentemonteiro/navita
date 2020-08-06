# Avaliação NAVITA - Gestão de Patrimônio e Números Familiares
Responsável por cadastrando usuários, patrimônios e marcas.
Gerador de número máximo familiar.

# Usando a API
**Utiliza padrão REST JSON, faça [DOWNLOAD](https://raw.githubusercontent.com/vicentemonteiro/navita/master/Navita.postman_collection.json) da coleção de todas as requisições no projeto [Postman](https://www.postman.com/downloads/).**

# Considerações técnicas
* Qualquer dúvida estou a disposição das equipes avaliadoras.
* Desenvolvido com o princípio de engenharia de software [KISS](https://pt.wikipedia.org/wiki/Princ%C3%ADpio_KISS), escolhida arquiteura de camadas  de controle (controller), negócio (business) e acesso a dados (dao).
* Empreguei classes concretas com injeção de dependência.
* Trata-se de uma aplicação StringBoot, portanto pode executar diretamente com o jar ou pela IDE.
* Mantive Java na versão 8 pela compatibilidade com um maior número de ambientes de execução.
* Utilizei todo conjunto de funções do SpringBoot, incluindo segurança da aplicação acesso a dados com abstração por JPA.
* Abstrai a função incluir(POST) e alterar(PUT) em uma única operação chamada salvar(POST), visando facilitar os clientes da necessidade do controle de estado, mas poderia facilmente implementar as demais caso necessário/solicitado.
* Não incorporei o script de criação do banco pois esta tarefa fica a cargo do Hibernate, cabendo controlar essa criação com o parâmetro abaixo no *application.properties*.
		`spring.jpa.hibernate.ddl-auto=create-drop`
* Utilizei o PostgreSQL, porém o Hibernate pode gerar e tratar do acesso ao SQLServer normalmente, bastando alterar o parâmetro abaixo e incluir a dependência do driver ao POM.
        `spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect`
* Desenvolvi uma funcionalidade adicional de listar todos os objetos cadastrados de cada tipo, patrimônio, usuario e marca.

# Melhorias Futuras
Em uma aplicação real consideraria melhorar alguns aspectos.

* Possivelmente utilizar o projeto [Lombok](https://projectlombok.org) para geração de código repetitivo.
* Adicionar maior cobertura de código dos testes automatizados.
* Ativar a inspeção de código PMD, Checkstyle, FindBugs, CPD.
* Aprimorar o tratamento de exceções.
* Adicionar logs.
* Adicionar comentários de código (javadoc).
* Possivelmente utilizar o [Spring REST Docs](https://spring.io/projects/spring-restdocs) para gerar a documentação dos serviços.

---
# Checklist dos requisitos originais do desafio
**Números da mesma familia**
* Organização e qualidade do código; **OK**
* Utilização de testes; **OK**

**Gerenciador de patrimônio**
* Web API REST **OK**
* Deve se utilizar C#/Java; **OK**
* Os dados devem ser salvos em SQL Server/PostgreSQL; **OK**
* Os endpoints devem utilizar o formato JSON; **OK**
* A sua aplicação deve conter um arquivo README explicando a solução adotada na sua
implementação do desafio; **OK**
* Implementar Autenticação com Token (como preferir); **OK**
* Os endpoints só poderão ser acessados por usuário autenticados (com exceção do POST de criação de usuário); **OK**
* Não se limite às funcionalidades acima. Qualquer outra feature extra é bem-vinda; (3 serviços adicionais para listagem de todos os objetos cadastrados) **OK**
* Organização e qualidade do código; **OK**
* Organização da estrutura e arquitetura desenvolvida; **OK**
* Documentação do projeto (readme); **OK**
