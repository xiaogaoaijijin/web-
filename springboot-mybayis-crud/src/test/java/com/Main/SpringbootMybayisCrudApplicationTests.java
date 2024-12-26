package com.Main;

import com.Main.mapper.EmpMapper;
import com.Main.pojo.Emp;
import org.apache.ibatis.annotations.Select;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootMybayisCrudApplicationTests {
	@Autowired
	private EmpMapper empMapper;
	@Test
	public void testDelete(){
		int delete=empMapper.delete(25);
		System.out.println(delete);
	}
	@Test
	public void testInsert(){
		Emp emp=new Emp();
		emp.setUsername("Tom1");
		emp.setName("汤姆1");
		emp.setImage("2.jpg");
		emp.setGender((short)2);
		emp.setJob((short)2);
		emp.setEntrydate(LocalDate.of(2001,2,2));
		emp.setCreateTime(LocalDateTime.now());
		emp.setUpdateTime(LocalDateTime.now());
		emp.setDeptId(2);
		empMapper.insert(emp);
	}

	@Test
	public void testUpdate(){
		Emp emp=new Emp();
		emp.setId(18);
		emp.setUsername("Tom1");
		emp.setName("汤姆1");
		emp.setImage("2.jpg");
		emp.setGender((short)1);
		emp.setJob((short)1);
		emp.setEntrydate(LocalDate.of(2001,2,2));
		//emp.setCreateTime(LocalDateTime.now());
		emp.setUpdateTime(LocalDateTime.now());
		emp.setDeptId(2);
		empMapper.update(emp);
	}
	@Test
	public void testGetById(){
		Emp emp=empMapper.getById(15);
		System.out.println(emp);
	}

	@Test
	public void testList(){
		//List<Emp> empList=empMapper.list("张",(short)1,LocalDate.of(2010,1,1),LocalDate.of(2020,1,1));
		List<Emp> empList=empMapper.list("张",null,null,null);
		System.out.println(empList);
	}

	@Test
	public void testUpdate2(){
		//构造员工对象
		Emp emp=new Emp();
		emp.setId(18);
		emp.setUsername("Tom222");
		emp.setName("汤姆111");
		emp.setGender((short)1);
		emp.setUpdateTime(LocalDateTime.now());
		empMapper.update2(emp);
	}
	@Test
	public void testDeleteByIds(){
		List<Integer> ids= Arrays.asList(14,15,18);
		empMapper.deleteById(ids);
	}

}
