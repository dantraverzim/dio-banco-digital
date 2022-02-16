package portifolio.bancodigital.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import portifolio.bancodigital.dto.ContaDto;
import portifolio.bancodigital.entity.Conta;

@Mapper
public interface ContaMapper {

    ContaMapper INSTANCE = Mappers.getMapper(ContaMapper.class);
    Conta toModel(ContaDto contaDto);

    ContaDto toDTO(Conta geek);
}
