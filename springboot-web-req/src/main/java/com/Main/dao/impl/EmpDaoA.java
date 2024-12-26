//负责数据访问操作
package com.Main.dao.impl;

import com.Main.dao.EmpDao;
import com.Main.pojo.Emp;
import com.Main.utils.XmlParserUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Component//将当前类交给IOC容器管理，成为IOC容器中的bean
@Repository//@Component,@Repository都能用
public class EmpDaoA implements EmpDao{

    @Override
    public List<Emp> listEmp() {
        String file="D:/Intellij IDEA/Main/springboot-web-req/src/main/resources/emp.xml";
        //this.getClass().getClassLoader().getResource("emo.xml").getFile();
        System.out.println(file);
        List<Emp> empList=XmlParserUtils.parse(file,Emp.class);
        return empList;

}
}
