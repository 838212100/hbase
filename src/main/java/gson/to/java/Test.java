package gson.to.java;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class Test {
	
	public static void main(String[] args) {
		
		List<A> listA = new ArrayList<>();
		List<B> listB = new ArrayList<>();
		
		A a = new A();
		a.setName("a");
		a.setAge(1);
		listA.add(a);
		A a1 = new A();
		a1.setName("a1");
		a1.setAge(11);
		listA.add(a1);
		A a2 = new A();
		a2.setName("a2");
		listA.add(a2);
		a2.setAge(12);
		
		
		
		listB = copy(listA, B.class);
		listB.forEach(l -> {
			System.out.println(l.getName() + "  " + l.getAge());
		});
	}
	
	/**
	 * 从List<A> copy到List<B>
	 * @param list List<B>
	 * @param clazz B
	 * @return List<B>
	 */
	public static <T> List<T> copy(List<?> list,Class<T> clazz){
		String oldOb = JSON.toJSONString(list);
		return JSON.parseArray(oldOb, clazz);
	}

}

class B{
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}

class A{
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}