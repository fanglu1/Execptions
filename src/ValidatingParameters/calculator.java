package ValidatingParameters;

public class calculator {
    public int factorial(int num) {
        if(num < 0){
            throw new IllegalArgumentException("Can't be less than zero");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if(subsetSize < 0 || subsetSize > setSize){
            throw new IllegalArgumentException("Can't be less than zero");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
