package dependancyInjection;

public class Person {

    Food food;

    public void speak(){
        System.out.println("i am speaking absolutely fine");
    }

    public void eat(){
        food.dish();
    }
}
