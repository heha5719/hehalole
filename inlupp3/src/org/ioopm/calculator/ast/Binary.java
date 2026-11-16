package org.ioopm.calculator.ast;

public abstract class Binary extends SymbolicExpression {
    private SymbolicExpression lhs = null;
    private SymbolicExpression rhs = null;

    public Binary(SymbolicExpression lhs, SymbolicExpression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
    public String toString() {
        return this.lhs.toString() + " " + this.getName() + " " + this.rhs.toString();
    }

    
    public boolean equals(Object other) {
        if (other instanceof Binary) {
            return this.equals((Binary) other);
        } else {
            return false;
        }
    }

    public boolean equals(Binary other) {
        /// access a private field of other!
        return this.getName().equals(other.getName()) && 
        this.lhs.equals(other.lhs) && 
        this.rhs.equals(other.rhs);
        }
}

