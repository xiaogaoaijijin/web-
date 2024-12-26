//负责业务逻辑处理
package com.Main.service.impl;

import com.Main.dao.EmpDao;
import com.Main.pojo.Emp;
import com.Main.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
//@Service
public class EmpServiceB implements Empservice {
    @Autowired//运行时，IOC容器会提供给该类型的bean对象，并赋值给该变量-依赖注入
    private EmpDao empDao;//=new EmpDaoA();
    @Override
    public List<Emp> listEmp() {
        //调用dao，获取数据
        List<Emp> empList=empDao.listEmp();
        empList.stream().forEach(emp->{
            //处理gender 1：男，2：女
            String gender=emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男士");
            }
            else if("2".equals(gender)){
                emp.setGender("女士");
            }
            //处理job-1：讲师，2：班主任，3：就业指导
            String job=emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }
            else if("2".equals(job)){
                emp.setJob("班主任");
            }
            else if("3".equals(job)){
                emp.setJob("就业指导");
            }
        });

        //响应数据
        return empList;
    }
}
