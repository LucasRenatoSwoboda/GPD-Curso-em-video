public class Arredondamentos{
    public static void main (String[]args){
        float n = 5.96f;
        System.out.println("Usando floor em n = 5,96 fica: " + Math.floor(n));
        n = 5.15f;
        System.out.println("Usando ceil em n = 5,15 fica: " + Math.ceil(n));
        n = 5.55f;
        System.out.println("Usando round em n = 5.55 fica: " + Math.round(n));
    }
}