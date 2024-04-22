package qr;

public class code2 {
    public static void main(String[] args) {
        String [] prod = {"bread","milk"} ;
        boolean ProdHave = true;

        for (int i =0 ; i < prod.length ; i++){
            if(ProdHave){
                System.out.println("code-"+ i +'|'+"true - 1");
            }else{
                System.out.println("code-"+i+'|'+"false - 0");
            }
        }


    }
}
