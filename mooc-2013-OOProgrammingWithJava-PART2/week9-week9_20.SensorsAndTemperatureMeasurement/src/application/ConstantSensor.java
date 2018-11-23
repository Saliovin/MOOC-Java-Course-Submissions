/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Apo
 */
public class ConstantSensor implements Sensor{
    private int sensorNumber;
    
    public ConstantSensor(int sensorNumber) {
        this.sensorNumber = sensorNumber;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        
    }

    @Override
    public void off() {
        
    }

    @Override
    public int measure() {
        return sensorNumber;
    }
    
}
