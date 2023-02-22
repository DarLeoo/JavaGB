package zoo;

public abstract class EatingFish extends Animal {
    public EatingFish(String name) {
        super(name);
    }
    @Override
    public String feed(){
        return ("рыбу ");
    }
}
