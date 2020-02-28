package appliancesObjects;

import constants.AllConstants;

public class Television extends Appliance {

    private final boolean DEFAULT_TDT_TUNER = false;
    private final int DEFAULT_RESOLUTION = 20;
    private boolean tdtTuner;
    private int resolution;

    public Television(){
        super();
        this.tdtTuner = this.DEFAULT_TDT_TUNER;
        this.resolution = this.DEFAULT_RESOLUTION;
    }

    public Television(float weight, float basePrice){
        super(weight, basePrice);
        this.tdtTuner = this.DEFAULT_TDT_TUNER;
        this.resolution = this.DEFAULT_RESOLUTION;
    }

    public Television(int resolution, boolean tdtTuner, float weight, float basePrice, String color, char energyConsumption){
        super(weight, basePrice);
        this.tdtTuner = tdtTuner;
        this.resolution = resolution;
    }

    @Override
    public float finalPrice(){

        return 0;
    }

}
