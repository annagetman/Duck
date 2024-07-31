public class MallardDuck extends Duck implements Flyeble{
    @Override
    void display() {
        System.out.printf("Malardak :");
        super.display();
    }

    @Override
    public void fly() {
System.out.println("I'm flying with MallardDuck");
    }
}
