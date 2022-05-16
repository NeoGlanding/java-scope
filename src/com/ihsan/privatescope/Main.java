package com.ihsan.privatescope;

import com.ihsan.testpackage.ScopeCheck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Wolrd");

        ScopeCheck scope1 = new ScopeCheck(20);

        scope1.checkScope(10);
        scope1.checkScope();

        ScopeCheck scope2 = new ScopeCheck(10);
        ScopeCheck.InnerScope scope2a = scope2.new InnerScope("Ayam");

        scope2a.logInner();

    }
}
