# Contribuindo

Obrigado pelo interesse em contribuir com o **Sistema Interativo Java**!

## Como Contribuir

### 1. Issues

- Verifique se já existe uma [issue aberta](https://github.com/ESousa97/primeiroprojetoJ/issues) para o que deseja reportar/sugerir.
- Use os templates de issue disponíveis: **Bug Report** ou **Feature Request**.

### 2. Fork e Branch

```bash
# Fork via GitHub, depois:
git clone https://github.com/<seu-usuario>/primeiroprojetoJ.git
cd primeiroprojetoJ
git checkout -b feature/minha-contribuicao
```

### 3. Desenvolvimento

```bash
# Compilar
mvn compile

# Rodar testes
mvn test

# Verificar estilo
mvn checkstyle:check
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

Exemplo: `feat: adicionar módulo de quiz sobre Java`

### 5. Pull Request

- Preencha o template de PR.
- Garanta que `mvn verify` passa sem erros.
- Descreva o que mudou e como testar.

## Padrões de Código

- **Estilo**: Checkstyle configurado no projeto (baseado no Google Java Style).
- **Nomenclatura**: Convenções Java padrão (camelCase, PascalCase).
- **Testes**: Toda lógica pura deve ter testes unitários (JUnit 5).
- **Documentação**: Javadoc para classes e métodos públicos.

## Ambiente de Desenvolvimento

- JDK 17+
- Maven 3.8+
- IDE recomendada: IntelliJ IDEA, VS Code ou Eclipse
