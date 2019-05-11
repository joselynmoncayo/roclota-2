/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rockola;

import javax.swing.JProgressBar;

/**
 *
 * @author MARQUEZA PC
 */
public class Cargar extends Thread{
    
     JProgressBar progreso;

    public Cargar(JProgressBar progreso) {
        super();
        this.progreso = progreso;

    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            progreso.setValue(i);
            pausa(30);
        }
    }

    public void pausa(int mlseg) {
        try {
            Thread.sleep(mlseg);

        } catch (Exception e) {

        }
    }

    public JProgressBar getjProgressBar() {
        return progreso;
    }

    public void setjProgressBar(JProgressBar jProgressBar) {
        this.progreso = jProgressBar;
    }

}
    

