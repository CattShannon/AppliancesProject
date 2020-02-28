package appliancesObjects;

import constants.AllConstants;

public class WashingMachine extends Appliance {

    private final float DEFAULT_LOAD = 5;
    private float load;

    public WashingMachine (){
        super();
        this.load = this.DEFAULT_LOAD;
    }

    public WashingMachine(float weight, float basePrice){
        super(weight, basePrice);
        this.load = this.DEFAULT_LOAD;
    }

    public WashingMachine(float weight, float basePrice, float load, char energyConsumption, String color){
        super(weight, basePrice, color, energyConsumption);
        this.load = load;
    }

    @Override
    public float finalPrice(){

        return 0;
    }

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }
}
