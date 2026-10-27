package br.com.etechas.aurichioacioli.agenda_de_equipamentos.Service;

import br.com.etechas.aurichioacioli.agenda_de_equipamentos.Model.ReservaArmario;
import br.com.etechas.aurichioacioli.agenda_de_equipamentos.Repository.ReservaArmarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaArmarioService {

    @Autowired
    private ReservaArmarioRepository repository;

    public List<ReservaArmario> listar() {
        return repository.findAll();
    }


}
