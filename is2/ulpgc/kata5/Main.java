package is2.ulpgc.kata5;

import spark.Spark;

public class Main {
    public static void main(String[] args) {
        Spark.port(8080);
        CalculatorController calculatorController = new CalculatorController();
        calculatorController.SetUp();
    }
}
