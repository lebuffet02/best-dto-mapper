package api.mapper.domain;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
public class LocalizacaoDomain {

    private Long id;
    private String moradia;
    private String pontoReferencia;
    private String rua;
    private String bairro;
    private String regiao;
    private String cidade;
    private String uf;
    private String regiaoPais;
    private String pais;
    private List<DadosDomain> dadosPessoais;
}
