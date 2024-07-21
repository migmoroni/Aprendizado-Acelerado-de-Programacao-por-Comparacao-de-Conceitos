# 9 - Paradigma Concorrente

## Concorrência Síncrona

### 1. Introdução à Concorrência Síncrona
Explicação do conceito de gerenciar múltiplas tarefas que precisam ser coordenadas e executadas em ordem específica, onde uma tarefa pode precisar esperar pela conclusão de outra.

### 2. Processos e Threads
Diferença entre processos, que são instâncias independentes de execução com seu próprio espaço de memória, e threads, que são unidades de execução dentro de um processo.

### 3. Sincronização de Threads
Métodos para coordenar o acesso a recursos compartilhados e garantir que as threads sejam executadas de forma controlada.

### 4. Locks e Mutexes
Mecanismos para garantir que apenas uma thread possa acessar um recurso compartilhado por vez, evitando conflitos e garantindo integridade dos dados.

### 5. Semáforos e Contadores
Ferramentas para controlar o acesso a um número limitado de recursos, permitindo que um número específico de threads acesse o recurso simultaneamente.

### 6. Condições de Corrida
Problemas que ocorrem quando a execução intercalada de threads leva a resultados inesperados devido a acessos simultâneos a dados compartilhados.

### 7. Deadlocks
Situações onde duas ou mais threads ficam bloqueadas esperando umas pelas outras, resultando em um impasse onde nenhuma pode continuar.

### 8. Starvation (Fome)
Problema em que uma ou mais threads não conseguem acessar os recursos necessários devido à alta concorrência e prioridades de outras threads.

### 9. Context Switching
Processo de alternar entre diferentes threads, salvando o estado de uma e carregando o estado de outra, o que pode introduzir overhead.

### 10. Programação com Futuro e Promessas
Uso de abstrações para lidar com operações que serão concluídas no futuro, permitindo que o programa continue executando enquanto aguarda resultados.

### 11. Comunicação Entre Threads
Métodos e técnicas para permitir que threads troquem informações e coordenem suas ações, utilizando mecanismos como filas de mensagens.

### 12. Modelos de Memória Compartilhada
Estratégias para gerenciar o acesso à memória compartilhada entre threads, garantindo consistência e evitando conflitos.

### 13. Modelos de Memória Exclusiva
Abordagens onde cada thread possui sua própria memória local, e comunicação entre threads é realizada explicitamente através de mensagens.

### 14. Estrutura de Dados Concorrentes
Estruturas de dados projetadas para serem utilizadas por múltiplas threads simultaneamente, com garantia de acesso seguro e eficiente.

### 15. Synchronization Primitives
Primitivas de sincronização básicas, como variáveis de condição e barreiras, utilizadas para coordenar a execução de threads.

### 16. Algoritmos de Concorrência
Algoritmos projetados para serem executados em ambientes concorrentes, abordando questões de sincronização e gerenciamento de threads.

### 17. Concorrência em Sistemas Operacionais
Como diferentes sistemas operacionais gerenciam concorrência e fornecem suporte para a execução de múltiplas threads ou processos.

### 18. Gerenciamento de Recursos
Técnicas para alocar e gerenciar recursos compartilhados entre múltiplas threads de forma eficiente e segura.

### 19. Monitoramento e Diagnóstico
Ferramentas e técnicas para monitorar e diagnosticar problemas em sistemas concorrentes, como deadlocks e condições de corrida.

### 20. Escalabilidade Concorrente
Capacidade de um sistema concorrente de lidar com um aumento no número de threads ou processos sem degradação significativa no desempenho.

## Concorrência Assíncrona

### 1. Introdução à Concorrência Assíncrona
Conceito de executar operações sem bloquear o fluxo principal do programa, permitindo que outras operações continuem enquanto se aguarda a conclusão de uma tarefa.

### 2. Callbacks
Funções passadas como argumentos que são chamadas quando uma operação assíncrona é concluída, permitindo que o programa continue executando.

### 3. Promessas (Promises)
Abstrações para representar o resultado de uma operação assíncrona, permitindo que o código continue executando enquanto a operação é realizada.

### 4. Async/Await
Sintaxe que permite escrever código assíncrono de forma síncrona, simplificando a gestão de operações assíncronas e a manipulação de promessas.

### 5. Eventos e Listeners
Mecanismo para lidar com eventos assíncronos, permitindo que o programa reaja a eventos como cliques de botão ou respostas de rede.

### 6. Microtasks e Macrotasks
Distinção entre diferentes tipos de tarefas assíncronas e como elas são gerenciadas e executadas em um loop de eventos.

### 7. Operações de Entrada/Saída Não Bloqueantes
Técnicas para realizar operações de I/O sem bloquear o fluxo principal do programa, melhorando a responsividade e o desempenho.

### 8. Thread Pool
Conjunto de threads reutilizáveis que executam tarefas assíncronas, permitindo uma gestão eficiente de recursos e reduzindo o overhead de criação de threads.

### 9. Reatividade
Abordagem onde o sistema reage a alterações de dados ou eventos em tempo real, frequentemente usada em interfaces de usuário e programação reativa.

### 10. Fluxos de Dados
Modelo de programação onde o fluxo de dados entre operações é gerenciado para facilitar a execução assíncrona e a manipulação de dados.

### 11. Task Scheduling
Planejamento e gerenciamento da execução de tarefas assíncronas, incluindo a ordem e o momento em que as tarefas são iniciadas e concluídas.

### 12. Operações Longas e Pesadas
Gerenciamento de operações que podem levar muito tempo para serem concluídas, utilizando técnicas assíncronas para evitar bloqueios.

### 13. Comunicação Assíncrona
Métodos para trocar informações entre diferentes partes do programa sem necessidade de espera, utilizando mensagens e callbacks.

### 14. Estratégias de Retry
Técnicas para reexecutar operações assíncronas que falharam devido a erros temporários ou problemas de rede.

### 15. Backpressure
Gestão de fluxo para lidar com a produção excessiva de dados ou tarefas, evitando sobrecarga e garantindo que o sistema possa processar as operações de forma eficiente.

### 16. Event Loop
Estrutura que gerencia a execução de tarefas assíncronas e eventos em sistemas baseados em eventos, como JavaScript no navegador.

### 17. Awaitable Objects
Objetos que podem ser utilizados com a sintaxe `await` para simplificar a escrita de código assíncrono e melhorar a legibilidade.

### 18. Concurrency Models
Diferentes modelos e paradigmas para gerenciar concorrência assíncrona, como o modelo de ator e o modelo de fluxo de dados.

### 19. Error Handling
Manejo de erros em operações assíncronas, incluindo técnicas para capturar e lidar com exceções que ocorrem durante a execução.

### 20. Performance e Escalabilidade
Como técnicas de concorrência assíncrona afetam a performance e a capacidade de escalar o sistema para lidar com um grande número de tarefas simultâneas.


<br><br>

### [Voltar ao Menu Principal](README-PTBR.md)