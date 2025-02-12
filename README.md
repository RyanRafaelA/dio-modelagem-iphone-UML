# Booticamp DIO

## Projeto de Modelagem UML: iPhone
Este projeto tem como objetivo principal aprimorar minhas hebilidade em diagramação UML (Unified Modeling Language) e aplicar esse conhecimentos no desenvolvimento prático de um projeto Java. Através de modelagem do iPhone, exploraremos os conceitos da programação orientada a objetos (POO) e suas apliacações em um cenário real.

## Tecnologias

- **Linguagem de Programação**: Java

- **Ferramenta de Diagramação**: UML, utilizando o draw.io

## Diagrama:
```mermaid
classDiagram
    class ReprodutorMusical {
        + tocar(): boolean
        + pausar(): boolean
        + selecionarMusica(musica: String): void
    }

    class AparelhoTelefonico {
        + ligar(numero: String): void
        + atender(): boolean
        + desligar(): boolean
        + iniciarCorreioVoz(): void
    }

    class NavegadorInternet {
        + exibirPagina(url: String): void
        + adicionarNovaAba(): void
        + atualizarPagina(): void
    }

    class iPhone {
        - senha: String
        + confitmacaoSenha(senha: String): boolean
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```