package br.com.alura.forum.config.validation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErroDeFormularioDto {
    public String campo;
    public String erro;
}
