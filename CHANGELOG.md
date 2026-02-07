# Changelog

Todas as mudanças notáveis neste projeto serão documentadas neste arquivo.

O formato segue [Keep a Changelog](https://keepachangelog.com/pt-BR/1.1.0/),
e este projeto adere ao [Versionamento Semântico](https://semver.org/lang/pt-BR/).

## [1.0.0] - 2026-02-06

### Adicionado
- Estrutura Maven com `pom.xml` completo
- Pacotes organizados: `com.esousa.interativo`, `.modulo`, `.util`
- `ConsoleUtils` — Scanner centralizado e métodos reutilizáveis de I/O
- Testes unitários com JUnit 5 (Calculadora, HelloWorld, Estudos, Perfil)
- Checkstyle configurado (baseado no Google Java Style)
- GitHub Actions CI (build + test + checkstyle em JDK 17 e 21)
- Dependabot para Maven e GitHub Actions
- Templates de Issue (Bug Report, Feature Request) e PR
- `.editorconfig`, `.gitattributes` para consistência
- Documentação completa: README, CONTRIBUTING, CODE_OF_CONDUCT, SECURITY, CHANGELOG
- Diagrama de arquitetura em `docs/architecture.md`

### Alterado
- Classes separadas em arquivos individuais (1 classe por arquivo)
- Package renomeado de `main.java` para `com.esousa.interativo`
- Scanner unificado em `ConsoleUtils` (antes: 5 instâncias separadas)
- Lógica pura extraída de I/O (`calcular()`, `gerarSaudacao()`, `gerarMensagemIdade()`)
- `PerfilInterativo` desacoplado de `EstudosInterativo` e `CalculadoraBasica`
- README reescrito de 733 linhas verbosas para ~120 linhas objetivas

### Removido
- `src/Main.java` — entry point redundante
- Arquivos `.class` do controle de versão
- Arquivo `primeiroprojetoJ.iml` (substituído por Maven)
- Diretório `.idea/` do versionamento

## [0.1.0] - 2025-04-17

### Adicionado
- Versão inicial com `SistemaInterativo.java` contendo 5 classes
- Menu interativo de console
- Funcionalidades: Hello World, Perfil, Estudos, Calculadora, Info do Sistema
