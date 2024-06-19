---
title: POO - Desafio
---
classDiagram
    iPhone "1" --* "1" ReprodutorMusical
    iPhone "1" --* "1" AparelhoTelefonico
    iPhone "1" --* "1" NavegadorInternet
    class iPhone {
        - ReprodutorMusical reprodutorMusical
        - AparelhoTelefonico aparelhoTelefonico
        - NavegadorInternet navegadorInternet

        + tocarMusica(String musica)
        + pausarMusica()
        + selecionarMusica(String musica)
        + ligar(String numero)
        + atenderChamada()
        + iniciarCorreioVoz()
        + abrirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    class ReprodutorMusical {
        <<interface>>
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        + ligar(String numero)
        + atender()
        + iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    class ImplementacaoReprodutorMusical {
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
    }

    class ImplementacaoAparelhoTelefonico {
        + ligar(String numero)
        + atender()
        + iniciarCorreioVoz()
    }

    class ImplementacaoNavegadorInternet {
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }
