package homework12;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class two {

	
	
	static Set<Student> stus = new TreeSet<Student>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String id, name;
		int age;
		System.out.print("Enter student's id: ");
		while (in.hasNext()) {
			id = in.next();
			if (id.compareTo("exit") == 0) break;
			System.out.print("Enter student's name: ");
			name = in.next();
			System.out.print("Enter student's age: ");
			age = in.nextInt();
//			Student s = new Student(id, name, age);
			stus.add(new Student(id, name, age));
			System.out.print("Enter student's id: ");
		}
		
		Iterator<Student> it = stus.iterator();
		while (it.hasNext()) {
			Student stu = (Student)it.next();
			System.out.println("id:" + stu.id + " name:" + stu.name + " age:" + stu.age);
		}
	}

}

class Student implements Comparable {
	public String id, name;
	public int age;
	
	public Student() {
		
	}
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Object o) {
		Student p = (Student) o;
		if (this.age < p.age) return -1;
		return 1;
	}
}
