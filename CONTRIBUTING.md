## Contribuindo

É possível contribuir basicamente de 3 formas: criando issues, abrindo pull requests e revisando pull requests.
Criando Issues

Se você encontrar qualquer problema, tiver alguma sugestão ou gostaria que fosse incluído um novo algoritmo específico ou uma nova linguagem, fique à vontade para criar uma issue. Em casos de pequenas correções ou inclusão de algoritmos já listados, em uma linguagem ainda não implementada, basta abrir um novo PR diretamente.

Antes de criar a issue verifique se já não existe outra issue semelhante e lembre-se de detalhar o problema encontrado ou sugestão proposta.
Abrindo Pull Requests

Também é possível contribuir abrindo um Pull Request (PR) com a solução para algum problema ou a inclusão de um novo algoritmo.

Ao abrir um PR lembre-se de incluir uma descrição relevante sobre as alterações realizadas e, em caso de inclusão de novos algoritmos, adicionar um link no README do projeto.
Revisando Pull Requests

Outra forma de contribuir com o projeto é revisando PRs abertos. Se você tem domínio sobre algum algoritmo, estrutura de dados ou até mesmo linguagem de programação específica, fique à vontade para auxiliar na revisão dos PRs abertos.

No momento da revisão lembre-se de ser cordial/educado e, se possível, teste manualmente a alteração ou correção antes de aprovar o PR.

E antes de enviar um PR, sempre verifique se sua branche está sincronizada com a master (essa principal), solicitando que esta seja sincronizada antes de enviar seu PR.



## Padrões deste Projeto

Como medida de padronizar todo o projeto, aqui deixo de forma simples um guia a lhe auxiliar a seguir os padrões de nomes e termos:

### Estrutura das pastas:

Arquives:
Contem arquivos gerais, não relacionados a código do projeto.

Languages:
Contem todas as linguagens em subpastas, sendo o local para armazenamento de todos os códigos de consulta.

Pages:
Contem os conteúdos explicativos dos códigos de consulta.

### Nomes das pastas e arquivos:



### Estrutura dos códigos:

Variaveis:
Uso de snake case, onde no inicio sempre usa-se o termo "var" seguido do termo do meio, onde é "_int" caso seja um inteiro e por último, de um numero, para diferenciar. Ex:
var_int1, var_double3, var_result2

Os termos do meio, podem ser desde referentes ao tipo (_int = inteiro), como também a sua ação (_result = resultado).