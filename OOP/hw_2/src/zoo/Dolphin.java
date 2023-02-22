package zoo;



public class Dolphin extends EatingFish implements Swimming {
    private int swimSpeed = 10;

    public Dolphin(String name) {super(name);}

    @Override
    public String say() {
        return "Prrrrr";
    }

    @Override
    public int getSpeedSwim(){return (this.swimSpeed);}
}
