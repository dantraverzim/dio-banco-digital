package portifolio.bancodigital.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
    private Long id;
    @NotEmpty
    private String cpf;
    @NotEmpty
    @Size(min = 1, max = 100)
    private String nome;
}
