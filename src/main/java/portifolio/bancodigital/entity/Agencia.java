package portifolio.bancodigital.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Agencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(nullable = true)
    private String nome;
    @Column(nullable = true)
    private Banco banco;
}