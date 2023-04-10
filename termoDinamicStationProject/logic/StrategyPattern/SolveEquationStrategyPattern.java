package logic.StrategyPattern;

import logic.Base.IEquation;

public class SolveEquationStrategyPattern {
    private IEquation specificCase;

    public SolveEquationStrategyPattern(IEquation specificCase) {
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