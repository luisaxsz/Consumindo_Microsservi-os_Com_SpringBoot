package Cep.Cep.Endereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class EnderecoController {

    @Autowired
    private EnderecoService endService;

    @GetMapping("/{cep}")
    public ResponseEntity<?> getEnd(@PathVariable("cep") String cep){
        return new ResponseEntity<>(endService.buscaEnderecoPorCep(cep), HttpStatus.OK);
    }
}
