package gyub.study.sort.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLibraryMain {

	public static void main (String [] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("황규빈", 10));
		studentList.add(new Student("김규빈", 13));
		studentList.add(new Student("백규빈", 26));
		studentList.add(new Student("콩규빈", 32));
		studentList.add(new Student("흑규빈", 22));
		studentList.add(new Student("황규빈", 28));
		studentList.add(new Student("김규빈", 28));
		studentList.add(new Student("백규빈", 28));
		studentList.add(new Student("콩규빈", 28));
		studentList.add(new Student("흑규빈", 28));
		System.out.println("정렬전");
		printList(studentList);
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.getAge(),  o2.getAge());
			}
		}.thenComparing(Student::getName));
		System.out.println("정렬후");
		printList(studentList);
		
		Collections.sort(studentList, (o1, o2) -> Integer.compare(o2.getAge(),o1.getAge()));
		System.out.println("정렬후");
		printList(studentList);
		
	}
	
	public static <T> void printList (List<T> list) {
		for(int i = 0 ; i <list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
}
