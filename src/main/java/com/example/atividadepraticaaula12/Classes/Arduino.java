package com.example.atividadepraticaaula12.Classes;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Arduino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String codigo;

    public boolean ligado;

}
