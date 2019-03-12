/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.updowncasting;

public class LateBindingTest {

    public static void main(String[] args) {
        LateBindingSuper lbSuper = new LateBindingSuper();
        LateBindingSub lbSub = new LateBindingSub();

        // Will access LateBindingSuper.print()
        lbSuper.print(); // #1
        // Will access LateBindingSub.print()
        lbSub.print(); // #2
        // Will access LateBindingSub.print()
        ((LateBindingSuper) lbSub).print(); // #3
        // Assign the lbSub to lbSuper
        lbSuper = lbSub; // Upcasting
        // Will access LateBindingSub.print() because lbSuper
        // is referring to a LateBindingSub object
        lbSuper.print(); // #4
    }
}
