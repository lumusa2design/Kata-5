package is2.ulpgc.kata5;

public class AuxiliarCalculatorMethods {
    int num;

    public AuxiliarCalculatorMethods(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }

    public long NumToFactorial(){
        int factorial = 1;
        if (this.num > 1) {
            for(int i =1; i <= this.num;i++) {
                factorial *= i;
            }
        }
        return factorial;
    }


    public long NumToFibonacci() {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            int auxNum = num ;
            return NumToFibonacci(auxNum - 1) + NumToFibonacci(auxNum - 2);
        }
    }
    public long NumToFibonacci(int num) {
        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 1;
        } else {
            return NumToFibonacci(num - 1) + NumToFibonacci(num - 2);
        }
    }
}
