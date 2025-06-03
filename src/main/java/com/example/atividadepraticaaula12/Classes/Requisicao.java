package com.example.atividadepraticaaula12.Classes;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
public class Requisicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    protected Date dataAlteracao;

    @Temporal(TemporalType.TIME)
    protected Time horaAlteracao;

    protected String descricao;
}
