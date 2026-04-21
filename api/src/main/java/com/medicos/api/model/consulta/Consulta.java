package com.medicos.api.model.consulta;

import java.time.LocalDateTime;

import com.medicos.api.model.medico.Medico;
import com.medicos.api.model.paciente.Paciente;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "consultas")
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "medicoId") // Define o nome da coluna "alias" na tabela consulta. Ou seja, pega a PK do médico e transformar em FK em consulta, com o nome da coluna de medicoId.
    @ManyToOne
    private Medico medico;

    @JoinColumn(name = "pacienteId")
    @ManyToOne
    private Paciente paciente;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String observacao;

    private LocalDateTime data;

}
