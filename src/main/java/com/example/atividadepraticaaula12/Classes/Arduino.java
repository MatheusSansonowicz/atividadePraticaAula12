package com.example.atividadepraticaaula12.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Arduino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String codigo;

    protected Date dataAlteracao;
    protected Date dataTentativa;
    protected boolean funcionou;
    protected boolean estadoNaHora;

}
