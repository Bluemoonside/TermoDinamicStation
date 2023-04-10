package view.main;
import Controler.logic.FierstCase.*;
import Controler.logic.StrategyPattern.SolveEquationStrategyPattern;

public class main {
    public static void main(String[] args) {

        Object attributesForFirstCase = null;
        var solveEcuation = new SolveEquationStrategyPattern(new FirstCase(attributesForFirstCase));
        double solution = solveEcuation.Resolve();
    }
}
