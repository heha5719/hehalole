package org.ioopm.calculator.ast;

public class Variable extends Atom {
    private String identifier;

    public Variable(String identifier) {
        this.identifier = identifier;
    }

    public String toString() {
        return identifier;
    }

    public boolean equals(Object other) {
    if (other instanceof Variable) {
        return this.equals((Variable) other);
    } else {
        return false;
    }
    }

    public boolean equals(Variable other) {
        /// access a private field of other!
        return this.identifier.equals(other.identifier);
    }
}
