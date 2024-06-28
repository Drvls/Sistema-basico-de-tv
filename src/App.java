import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isTvOn = false;
        int channel = 0;
        int volume = 50;

        options(isTvOn, channel, volume);
    }

    public static void options(boolean isTvOn, int channel, int volume){
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\tOpções: ");
        System.out.println("\t1- Ligar/Desligar tv");
        System.out.println("\t2- Mudar de canal");
        System.out.println("\t3- Aumentar/diminuir volume");
        System.out.println("\t4- Tv Status");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                onOff(isTvOn);
                break;
            case 2:
                channelChange(isTvOn, channel, volume);
                break;
            case 4:
                tvStatus(isTvOn, channel, volume);
                break;
            default:
                System.out.println("!! Dado inválido.");
                System.out.println("");
                options(isTvOn, channel, volume);
                break;
        }
    }

    public static void onOff(boolean isTvOn){
        isTvOn = (isTvOn == false) ? true : false;
        if(isTvOn == true){
            System.out.println("");
            System.out.println("\tA tv está ligada");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("\tA tv está desligada");
            System.out.println("");
        }

        options(isTvOn, 0, 0);
    }

    public static void channelChange(boolean isTvOn, int channel, int volume){
        Scanner sc = new Scanner (System.in);

        System.out.println("");
        System.out.println("Informe o número do canal. Ex: 23, 42, 53.");
        System.out.println("Ou informe se deseja 'aumentar' ou 'diminuir'");
        System.out.println("");
        String stringChannel = sc.nextLine();

        try{
            channel = Integer.parseInt(stringChannel);
            options(isTvOn, channel, volume);
        } catch(NumberFormatException e){
            channelChangeString(stringChannel, channel, isTvOn, volume);
        }
    }

    public static void channelChangeString(String stringChannel, int channel, boolean isTvOn, int volume){
        if(stringChannel == "aumentar"){
            channel++;
        } else if(stringChannel == "diminuir"){
            channel--;
        } else{
            System.out.println("Dado inválido");
            channelChange(isTvOn, channel, volume);
        }
    }

    public static void tvStatus(boolean isTvOn, int channel, int volume){
        Scanner sc = new Scanner(System.in);
        String ligado = (isTvOn == true) ? "Ligado" : "Desligado";
        int option;

        System.out.println("");
        System.out.println("\t////////////////");
        System.out.println("\tTV STATUS");
        System.out.println("\tEstado: " + ligado);
        System.out.println("\tCanal: " + channel);
        System.out.println("\tVolume: " + volume);
        System.out.println("\t////////////////");
        System.out.println("");
        System.out.println("Opções? 1- Sim, 2- Não");
        option = sc.nextInt();
        if(option == 1){
            options(isTvOn, channel, volume);
        } else{
            System.out.println("Até logo.");
        }
    }
    
}
