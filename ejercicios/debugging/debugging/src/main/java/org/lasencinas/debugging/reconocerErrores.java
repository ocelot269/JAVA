/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.debugging;

/**
 *
 * @author ozeh
 */
public class reconocerErrores {

public static void main(String[] args) {
    int age = 30;
    double retirementFund = 10000;
    int yearsInRetirement = 20;
    String name = "David Johnson";
    for (int i = age; i <= 65; i++){
    retirementFund = recalculate(retirementFund,0.1);
    }
    double monthlyPension = retirementFund/yearsInRetirement/12;
    System.out.println(name + " will have $" + monthlyPension
    + " per month for retirement.");
    }
public static double recalculate(double fundAmount, double rate){
    return fundAmount*(1+rate);
}
}

