
package com.mycompany.taller_programacion_2.Modelo;


public class Auto {
    private String modelo;
    private String motor;

    public Auto(String modelo, String motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo + ", motor=" + motor + '}';
    }
    
}
