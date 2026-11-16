package org.ioopm.calculator.ast;

public abstract class Unary extends SymbolicExpression {
    private SymbolicExpression tree = null;

    public Unary(SymbolicExpression tree) {
        this.tree = tree;
    }

    public String toString() {
    /// Note how the call to toString() is not necessary
    return this.getName() + " " + this.tree.toString();
    }
    public boolean equals(Object other) {
    if (other instanceof Unary) {
        return this.equals((Unary) other);
    } else {
        return false;
    }
    }

    public boolean equals(Unary other) {
    /// access a private field of other!
    return this.getName().equals(other.getName()) && this.tree.equals(other.tree);
    }
}
