package portifolio.bancodigital.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import portifolio.bancodigital.entity.Conta;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BancoDto {
    private Long id;
    @NotEmpty
    private String numero;
    @NotEmpty
    @Size(min = 1, max = 100)
    private String name;
    private List<Conta> contas;
}
