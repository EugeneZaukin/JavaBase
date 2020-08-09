package Lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info(){
        System.out.println("Осталось еды: " + food);
    }

    public void decreaseFood(int amount){
        if(food >= amount){
            food = food - amount;
        }
    }

    public void growthFood(int lot){
         food = food + lot;
    }

}
