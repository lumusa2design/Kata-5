package is2.ulpgc.kata5;

import spark.Spark;

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController() {
        this.calculatorService = new CalculatorService();
    }
    public void SetUp(){
        Spark.get("/", (request, response) -> calculatorService.getPage());
        Spark.post("/calculate", ((request, response) -> calculatorService.calculateValues(request)));
    }
}
