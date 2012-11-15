package calculator;

public enum CalculatorContextState {
    EXPRESSION,
    EXPRESSION_CONTINUE,
    MULTIPLICATION_EXPRESSION,
    MULTIPLICATION_EXPRESSION_CONTINUE,
    POWER_EXPRESSION,
    POWER_EXPRESSION_CONTINUE,
    POWER_EXPRESSION_END,
    ATOM_EXPRESSION,
    ARGUMENT_EXPRESSION_CONTINUE
}