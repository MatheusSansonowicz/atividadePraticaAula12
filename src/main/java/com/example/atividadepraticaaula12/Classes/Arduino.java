package com.example.atividadepraticaaula12.Classes;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Entity
@Data
public class Arduino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long codigo;

    @Temporal(TemporalType.DATE)
    protected Date dataAlteracao;

    @Temporal(TemporalType.TIME)
    protected Time horaAlteracao;

    protected String descricao;

    public Arduino(String descricao) {
        this.descricao = descricao;
    }

    public Arduino() {

    }
}
