package org.dyy.creational.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院管理类
 */
class CollegeManager {

    /**
     * 返回学院的所有员工
     */
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("CollegeEmployeeID=" + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 输出所有学院员工的信息(id)
     */
    public void printAllEmployee() {
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("============College Employee============");
        for (CollegeEmployee emp : list1) {
            System.out.println(emp.getId());
        }
    }

}
