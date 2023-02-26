package org.dyy.dp.principle.demeter.uc;

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
        for (int i=0; i<10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("CollegeEmployeeID="+i);
            list.add(emp);
        }
        return list;
    }

}

