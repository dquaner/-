package org.dyy.creational.principle.demeter.uc;

import java.util.ArrayList;
import java.util.List;

/**
 * 学校管理类
 * 分析 SchoolManager 的直接朋友：
 *  1. Employee 方法返回值
 *  2. CollegeManager 方法参数
 * CollegeEmployee 不是 SchoolManager 的直接朋友，而是一个陌生类，违反了迪米特法则
 */
class SchoolManager {

    /**
     * 返回学校总部的员工
     */
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i=0; i<5; i++) {
            Employee emp = new Employee();
            emp.setId("SchoolEmployeeID="+i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 输出学校总部和学院员工的信息(id)
     */
    void printAllEmployee(CollegeManager sub) {
        // 分析问题：
        // CollegeEmployee 以局部变量的形式出现，不是 SchoolManager 的直接朋友
        // 违反了迪米特法则
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("============College Employee============");
        for(CollegeEmployee emp: list1) {
            System.out.println(emp.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("============School Employee============");
        for(Employee emp: list2) {
            System.out.println(emp.getId());
        }
    }

}
