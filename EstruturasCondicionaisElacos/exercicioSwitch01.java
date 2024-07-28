package MainPrimitivos.EstruturasCondicionais.EstruturasCondicionaisElacos;

public class exercicioSwitch01 {
    public static void main(String[] args) {
        byte diaUtilDaSemana = 12;

        switch (diaUtilDaSemana){
            default:
                System.out.println("Informe um dia válido.");
                break;
            case 1:
                System.out.println("Hoje é domingo. Não é um dia útil da semana.");
                break;
            case 2:
                System.out.println("Hoje é segunda. Hoje é um dia útil da semana.");
                break;
            case 3:
                System.out.println("Hoje é terça. Hoje é um dia útil da semana.");
                break;
            case 4:
                System.out.println("Hoje é quarta feira. Hoje é um dia útil da semana.");
                break;
            case 5:
                System.out.println("Hoje é quinta feira. Hoje é um dia útil da semana.");
                break;
            case 6:
                System.out.println("Hoje é sexta feira. Hoje é um dia útil da semana.");
                break;
            case 7:
                System.out.println("Hoje é sábado. ão é um dia útil da semana.");
                break;
        }
    }
}
