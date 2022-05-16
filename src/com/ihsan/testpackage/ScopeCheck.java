package com.ihsan.testpackage;

import com.sun.source.tree.Scope;
import org.w3c.dom.ls.LSOutput;

public class ScopeCheck {
    private int outerScope;
    private int innerVariable = 30;

    public ScopeCheck(int outerScope) {
        this.outerScope = outerScope;
    }

    public void checkScope(int outerScope) {
        System.out.println("Local outerscope is " + outerScope + " and class outerscope is " + this.outerScope);
    }

    public void checkScope() {
        System.out.println("this is without parameter " + outerScope);
    }

    public class InnerScope {
        private String innerVariable;

        public InnerScope(String innerVariable) {
            this.innerVariable = innerVariable;
        }

        public void logInner() {
            System.out.println("Inner variable of innerscope is " + innerVariable + ", but the outerInner is still accesible " + ScopeCheck.this.innerVariable);
        }
    }
}
