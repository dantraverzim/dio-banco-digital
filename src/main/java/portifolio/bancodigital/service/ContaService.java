package portifolio.bancodigital.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portifolio.bancodigital.dto.ContaDto;
import portifolio.bancodigital.entity.Conta;
import portifolio.bancodigital.mapper.ContaMapper;
import portifolio.bancodigital.repository.ContaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ContaService {

    private ContaRepository contaRepository;

    private final ContaMapper contaMapper = ContaMapper.INSTANCE;

    public List<ContaDto> listAll() {
        List<Conta> contas = contaRepository.findAll();
        return contas.stream()
                .map(contaMapper::toDTO)
                .collect(Collectors.toList());
    }

}
