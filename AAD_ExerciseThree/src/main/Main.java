package main;

import data.Student;
import stack.Stack;
import stack.Stackable;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Marvin", "Piekarek", 28152141, 1, 2);
        Student s2 = new Student("LolsAF", "Coper", 2141, 1, 2);
        Student s3 = new Student("Elliot", "Mr. Robot", 2412421, 2, 3);

        Stackable<Student> stacky = new Stack<Student>();
        stacky.push(s1);
        stacky.push(s2);
        stacky.push(s3);
        stacky.print();
        System.out.println("Size: " + stacky.getSize());
        System.out.println("Pop: " + stacky.pop());
        System.out.println("Peek: " + stacky.peek());
        System.out.println("Pop: " + stacky.pop());
        System.out.println("Pop: " + stacky.pop());


    }

}
