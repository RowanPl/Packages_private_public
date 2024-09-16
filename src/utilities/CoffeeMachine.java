package utilities;

public class CoffeeMachine {
    private int count = 0;


    public void makeCoffee() {

        if (count == 3){
            clean();
            count = 0;
        }
        System.out.println("Making coffee...");
        count += 1;
    }

    private void clean() {
        System.out.println("Cleaning...");
    }


}
