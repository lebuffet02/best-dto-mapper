package api.mapper.controller;

import api.mapper.domain.LocalizacaoDomain;
import api.mapper.dto.LocalizacaoDto;
import api.mapper.service.InformacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/info", produces = MediaType.APPLICATION_JSON_VALUE)
public class InformacoesController {

    @Autowired
    InformacoesService service;

    @PostMapping
    public ResponseEntity<LocalizacaoDomain> dadosDomain(@RequestParam(value = "id", required = false) Long id,
            @RequestBody LocalizacaoDto localizacaoDto) {
        return ResponseEntity.ok(service.dadosDomainService(id, localizacaoDto));
    }
}
