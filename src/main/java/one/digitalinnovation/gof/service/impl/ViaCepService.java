package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "viacep", url = "viacep.com.br/ws")
@Service
public interface ViaCepService {
    @GetMapping("/{cep}/{json}")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
