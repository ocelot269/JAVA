package org.lasencinas.updowncasting;

public class UpcastTest {

    public static void main(String[] args) {
        PartTimeManager ptm = new PartTimeManager();
        Employee emp = new Employee();
        emp.setName("Ken Wood");
        Manager mgr = new Manager();
        mgr.setName("Ken Furr"); // Inheritance of setName() at work
        // Print names
        EmpUtil.printName(emp);
        EmpUtil.printName(mgr); // Upcasting at work

        emp = mgr; // Ok. Upcasting
//mgr = emp; // A compiler error. Downcasting
        mgr = (Manager) emp; // OK. Downcast at work

        if (emp instanceof Manager) {
            // The following downcast will always succeed
            mgr = (Manager) emp;
        } else {
            // emp is not a Manager type
        }

//        Manager mgrs = null;
//        if (mgrs instanceof Clerk) {
//            // A compile-time error
//        } 
        
    }
}
