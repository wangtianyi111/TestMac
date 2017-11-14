package com.test;

class Person{
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getInfo(){
		return "name:"+name+"\n"+"age:"+age;
	}
}
class Student extends Person{
	private String school;
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "name:"+getName()+"\n"+"age:"+getAge()+"\n"+"school:"+school;
	}
}
public class TestOverWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		Student student =new Student();
		person.setName("none");
		person.setAge(20);
        System.out.println(person.getInfo());
        student.setName("yaoyao");
        student.setAge(25);
        student.setSchool("cqupt");
        System.out.println(student.getInfo());
        
        
	}

}
