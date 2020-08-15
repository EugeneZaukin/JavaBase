package Lesson_7;

public class Cat {
    private String name;
    private int appetit;
    private boolean full;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        this.full = false;
    }

    public void info(){
        System.out.println(name + " имеет аппетит " + appetit +  " единиц. Насыщение " + full);
    }

    public void eat(Plate plate){
        if(plate.getFood() > appetit){
            plate.decreaseFood(appetit);
            full = true;
            System.out.println(name + " съел " + appetit + " единиц. Насыщение " + full);
        }else{
            System.out.println(name + " не хватает еды. Насыщение " + full);
        }
    }
}
