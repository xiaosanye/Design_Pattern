package creational.abstractfactory;

public class ConcreteFactoryA2B1 implements IFactory {

    @Override
    public IProductA createProductA() {
        return new ConcreteProductALEVEL2();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreteProductBLEVEL1();
    }
}
