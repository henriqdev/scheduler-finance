# Desafio Backend - Spring Boot 2.7 e Java 11

## Decisões Arquiteturais

### Ferramentas e Tecnologias Utilizadas
- **Spring Boot 2.7**: A versão do Spring Boot foi pré-definida no desafio, e sua principal vantagem é a simplicidade e robustez para desenvolver aplicações web e APIs REST com Java. Ele já vem com diversas bibliotecas configuradas por padrão, facilitando o desenvolvimento.
- **Java 11**: Também foi uma escolha imposta pelo desafio, e é uma versão estável e com suporte de longo prazo (LTS). Além disso, o Java 11 traz otimizações de performance e novas funcionalidades em comparação às versões anteriores.

### Estrutura Modular
O projeto foi desenvolvido com uma arquitetura modular, onde cada módulo agrupa suas respectivas DTOs e entidades. Essa abordagem facilita a organização do código, garantindo que cada módulo possa evoluir de forma independente e mantenha uma coesão interna maior.

## Versões Utilizadas
- **Spring Boot**: 2.7.x
- **Java**: 11
- **Maven**: Gerenciador de dependências utilizado para buildar o projeto e gerenciar bibliotecas.

## Considerações de Desenvolvimento
- **Validações com Pipes e Filters:**: Para implementar validações de forma centralizada e reutilizável, eu criaria Pipes e Filters específicos para tratar as regras de negócio relacionadas às transferências. Esses pipes seriam responsáveis por validar dados como valor da transferência, datas, e outros campos importantes antes de prosseguir com o fluxo da aplicação. Essa abordagem é mais escalável e facilita a manutenção do código.
- **Execução das Transferências - Scheduler:**: Embora o desafio não tenha proposto explicitamente como seria o processo de execução das transferências agendadas, eu desenvolveria uma classe principal chamada Scheduler ou MainScheduler. Essa classe seria responsável por gerenciar e executar as transferências nas datas corretas, de acordo com o agendamento do usuário.
- **Dependência de Agendamento:**: Para agendar a execução das transferências, usaria a biblioteca Quartz Scheduler, que é uma das mais populares no ecossistema Java para agendamento de tarefas.
- **Considerações Finais:**: A arquitetura do projeto foi planejada pensando em uma estrutura modular, onde cada funcionalidade tem um papel claro e bem definido. A separação de responsabilidades e a criação de componentes reutilizáveis foi priorizada para garantir escalabilidade e manutenibilidade a longo prazo.

