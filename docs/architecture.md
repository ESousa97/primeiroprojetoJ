# Arquitetura — Sistema Interativo Java

## Visão Geral

Aplicação de console monolítica com arquitetura modular simples, projetada para fins educacionais.

## Diagrama de Componentes

```
┌─────────────────────────────────────────────────┐
│              SistemaInterativo                  │
│            (main + menu loop)                   │
│                                                 │
│  ┌───────────┬───────────┬──────────┬────────┐  │
│  │ HelloWorld│  Perfil   │ Estudos  │ Calc.  │  │
│  │           │Interativo │Interativo│ Básica │  │
│  └─────┬─────┴─────┬─────┴────┬─────┴───┬────┘  │
│        │           │          │         │        │
│        └───────────┴──────────┴─────────┘        │
│                       │                          │
│              ┌────────┴────────┐                 │
│              │  ConsoleUtils   │                 │
│              │ (Scanner único) │                 │
│              └─────────────────┘                 │
└─────────────────────────────────────────────────┘
```

## Pacotes

| Pacote | Responsabilidade |
|--------|-----------------|
| `com.esousa.interativo` | Entry point e orquestração |
| `com.esousa.interativo.modulo` | Módulos funcionais (HelloWorld, Perfil, Estudos, Calculadora) |
| `com.esousa.interativo.util` | Utilitários compartilhados (ConsoleUtils) |

## Fluxo de Execução

1. `SistemaInterativo.main()` exibe banner e entra no loop do menu
2. Usuário escolhe uma opção (1-6)
3. `SistemaInterativo` delega para o método `executar()` do módulo escolhido
4. O módulo usa `ConsoleUtils` para toda a I/O de console
5. Após execução, controle retorna ao menu principal
6. Opção 6 encerra o loop e fecha o Scanner

## Princípios

- **Separação de responsabilidades**: cada módulo encapsula uma funcionalidade
- **I/O centralizado**: `ConsoleUtils` é o único ponto de acesso ao `Scanner`
- **Testabilidade**: lógica pura (ex: `calcular()`, `gerarSaudacao()`) separada de I/O
- **KISS**: sem frameworks, sem abstrações desnecessárias para o escopo educacional

## Decisões Técnicas

### Por que Scanner centralizado?
Múltiplas instâncias de `Scanner` lendo `System.in` podem causar conflitos de buffer. Um Scanner compartilhado em `ConsoleUtils` resolve isso e elimina duplicação de código de validação.

### Por que Maven?
Padrão da indústria Java. Garante builds reprodutíveis, gerenciamento de dependências (JUnit), e integração com CI/CD.

### Por que não interfaces/herança para os módulos?
KISS. Para 4 módulos com métodos estáticos simples, uma hierarquia de classes adicionaria complexidade sem benefício proporcional. Se o sistema crescer para 10+ módulos, uma interface `Modulo` com registro dinâmico seria o próximo passo.
