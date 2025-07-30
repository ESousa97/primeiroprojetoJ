# DesafioJava1

![Pull Requests](https://img.shields.io/github/issues-pr/ESousa97/DesafioJava1?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/ESousa97/DesafioJava1?style=for-the-badge)
![GitHub top language](https://img.shields.io/github/languages/top/ESousa97/DesafioJava1?style=for-the-badge)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/ESousa97/DesafioJava1?style=for-the-badge)

<div align="center">

![Imagem do Projeto](/assets/Desafios.png)

</div>

Projeto Java inicial que implementa exercícios básicos, incluindo saudações personalizadas e operações matemáticas simples, como parte de um desafio de programação.

## 🚀 Funcionalidades

### Sistema Interativo Principal
- **Hello World Interativo**: Saudações personalizadas com diferentes estilos (clássica, formal, descontraída)
- **Perfil Interativo**: Coleta e exibição de informações pessoais com validações
- **Sistema de Estudos**: Anotações de aprendizado e dicas de estudo em Java
- **Calculadora Básica**: Operações matemáticas fundamentais (soma, subtração, multiplicação, divisão)
- **Informações do Sistema**: Detalhes do ambiente de execução Java

### Funcionalidades Básicas
- Hello World simples
- Perfil básico do usuário

## 🛠️ Tecnologias Utilizadas

- **Java 21**: Linguagem principal do projeto
- **Scanner**: Para entrada de dados do usuário
- **LocalDateTime**: Para manipulação de data e hora
- **InputMismatchException**: Para tratamento de erros de entrada
- **DateTimeFormatter**: Para formatação de datas

## 📋 Pré-requisitos

- JDK 11 ou superior
- IntelliJ IDEA (ou outra IDE Java compatível)

## ⚙️ Como Instalar e Configurar

1. Clone o repositório:
   ```bash
   git clone https://github.com/ESousa97/DesafioJava1.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd DesafioJava1/
   ```

3. Abra o projeto `primeiroprojetoJ` em sua IDE Java (ex: IntelliJ IDEA)

4. Nenhuma configuração adicional de dependências é necessária além do JDK

## ▶️ Como Executar

### Sistema Interativo Completo (Recomendado)
- Localize e execute o método `main` da classe `SistemaInterativo`
- Arquivo: `src/main/java/SistemaInterativo.java`
- Esta versão oferece menu interativo com todas as funcionalidades

### Outras opções de execução:

**Para executar a aplicação principal do desafio:**
- Localize e execute o método `main` da classe `desafio1.Perfil` 
- Arquivo: `src/desafio1/Perfil.java`

**Para um teste simples "Alô Mundo":**
- Localize e execute o método `main` da classe `Main` 
- Arquivo: `src/Main.java`

## 📖 Estrutura do Projeto

```
primeiroprojetoj/
├── .gitignore
├── .idea/
│   ├── .gitignore
│   ├── misc.xml
│   ├── modules.xml
│   └── vcs.xml
├── assets
|     └── Desafios.png
├── README.md
├── primeiroprojetoJ.iml
└── src/
    ├── Main.java                    # Hello World básico
    └── main
         └── java
              └── SistemaInterativo.java   # Sistema interativo completo
```

## 🎯 Como Usar o Sistema Interativo

1. Execute o `SistemaInterativo.java` localizado em `src/main/java/`
2. O sistema exibirá um banner de boas-vindas com data/hora atual
3. Escolha uma das opções do menu principal:
   - **1 - Hello World Clássico**: Saudações personalizadas com seu nome
   - **2 - Perfil Interativo**: Crie um perfil completo com validações
   - **3 - Estudos e Anotações**: Acesse anotações de Java e adicione suas próprias
   - **4 - Calculadora Básica**: Realize operações matemáticas
   - **5 - Informações do Sistema**: Veja detalhes do ambiente Java
   - **6 - Sair**: Encerra o programa

4. Siga as instruções na tela para cada funcionalidade
5. O sistema possui validação de entrada e tratamento de erros
6. Pressione Enter para retornar ao menu principal após cada operação

## 🎨 Exemplos de Uso

### Hello World Interativo
```
HELLO WORLD INTERATIVO
========================================
Digite seu nome (ou pressione Enter para usar 'Mundo'): João
Escolha o tipo de saudação:
1 - Clássica
2 - Formal
3 - Descontraída  
4 - Todas
Opção (1-4): 2

Resultado:
Seja bem-vindo(a), João. É um prazer tê-lo(a) aqui!
```

### Perfil Interativo
```
PERFIL INTERATIVO
========================================
Qual é o seu nome? Maria Silva
Qual é a sua idade? 28
Qual é a sua profissão? Desenvolvedora
Qual é o seu hobby favorito? Programação

Seu Perfil:
------------------------------
Nome: Maria Silva
Idade: 28 anos
Profissão: Desenvolvedora
Hobby: Programação
Você está na melhor fase da vida.
Tudo bem, Maria Silva?
```

### Calculadora Básica
```
CALCULADORA BÁSICA
========================================
Escolha uma operação:
1 - Soma
2 - Subtração
3 - Multiplicação
4 - Divisão
5 - Operações pré-definidas (10+5 e 10-5)
Opção (1-5): 1
Digite o primeiro número: 15.5
Digite o segundo número: 4.3

Resultado:
15,50 + 4,30 = 19,80
```

## 🔧 Recursos Técnicos

- **Validação de Entrada**: Tratamento de `InputMismatchException` em todas as entradas numéricas
- **Interface Limpa**: Uso de separadores visuais e formatação consistente
- **Gestão de Buffer**: Limpeza adequada do buffer do Scanner
- **Modularização**: Código organizado em classes específicas para cada funcionalidade
- **Informações do Sistema**: Acesso a propriedades do sistema Java em tempo de execução

---

> ✨ **Criado em:** 17 de abr. de 2025 às 22:21