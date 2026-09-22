# TDE 1 — SOLID em Java

Implementação individual das **Atividades 1 e 2** do TDE 1, desenvolvidas em Java.

**Aluna:** Karine Vanessa da Conceição Galvão

## Objetivo

Aplicar princípios de orientação a objetos e SOLID na refatoração de dois cenários:

- **Atividade 1:** aplicar o Princípio da Responsabilidade Única (SRP) ao módulo de usuário e autenticação.
- **Atividade 2:** refatorar um sistema de notificações aplicando SRP, interface, polimorfismo, princípio Aberto/Fechado (OCP) e validação de mensagens vazias.

## Estrutura do projeto

```text
TDE1-SOLID-Java/
├── atividade1/
│   ├── Usuario.java
│   ├── AutenticadorUsuario.java
│   └── Main.java
└── atividade2/
    ├── CanalNotificacao.java
    ├── Notificacao.java
    ├── NotificacaoEmail.java
    ├── NotificacaoSMS.java
    ├── NotificacaoTelegram.java
    ├── ServicoNotificacao.java
    └── Main.java
```

## Atividade 1 — Princípio da Responsabilidade Única

A classe `Usuario` fica responsável somente por armazenar os dados do usuário. A autenticação é realizada pela classe `AutenticadorUsuario`, separando as responsabilidades.

A autenticação é simulada com **90% de chance de sucesso**, conforme solicitado no enunciado, desde que a senha informada esteja correta.

## Atividade 2 — Sistema de notificações

Foi criada a interface `CanalNotificacao`, implementada por diferentes canais de envio.

O `ServicoNotificacao` apenas coordena o envio e não conhece os detalhes de funcionamento de cada canal.

Foram implementados:

- `NotificacaoEmail`
- `NotificacaoSMS`
- `NotificacaoTelegram`

A classe abstrata `Notificacao` centraliza a validação para impedir o envio de mensagens nulas ou vazias.

A inclusão de `NotificacaoTelegram` demonstra o **Princípio Aberto/Fechado (OCP)**: um novo canal pode ser adicionado sem alterar `ServicoNotificacao`.

## Como executar

Na raiz do projeto:

### Atividade 1

```bash
javac atividade1/*.java
java atividade1.Main
```

### Atividade 2

```bash
javac atividade2/*.java
java atividade2.Main
```

## Tecnologias

- Java
- Programação Orientada a Objetos
- Princípios SOLID
