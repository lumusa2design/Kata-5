package is2.ulpgc.kata5;

import spark.Request;

public class CalculatorService implements Service{
    @Override
    public String getPage() {
        return "<html lang='en'>\n" +
                "<head>\n" +
                "    <meta charset='UTF-8'>\n" +
                "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n" +
                "    <title>Factorial and Fibonacci Calculator</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            margin: 40px;\n" +
                "            text-align: center;\n" +
                "            background-color: #f4f4f4;\n" +
                "            color: #333;\n" +
                "        }\n" +
                "        h2 {\n" +
                "            color: #0066cc;\n" +
                "        }\n" +
                "        form {\n" +
                "            margin-top: 20px;\n" +
                "        }\n" +
                "        input {\n" +
                "            padding: 10px;\n" +
                "            background-color: #0066cc;\n" +
                "            color: #fff;\n" +
                "            border: none;\n" +
                "            border-radius: 5px;\n" +
                "            cursor: pointer;\n" +
                "            transition: background-color 0.3s ease;\n" +
                "        }\n" +
                "        input:hover {\n" +
                "            background-color: #004080;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h2>Calculator of Factorial and Fibo</h2>\n" +
                "    <form action='/calculate' method='post'>\n" +
                "        Enter a number: <input type='text' name='number'>\n" +
                "        <input type='submit' value='Calculate'>\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>";
    }

    @Override
    public String calculateValues(Request request) {
        String numberParam = request.queryParams("number");
        try {
            AuxiliarCalculatorMethods auxiliarCalculatorMethods =
                    new AuxiliarCalculatorMethods(Integer.parseInt(numberParam));
            long factorial = auxiliarCalculatorMethods.NumToFactorial();
            long fibo = auxiliarCalculatorMethods.NumToFibonacci();
            return  "<html>" +
                    "<body>" +
                    "<h2>Factorial Result</h2>" +
                    "<p>Factorial of " + auxiliarCalculatorMethods.getNum()+ " is: " + factorial + "</p>" +
                    "<p>Factorial of " + auxiliarCalculatorMethods.getNum()+ " is: " + fibo + "</p>" +
                    "</body>" +
                    "</html>";
        } catch (NumberFormatException e){
            return "<html>" +
            "<body>" +
                    "<h2>Error</h2>" +
                    "<p>Invalid number format. Please enter a valid integer.</p>" +
                    "</body>" +
                    "</html>";
        }
    }
}
