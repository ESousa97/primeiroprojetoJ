# Changelog

Todas as mudanças notáveis neste projeto serão documentadas neste arquivo.

O formato segue [Keep a Changelog](https://keepachangelog.com/pt-BR/1.1.0/),
e este projeto adere ao [Versionamento Semântico](https://semver.org/lang/pt-BR/).

## [1.1.1] - 2026-02-18

### Changed
- Documentação atualizada para indicar status de projeto arquivado (sem novas atualizações).
- `CONTRIBUTING.md` ajustado para informar que PRs não serão mais processados.
- `SECURITY.md` ajustado para informar ausência de suporte ativo e sem SLA de correção.

### CI
- Dependabot configurado para não abrir novos Pull Requests automáticos.

### Deprecated
- Manutenção ativa do repositório encerrada.

## [1.1.0] - 2026-02-18

### Adicionado
- `src/main/java/com/esousa/interativo/config/ApplicationConstants.java` para centralização de constantes globais
- `.env.example` para padronização de ambiente
- Formulários de issue em YAML (`.github/ISSUE_TEMPLATE/*.yml`) e configuração de template chooser
- `CODEOWNERS`, `FUNDING.yml` e workflows de `dependency-review` e `security-audit`
- Cobertura de testes com JaCoCo no build Maven

### Alterado
- `pom.xml` com `maven-enforcer-plugin`, `jacoco-maven-plugin` e profile `security-audit`
- CI (`.github/workflows/ci.yml`) atualizado para ações estáveis e pipeline consolidado
- `dependabot.yml` com estratégia de atualização e prefixos de commit padronizados
- `CONTRIBUTING.md` e `SECURITY.md` com políticas operacionais mais objetivas
- `ConsoleUtils` agora reutiliza leitura numérica para validação de idade
- `HelloWorld` passou a tratar nome nulo/branco com fallback seguro
- `PerfilInterativo` passou a validar faixa etária explicitamente
- `CalculadoraBasica` removeu números mágicos via constantes semânticas

### Fixed
- Robustez em entradas inválidas de nome e idade
- Hardening de governança para triagem de issues e revisão de PRs

### Security
- Auditoria de dependências incorporada ao processo via OWASP Dependency-Check (workflow dedicado)

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
