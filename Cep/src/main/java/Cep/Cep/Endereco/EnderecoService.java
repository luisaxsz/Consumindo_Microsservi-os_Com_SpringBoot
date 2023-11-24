package Cep.Cep.Endereco;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
public interface EnderecoService {
    @GetMapping("/{cep}/json")
    public Endereco buscaEnderecoPorCep(@PathVariable("cep") String cep);
}
