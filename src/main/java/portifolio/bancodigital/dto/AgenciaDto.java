package portifolio.bancodigital.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import portifolio.bancodigital.entity.Banco;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgenciaDto {
    private Long codigo;
    @NotEmpty
    @Size(min = 1, max = 100)
    private String nome;
    private Banco banco;
}
