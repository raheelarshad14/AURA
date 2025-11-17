public class CoffeeMachine {
    private int waterLevel;
    private int beansLevel;
    private int cupsMade;

    public CoffeeMachine(int waterLevel, int beansLevel) {
        this.waterLevel = waterLevel;
        this.beansLevel = beansLevel;
    }
    public void makeCoffee(){
        if (waterLevel >= 50 && beansLevel >= 10){
         waterLevel = waterLevel - 50;
         beansLevel = beansLevel - 10;
         cupsMade = cupsMade + 1;
        }
    }
    public void refill(int water, int beans){
        waterLevel = water;
        beansLevel = beans;
    }

    public int getCupsMade() {
        return cupsMade;
    }
}
