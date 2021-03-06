package com.uwang.page.entity;

/**
 * 用户实体类
 *
 */
public class UserEntity {

	private Integer id;
	private String name;
	private int age;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
