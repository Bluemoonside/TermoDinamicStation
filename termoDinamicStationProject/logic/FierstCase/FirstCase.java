package logic.FierstCase;

import logic.Base.IEcuation;

public class FirstCase implements IEcuation {
    private IEcuation ecuation;

    public FirstCase(IEcuation ecuation) {
        this.ecuation = ecuation;
    }

    @Override
    public double Resolve() throws Exception {
        return this.ecuation.Resolve();
    }
}
