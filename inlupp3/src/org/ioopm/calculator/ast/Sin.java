package org.ioopm.calculator.ast;

public class Sin extends Unary {
    
    public Sin(SymbolicExpression tree) {
        super(tree);
    }

    public String getName() {
        return "sin";
    }

    public int getPriority() {
        return 0;
    }

    public SymbolicExpression eval(Environment vars) {
    SymbolicExpression arg = this.getTree().eval(vars);
    if (arg.isConstant()) {
        return new Constant(Math.sin(arg.getValue()));
    } else {
        return new Sin(arg);
    }
}
}
