package org.dyy.dp.principle.demeter.uc;

public class MainActivity {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

