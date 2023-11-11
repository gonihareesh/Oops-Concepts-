package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        // find length of the String
        System.out.println(sb.length());
        // adding String to the existing String
        System.out.println(sb.append(" " + 1.7).append(" " + "programming language"));
        // delete some String while specifing the index position
        System.out.println(sb.deleteCharAt(5).delete(5, 8));
        // retrive the data from specifing index position
        System.out.println(sb.substring(0).substring(0, 4));
        // insert the specified content
        System.out.println(sb.insert(4, "1.8"));
        // replacing the String
        System.out.println(sb.replace(8, 19, "programe"));
        //reverse the String
        System.out.println(sb.reverse());

    }

}
