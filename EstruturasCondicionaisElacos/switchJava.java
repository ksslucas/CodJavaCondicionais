package MainPrimitivos.EstruturasCondicionais.EstruturasCondicionaisElacos;

public class switchJava {
    public static void main(String[] args) {
        int number = 30;

        switch (number){
            default:
                System.out.println("Valor padrão a ser checado");
                break;
            case 20:
                System.out.println("Seu número é 20?");
                break;
            case 30:
                System.out.println("Seu número é 30?");
                break;
            case 40:
                System.out.println("Seu número é 40?");
                break;
        }
    }
}
