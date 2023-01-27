/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinki
 */
public class Bird {
    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName, int observation) {
        this.name = name;
        this.latinName = latinName;
        this.observation = observation;
    }

    public Bird() {
        this.name = "";
        this.latinName = "";
        this.observation = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getObservation() {
        return observation;
    }

    public void setObservation(int observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return name + "(" + latinName + "): " + observation + " observations";
    }
        
}
