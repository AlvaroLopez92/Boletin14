/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author alvar
 */
public class ExcepcionTemperatura extends Exception {

    public ExcepcionTemperatura() {
        super("La temperatura debe ser superior a 80ºC");
    }
}