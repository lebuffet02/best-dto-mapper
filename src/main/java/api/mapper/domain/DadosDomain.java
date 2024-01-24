package api.mapper.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
public class DadosDomain {

    private String nome;
    private String sobrenome;
    private String idade;
    private String genero;
}
