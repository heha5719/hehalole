package org.ioopm.calculator.ast;

public abstract class SymbolicExpression {

public boolean isConstant() {
    return false;
}

public double getValue() {
    throw new RuntimeException("getValue() called on expression with no constant");
}

public String getName() {
    throw new RuntimeException("getName() called on expression with no operator");
}

public int getPriority() {
    return 0;
}

public SymbolicExpression eval() {
    return null;
}
}
