package appliancesObjects;

import constants.AllConstants;

import java.util.HashMap;
import java.util.Map;

abstract class Appliance {

    protected float basePrice;
    protected float weight;
    protected String color;
    protected char energyConsumption;

    public Appliance(){
        this.basePrice = AllConstants.BASE_PRICE;
        this.weight = AllConstants.WEIGHT;
        this.color = AllConstants.COLOR;
        this.energyConsumption = AllConstants.ENERGY_CONSUMPTION;
    }

    public Appliance(float weigth, float basePrice){
        this.basePrice = basePrice;
        this.weight = weigth;
        this.color = AllConstants.COLOR;
        this.energyConsumption = AllConstants.ENERGY_CONSUMPTION;
    }

    public Appliance(float weigth, float basePrice, String color, char energyConsumption){
        this.basePrice = basePrice;
        this.weight = weigth;
        this.color = checkColor(color);
        this.energyConsumption = this.checkEnergyConsumption(energyConsumption);
    }

    private char checkEnergyConsumption(char energyConsumption){

        Map<Character, Character> validateConsumption =  new HashMap<>();

        validateConsumption.put('A', 'A');
        validateConsumption.put('B', 'B');
        validateConsumption.put('C', 'C');
        validateConsumption.put('D', 'D');
        validateConsumption.put('E', 'E');
        validateConsumption.put(AllConstants.ENERGY_CONSUMPTION, AllConstants.ENERGY_CONSUMPTION);

        return validateConsumption.getOrDefault(energyConsumption, AllConstants.ENERGY_CONSUMPTION);
    }

    private String checkColor(String color){
        Map<String, String> validateColor =  new HashMap<>();

        validateColor.put(AllConstants.COLOR, AllConstants.COLOR);
        validateColor.put("Black", "Black");
        validateColor.put("Red", "Red");
        validateColor.put("Blue", "Blue");
        validateColor.put("Gray", "Gray");
        validateColor.put(AllConstants.COLOR, AllConstants.COLOR);

        return validateColor.getOrDefault(color, AllConstants.COLOR);
    }

    public float finalPrice(){

    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(char energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
}