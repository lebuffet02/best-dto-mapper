package api.mapper.service;

import api.mapper.domain.DadosDomain;
import api.mapper.domain.LocalizacaoDomain;
import api.mapper.dto.DadosPessoaisDto;
import api.mapper.dto.LocalizacaoDto;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class InformacoesService {

    public LocalizacaoDomain dadosDomainService(Long id, LocalizacaoDto localizacaoDto) {
        return toMapperLocalizacaoDomain(id, localizacaoDto);
    }

    public LocalizacaoDomain toMapperLocalizacaoDomain(Long id, LocalizacaoDto localizacaoDto) {
        return LocalizacaoDomain.builder()
                .id(id != null ? id : new Random().nextLong(999) + 1)
                .moradia(localizacaoDto.getMoradia())
                .pontoReferencia(localizacaoDto.getPontoReferencia())
                .rua(localizacaoDto.getRua())
                .bairro(localizacaoDto.getBairro())
                .regiao(localizacaoDto.getRegiao())
                .cidade(localizacaoDto.getCidade())
                .uf(localizacaoDto.getUf() != null ? localizacaoDto.getUf().toUpperCase() : null)
                .regiaoPais(localizacaoDto.getRegiaoPais())
                .pais(localizacaoDto.getPais() != null ? localizacaoDto.getPais() : "Brasil")
                .dadosPessoais(!CollectionUtils.isEmpty(localizacaoDto.getDadosPessoais()) ? getLista(localizacaoDto.getDadosPessoais()) : new ArrayList<>())
                .build();
    }

    private DadosDomain toMapperDadosDomain(DadosPessoaisDto dadosPessoaisDto) {
        return DadosDomain.builder()
                .nome(dadosPessoaisDto.getNome())
                .sobrenome(dadosPessoaisDto.getSobrenome())
                .idade(dadosPessoaisDto.getIdade())
                .build();
    }

    private List<DadosDomain> getLista(List<DadosPessoaisDto> dadosPessoaisDtoLista) {
        return dadosPessoaisDtoLista.stream()
                .map(this::toMapperDadosDomain)
                .collect(Collectors.toList());
    }
}
