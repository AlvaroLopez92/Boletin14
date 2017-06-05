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
public class ConvertirTemperatura {
    static final float TMIN=80;
    public static float centigradosAFarenheit(float t)throws ExcepcionTemperatura{
        if(t<TMIN){
            throw new ExcepcionTemperatura();
        }
        else{
        return (9f/5f*t)+32.4f;
        }
    }
    public static float centigradosAReamur(float t)throws ExcepcionTemperatura{
        if(t<TMIN){
            throw new ExcepcionTemperatura();
        }
        else{
            return (4f/5f*t);
        }
    }
}