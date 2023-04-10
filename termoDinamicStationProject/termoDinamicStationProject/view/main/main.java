package termoDinamicStationProject.view.main;
import logic.StrategyPattern.SolveEquationStrategyPattern;
import logic.FierstCase.*;

public class main {
    public static void main(String[] args) {

        Object[] attributesForFirstCase = null;
        var solveEcuation = new SolveEquationStrategyPattern(new FirstCase(attributesForFirstCase));
        double solution = solveEcuation.Resolve();
    }
}
