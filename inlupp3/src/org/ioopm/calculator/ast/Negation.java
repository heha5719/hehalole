package org.ioopm.calculator.ast;

public class Negation extends Unary {
    
    public Negation(SymbolicExpression tree) {
        super(tree);
    }

    public String getName() {
        return "-";
    }
/*
    public String toString() {
        return

    }
*/
    public SymbolicExpression eval(Environment vars) {
    SymbolicExpression arg = this.getTree().eval(vars);
    if (arg.isConstant()) {
        return new Constant(-(arg.getValue()));
    } else {
        return new Negation(arg);
    }
    }
}
