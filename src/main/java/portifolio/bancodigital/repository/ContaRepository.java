package portifolio.bancodigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import portifolio.bancodigital.entity.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>  {
}
