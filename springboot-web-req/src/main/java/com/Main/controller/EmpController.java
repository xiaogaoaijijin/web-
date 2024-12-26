//接受请求，响应数据
package com.Main.controller;

import com.Main.pojo.Emp;
import com.Main.pojo.Result;
import com.Main.service.Empservice;
import com.Main.service.impl.EmpServiceA;
import com.Main.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired//运行时，IOC容器会提供给该类型的bean对象，并赋值给该变量-依赖注入
    private Empservice empService;//=new EmpServiceA();
    @RequestMapping("/listEmp")
    public Result list() {
       //调用service，获取数据
        List<Emp> empList=empService.listEmp();
        //响应数据
        return Result.success(empList);
    }














//    @RequestMapping("/listEmp")
//    public Result list() {
//        //加载并解析emp.xml文件
//        String file="D:/Intellij IDEA/Main/springboot-web-req/src/main/resources/emp.xml";
//        //this.getClass().getClassLoader().getResource("emo.xml").getFile();
//        System.out.println(file);
//        List<Emp> empList=XmlParserUtils.parse(file,Emp.class);
//        //对数据进行转换处理-gender，job
//        empList.stream().forEach(emp->{
//            //处理gender 1：男，2：女
//            String gender=emp.getGender();
//            if("1".equals(gender)){
//                emp.setGender("男");
//            }
//            else if("2".equals(gender)){
//                emp.setGender("女");
//            }
//            //处理job-1：讲师，2：班主任，3：就业指导
//            String job=emp.getJob();
//            if("1".equals(job)){
//                emp.setJob("讲师");
//            }
//            else if("2".equals(job)){
//                emp.setJob("班主任");
//            }
//            else if("3".equals(job)){
//                emp.setJob("就业指导");
//            }
//        });
//        //响应数据
//        return Result.success(empList);
//    }
}
