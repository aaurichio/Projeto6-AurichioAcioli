package br.com.etechas.aurichioacioli.agenda_de_equipamentos.Repository;

import br.com.etechas.aurichioacioli.agenda_de_equipamentos.Model.ReservaArmario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaArmarioRepository extends JpaRepository<ReservaArmario, Long> {

    List<ReservaArmario> findByNumeroArmarioAndAtivoTrue(Integer numeroArmario);
}
