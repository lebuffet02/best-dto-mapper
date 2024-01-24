package api.mapper.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
public class LocalizacaoDto {

    private String moradia;
    private String pontoReferencia;
    private String rua;
    private String bairro;
    private String regiao;
    private String cidade;
    private String uf;
    private String regiaoPais;
    private String pais;
    private List<DadosPessoaisDto> dadosPessoais;
}
