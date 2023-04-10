package logic.FierstCase;

import logic.Base.IEquation;

public class FirstCase implements IEquation {
    private Object[] attributes;

    public FirstCase(Object[] attributes) {
        this.attributes = attributes;
    }

    @Override
    public double Resolve() throws Exception {
        return null;
    }
}
