/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.debugging;

public class ExceptionExamples {
    
    

public static void main(String[] args) {
    JobType manager = new JobType("Manager", 6);
    Person employee = new Person("Bob Little", 47, manager);
    printPerson(employee);
}
public static void printPerson(Person myPerson){
    System.out.println(myPerson.name + " is " + myPerson.age +
    " years old and works as a " + myPerson.job.JobName);
    }
}


class Person{
    String name;
    int age;
    JobType job;
    Person (String name, int age, JobType job){
        this.name = name;
        this.age = age;
        this.job = job;
}
}
class JobType{
    String JobName;
    int salaryBand;
    JobType (String name, int band){
    JobName = name;
    salaryBand = band;
    }
}
