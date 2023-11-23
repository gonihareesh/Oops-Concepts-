package Collections.List;

import java.util.Stack;

public class StackDemo
{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);
        System.out.println(s);
        s.add(44);
        s.add(55);
        s.add(66);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
    }
}
