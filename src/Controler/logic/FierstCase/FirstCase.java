package Controler.logic.FierstCase;
import Controler.logic.Base.IEquation;

public class FirstCase implements IEquation {
    private Object attributes;

    public FirstCase(Object attributes) {
        this.attributes = attributes;
    }

    @Override
    public double Resolve() throws Exception {
        return 0;
    }
}
