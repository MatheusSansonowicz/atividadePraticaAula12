package com.example.atividadepraticaaula12.controles;


import com.example.atividadepraticaaula12.Classes.Arduino;
import com.example.atividadepraticaaula12.repositorios.ArduinoRepositorio;
import com.example.atividadepraticaaula12.util.ControlePorta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/arduino")
public class ArduinoController {

    @Autowired
    private ArduinoRepositorio arduinoRepositorio;

    private ControlePorta controle = new ControlePorta("COM4", 9600);

    @GetMapping("/ligar")
    public String ligarLed(){
        controle.enviaDados('1');
        return "ok";
    }
    @GetMapping("/desligar")
    public String desligarLed(){
        controle.enviaDados('2');
        return "ok";
    }

    @RequestMapping
    public boolean ultimoEstadoArduino() {
        if(arduinoRepositorio.findAll().isEmpty()) {
            return false;
        }
        else if (arduinoRepositorio.findAll().getLast().isEstadoNaHora()== true) {
            return true;
        }
        return false;

    }

}
