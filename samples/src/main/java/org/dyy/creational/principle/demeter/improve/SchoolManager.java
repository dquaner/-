package org.dyy.creational.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 学校管理类
 */
class SchoolManager {

    /**
     * 返回学校总部的员工
     */
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("SchoolEmployeeID=" + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 输出学校总部和学院员工的信息(id)
     */
    void printAllEmployee(CollegeManager sub) {
        // 改进：将输出学院员工的方法封装到 CollegeManager 中
        sub.printAllEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("============School Employee============");
        for (Employee emp : list2) {
            System.out.println(emp.getId());
        }
    }
}
