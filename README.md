## Instruções para Executar o Projeto

### Requisitos
- **Java 11** ou superior instalado
- **Maven** versão 3.x ou superior instalado

### Instalação e Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/henriqdev/scheduler-finance.git

2. Acesse o diretório do projeto:
   ```bash
   cd scheduler-finance

3. Instale as dependências do Maven e compile o projeto:
   ```bash
   mvn clean install

4. Para rodar o servidor localmente:
   ```bash
   mvn spring-boot:run

### Executar em Produção

1. Para gerar um .jar de produção, utilize o seguinte comando:
   ```bash
   mvn clean package

2. O arquivo .jar gerado estará na pasta target. Para rodá-lo:
   ```bash
   java -jar target/scheduler-finance.jar
