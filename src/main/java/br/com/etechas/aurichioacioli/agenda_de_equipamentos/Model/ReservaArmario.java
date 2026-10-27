package br.com.etechas.aurichioacioli.agenda_de_equipamentos.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "RES_ARMARIO")
public class ReservaArmario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NR_ARMARIO")
    private Integer numero;

    @Column(name = "NM_ALUNO")
    private String nome;

    @Column(name = "DT_INICIO")
    private LocalDateTime dataInicio;

    @Column(name = "DT_FIM")
    private LocalDateTime dataFim;

    @Column(name = "ATIVO")
    private Boolean ativo;
}
