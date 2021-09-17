package dev.franzon.mutation;


class SimpleCalculator {

    public Double calculate(Double a, Double b, Operator op) {
        if (op == Operator.ADD)
            return a + b;

        if (op == Operator.MINUS)
            return a - b;

        if (op == Operator.MULT)
            return a * b;

        if (op == Operator.DIV)
            return a / b;

        throw new IllegalArgumentException("Invalid operation");
    }
}
