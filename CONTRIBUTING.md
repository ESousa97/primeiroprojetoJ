# Contribuindo

Obrigado pelo interesse em contribuir com o **Sistema Interativo Java**!

## Status do repositório

Este repositório está **arquivado** e não receberá novas funcionalidades, correções ou releases.
Pull Requests não serão revisados/mesclados.
Issues podem permanecer abertas apenas para referência histórica.

## Setup de desenvolvimento

Pré-requisitos:

- JDK 17+
- Maven 3.9+ (ou Maven Wrapper incluído)

```bash
git clone https://github.com/<seu-usuario>/primeiroprojetoJ.git
cd primeiroprojetoJ
mvnw.cmd -B -ntp dependency:resolve
```

## Fluxo de contribuição

### 1. Issues

- Verifique se já existe uma [issue aberta](https://github.com/ESousa97/primeiroprojetoJ/issues) para o que deseja reportar/sugerir.
- Use os templates de issue disponíveis: **Bug Report** ou **Feature Request**.

### 2. Fork e branch

```bash
# Fork via GitHub, depois:
git clone https://github.com/<seu-usuario>/primeiroprojetoJ.git
cd primeiroprojetoJ
git checkout -b feat/minha-contribuicao
```

### 3. Desenvolvimento

```bash
mvnw.cmd -B -ntp clean verify
mvnw.cmd -B -ntp checkstyle:check
```

### 4. Commits

Use [Conventional Commits](https://www.conventionalcommits.org/):

| Prefixo | Uso |
|----------|-----|
| `feat:` | Nova funcionalidade |
| `fix:` | Correção de bug |
| `docs:` | Documentação |
| `refactor:` | Refatoração sem mudança de comportamento |
| `test:` | Adição ou correção de testes |
| `chore:` | Manutenção, CI, configs |
| `ci:` | Mudanças de CI/CD |
| `perf:` | Melhoria de performance |
| `security:` | Correções de segurança |

Exemplo: `feat: adicionar módulo de quiz sobre Java`

### 5. Pull Request

- Preencha o template de PR.
- Garanta que `mvnw.cmd -B -ntp clean verify` passa sem erros.
- Descreva o que mudou e como testar.

## Padrões de Código

- **Estilo**: Checkstyle configurado no projeto (baseado no Google Java Style).
- **Nomenclatura**: Convenções Java padrão (camelCase, PascalCase).
- **Testes**: Toda lógica pura deve ter testes unitários (JUnit 5).
- **Documentação**: Javadoc para classes e métodos públicos.

## Branch naming

- `feat/<descricao-curta>`
- `fix/<descricao-curta>`
- `docs/<descricao-curta>`
- `refactor/<descricao-curta>`

## Validação antes de abrir PR

```bash
mvnw.cmd -B -ntp clean verify
mvnw.cmd -B -ntp checkstyle:check
mvnw.cmd -B -ntp package -DskipTests
```

## Contatos

- Portfólio: https://enoquesousa.vercel.app
- GitHub: https://github.com/ESousa97
- LinkedIn: https://www.linkedin.com/in/enoque-sousa-bb89aa168/
