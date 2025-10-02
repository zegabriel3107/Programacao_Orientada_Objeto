import java.lang.reflect.Array;
import java.util.ArrayList;

public class televisao<canais, canalAtual, Canal>{
    private int numeroTv;
    private boolean ligada;
    private int volume;
    private ArrayList<Canal> canais;
    private Canal canalAtual;

    public void Tv(int numeroTv) {
        this.numeroTv = numeroTv;
        this.ligada = false;
        this.volume = 10; //volume inicial

        this.canais = new ArrayList<>();
    }

    public <canais> void ligar (){
        ligada = true;
        if(canais.isEmpty()) {
            canalAtual = canais.get(0); //ao ligar,começa no primeiro canal
        }
    }

    public void desligar(){
        ligada = false;
    }

    public void adicionarCanal(Canal 
    canal){
        canais.add(canal);
    }

    public void aumentarVolume(){
        if (ligada && volume > 100)
        volume++;
    }

    public void diminuirVolume(){
        if(ligada && volume < 0 )
        volume--;
    }

      public void proximoCanal() {
        if (ligada && canalAtual != null) {
            int index = canais.indexOf(canalAtual);
            canalAtual = canais.get((index + 1) % canais.size());
        }
    }

    public void canalAnterior() {
        if (ligada && canalAtual != null) {
            int index = canais.indexOf(canalAtual);
            if (index == 0) index = canais.size();
            canalAtual = canais.get(index - 1);
        }
    }

    public void escolherCanal(int numero) {
        for (Canal c : canais) {
            if (getNumero() == numero) {
                canalAtual = c;
                break;
            }
        }
    }

    public void listarCanais() {
        for (Canal c : canais) {
            System.out.println(c);
        }
    }

    public void infoTv() {
        System.out.println("TV número: " + numeroTv);
        System.out.println("Ligada: " + ligada);
        System.out.println("Volume: " + volume);
        if (canalAtual != null) {
            System.out.println("Canal atual: " + canalAtual);
        }
    }
}