package creational.abstractfactory;

public class Client {
    public static void main(String[] args){

        //如果我想组装一级的产品【由一级的ProductA和一级的ProductB组成】
        IFactory factoryA1B2= new ConcreteFactoryA1B2();
        IFactory factoryA2B1= new ConcreteFactoryA2B1();

        IProductA productA = factoryA1B2.createProductA();
        IProductB productB = factoryA2B1.createProductB();

        productA.print();
        productB.print();
    }
}
