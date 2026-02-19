## Contexto

Descreva de forma objetiva o problema resolvido por este PR.

## Tipo de mudança

- [ ] `feat` nova funcionalidade
- [ ] `fix` correção de bug
- [ ] `refactor` melhoria sem alteração de comportamento
- [ ] `docs` documentação
- [ ] `test` testes
- [ ] `ci` pipeline/automação
- [ ] `security` segurança

## Evidências de validação

Cole aqui a saída dos comandos executados localmente:

```bash
mvnw.cmd -B -ntp clean verify
mvnw.cmd -B -ntp checkstyle:check
```

## Checklist

- [ ] Mantém compatibilidade com comportamento existente
- [ ] Testes adicionados/atualizados quando necessário
- [ ] Não expõe credenciais, tokens ou dados sensíveis
- [ ] Documentação foi atualizada quando aplicável
- [ ] Commits seguem Conventional Commits

## Como revisar

Liste passos para reproduzir e validar manualmente.
