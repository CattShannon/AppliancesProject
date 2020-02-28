package constants;

import java.util.HashMap;
import java.util.Map;

public class AllConstants {

    public static final float BASE_PRICE = 100;
    public static final float WEIGHT = 5;
    public static final String COLOR = "white";
    public static final char DEFAULT_ENERGY_CONSUMPTION = 'F';

    private AllConstants(){

    }

    public static Map<Character, Integer> listAppliancesConsumtionPrice(){
        Map<Character, Integer> validateConsumption =  new HashMap<>();

        validateConsumption.put('A', 100);
        validateConsumption.put('B', 80);
        validateConsumption.put('C', 60);
        validateConsumption.put('D', 50);
        validateConsumption.put('E', 10);
        validateConsumption.put(DEFAULT_ENERGY_CONSUMPTION, 10);

        return validateConsumption;
    }

    public static float ApplianceWeightPrice(float weight){
        float price;
        if(weight >= 0 && weight <= 19){
            price = 10;
        }else if(weight <= 49){
            price = 50;
        }else if(weight <= 79){
            price = 80;
        }else{
            price = 100;
        }
    }

}
