package com.valid.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "emp")
public class Employee
{
	@Id
	private Integer id;
	@NotNull(message = "Employee name can not be null")
	@NotEmpty(message = "Employee name can not be empty")
	private String name;
	@Min(value = 18, message = "Employee age should be greater  then equal to 4")
	@Max(value = 40, message = "Employee age should be less  then equal to 6")
	private Integer age;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public Employee(Integer id, String name, Integer age)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Employee()
	{
		super();
		// TODO Auto-generated constructor stub
	}

}
