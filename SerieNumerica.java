import java.lang.String;

public class SerieNumerica {

    public static void main(String[] args){
        int i = 0;

        System.out.println("serie con for: ");
        for(i = 1; i <= 10; i++){
          if(i<10){
              System.out.print(i+",");
          }else{
              System.out.print(i);
          }

            //  System.out.print(i+",");
        }
        i = 1;
        System.out.println("");

        System.out.println("serie con while");

        while(i <=10){
            if (i<10){
              System.out.print(i+",");
            }else{
                System.out.print(i);
            }
            i++;
        }
        i=1;
        System.out.println("");

        System.out.println("serie con Do-While: ");
        do{
            if(i<10){
              System.out.print(i+",");
            }else{
                System.out.print(i);
            }
            i++;
        }while(i <=10);
    }
}
