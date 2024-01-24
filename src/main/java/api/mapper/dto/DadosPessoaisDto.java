package api.mapper.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
public class DadosPessoaisDto {

    private String nome;
    private String sobrenome;
    private String idade;
}
