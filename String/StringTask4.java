package String;



public class StringTask4 {
    public static void main(String[] args) {
        String s = "hello world";

        StringBuffer sb = new StringBuffer("\n Hi ");
        sb=new StringBuffer(" Hello ");
        sb.append(s);
        sb.reverse();
        System.out.println("reverse:" + sb);
        
          char[] result = s.toCharArray();
          
          for (int i = result.length - 1; i >= 0; i--)
         System.out.print(result[i]);
          StringBuffer sb1 = new StringBuffer("java is super");
           System.out.println(sb.reverse());
         

    }

}
