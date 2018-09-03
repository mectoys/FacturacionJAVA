/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Formularios.frmLogin;

/**
 *
 * @author PC
 */
public class FacturacionJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creo el objeto Datos
        Datos misDatos= new Datos();
       
        //Llamamos el formulario de login
        frmLogin miLogin = new frmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
