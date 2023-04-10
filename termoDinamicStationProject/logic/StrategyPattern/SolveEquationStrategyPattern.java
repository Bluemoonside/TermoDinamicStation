package logic.StrategyPattern;

import logic.Base.IEcuation;

public class SolveEquationStrategyPattern {
    private IEcuation specificCase;

    public SolveEquationStrategyPattern(IEcuation specificCase) {
        this.specificCase = specificCase;
    }
    public double Resolve(){
        try {
            return this.specificCase.Resolve();
        } catch (Exception e) {
            return 0;
        }
    }
}
