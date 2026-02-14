public class condicionales{
    public static void main (String args[]){
        int matematicas = 5;
        int biologia = 5;
        int quimica = 4;
        int promedio = 0;
        promedio = (matematicas+biologia+quimica)/3;
        if (promedio>=6){
            System.out.println("El alumno aprobó: " + promedio);
        }else{
            System.out.println("El alumno desaprobo: "+ promedio); 
        }
        System.out.println(" ");
        
    }
}