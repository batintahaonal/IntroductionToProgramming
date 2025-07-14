package ders1;
import java.util.Arrays;
import java.util.Comparator;
	public class Trial {
	    public static void main(String[] args) {
	        Integer[] idArray = {100315086, 100315002, 100315079};
	        String[] nameArray = {"ali", "ayşe", "zeki"};

	        class Student {
	            int id;
	            String name;

	            Student(int id, String name) {
	                this.id = id;
	                this.name = name;
	            }
	        }

	        Student[] students = new Student[idArray.length];
	        for (int i = 0; i < idArray.length; i++) {
	            students[i] = new Student(idArray[i], nameArray[i]);
	        }

	        Arrays.sort(students, Comparator.comparingInt(s -> s.id));

	        for (int i = 0; i < students.length; i++) {
	            idArray[i] = students[i].id;
	            nameArray[i] = students[i].name;
	        }

	        System.out.println("Sorted IDs: " + Arrays.toString(idArray));
	        System.out.println("Sorted Names: " + Arrays.toString(nameArray));
	    }
	}