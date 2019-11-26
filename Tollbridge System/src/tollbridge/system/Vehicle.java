/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tollbridge.system;

public abstract class Vehicle {
    
    protected String reg;
    protected int weight;
    
//Constructor    
    public Vehicle (String regIn, int weightIn)
    {
        reg = regIn;
        weight = weightIn;   
    }
    
//Getters    
    public String getReg()
    {
        return reg;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public abstract double calculatefee();
}
    