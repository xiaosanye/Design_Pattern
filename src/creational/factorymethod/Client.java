package creational.factorymethod;

public class Client {
    public static void main(String[] args){
        IFactory factoryA= new ConcreteFactoryA();
        IFactory factoryB= new ConcreteFactoryB();

        IProduct productA = factoryA.createProduct();
        IProduct productB = factoryB.createProduct();

        productA.print();
        System.out.println("-----------------------------");
        productB.print();
    }
}
