package creational.factorymethod;

public class ConcreteFactoryA implements IFactory{
    @Override
    public IProduct createProduct() {
        return new ConcreteProductA();
    }
}
