public class SmartTv {
    boolean isTvOn = false;
    int channel = 0;
    int volume = 0;

    // Ligar / Desligar
    void ligar(boolean isTvOn){
        if(isTvOn = true){
            System.out.println("A Smart Tv já está ligada.");
        }else{
            isTvOn = true;
        }
    }

    void desligar(boolean isTvOn){
        if(isTvOn = false){
            System.out.println("A Smart Tv já está desligada.");
        }else{
            isTvOn = false;
        }
    }

    // Alterar canal
    void aumentarCanal(int channel){
        channel++;
    }

    void diminuirCanal(int channel){
        channel--;
    }

    void mudarCanal(int novoCanal){
        channel = novoCanal;
    }

    // Alterar volume
    void aumentarVolume(int volume){
        volume++;
    }

    void diminuirVolume(int volume){
        volume--;
    }
}
