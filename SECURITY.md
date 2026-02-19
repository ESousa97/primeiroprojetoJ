# Política de Segurança

## Versões Suportadas

| Versão | Suportada |
|--------|-----------|
| 1.x  | :x: |
| 0.x  | :x: |

## Reportando Vulnerabilidades

Se você encontrar uma vulnerabilidade de segurança neste projeto:

1. **Não abra uma issue pública.** Vulnerabilidades de segurança não devem ser discutidas publicamente.
2. Entre em contato diretamente com o mantenedor via [LinkedIn](https://www.linkedin.com/in/enoque-sousa-bb89aa168/) ou [GitHub](https://github.com/ESousa97) descrevendo o problema (sem garantia de correção).
3. Inclua:
   - Descrição da vulnerabilidade
   - Passos para reproduzir
   - Impacto potencial
   - Sugestão de correção (se houver)

## Resposta Esperada

- **Confirmação de recebimento**: até 48 horas
- **Avaliação inicial**: sem SLA
- **Plano de mitigação**: não garantido
- **Correção publicada**: não garantida (projeto arquivado)

## Práticas de Segurança do Projeto

- Sem dependências externas de runtime (apenas JDK padrão)
- Dependabot configurado para atualizações automáticas de dependências de build/test
- CI executa build e testes em cada PR
- Workflow semanal de auditoria com OWASP Dependency-Check
- Checkstyle para análise estática de código
- Nenhum segredo ou credencial no código-fonte

## Aviso

Este é um projeto educacional/didático. Não deve ser usado em ambientes de produção sem avaliação de segurança adicional.
Por estar arquivado, não há compromisso de manutenção contínua.
