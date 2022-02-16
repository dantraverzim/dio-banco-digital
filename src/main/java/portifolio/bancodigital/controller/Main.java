package portifolio.bancodigital.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import portifolio.bancodigital.dto.ContaDto;
import portifolio.bancodigital.service.ContaService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/banco")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class Main {

    private ContaService contaService;

    @GetMapping
    public List<ContaDto> listAll() { return contaService.listAll(); }

}
