package OOps;

public class Main
{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            PojoClassDemo pd=new PojoClassDemo(12456,
                    switch (i){
                        case 1->"hari";
                        case 2->"damodhar";
                        case 3->"govardhan";
                        case 4->"Sree ram";
                        case 5->"laxman";
                        default -> "anonymous";
                    },"15/12/1998","JavaMasterLevel");
            System.out.println(pd);
        }

    }
}
