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
    public void ligarLed(){
        String descricao = "ligado";
        arduinoRepositorio.save(new Arduino(descricao));
        controle.enviaDados('1');
    }
    @GetMapping("/desligar")
    public void desligarLed(){
        String descricao = "desligado";
        arduinoRepositorio.save(new Arduino(descricao));
        controle.enviaDados('2');
    }

    /*@RequestMapping
    public boolean estadoArduino() {
        if(arduinoRepositorio.findAll().isEmpty()) {
            Arduino a = new Arduino();
            return false;
        }
        else if (arduino) {
            return true;
        }
        return false;
    }*/

}
