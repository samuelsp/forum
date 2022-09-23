package br.com.alura.forum.dto;

import br.com.alura.forum.models.Resposta;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class RespostaDto {
    private final Long id;
    private final String mensagem;
    private final LocalDateTime dataCriacao;
    private final String nomeAutor;

    public RespostaDto(Resposta resposta) {
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataCriacao = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
    }
}
