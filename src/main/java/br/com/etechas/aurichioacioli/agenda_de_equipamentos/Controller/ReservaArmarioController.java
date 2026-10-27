package br.com.etechas.aurichioacioli.agenda_de_equipamentos.Controller;

import br.com.etechas.aurichioacioli.agenda_de_equipamentos.Model.ReservaArmario;
import br.com.etechas.aurichioacioli.agenda_de_equipamentos.Service.ReservaArmarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/armarios")
public class ReservaArmarioController {

    @Autowired
    private ReservaArmarioService service;

    @GetMapping
    public List<ReservaArmario> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ReservaArmario buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

}
