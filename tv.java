// Classe TV
public class tv {

    final private int numeroTv;
    private int volume;
    private boolean ligada = false;
    private canal canalAtual;
    private lista listaCanais;

    public tv(int numeroTv, lista listaCanais) {
        this.numeroTv = numeroTv;
        this.volume = 99; // Volume inicial
        this.ligada = false; // TV inicialmente desligada
        this.listaCanais = listaCanais;
        
    }

    public boolean isLigada() {
                return ligada;
            }

            public void LigaDesliga(){
                this.ligada = !this.ligada;
                if (isLigada()){
                    System.out.println("A TV está ligada");
                }else{
                    System.out.println("A TV está desligada");
            }
        }
            public void mensagemTVDesligada(){
                System.out.println("A TV está desligada, ligue-a primeiro.");
            }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
        }
    }

    public void escolherCanal(int canal){
        if (!ligada) {
            this.mensagemTVDesligada();
            return;
        }
        if(listaCanais.buscarPorNumero(canal) != null){
            this.canalAtual = listaCanais.buscarPorNumero(canal);
        }else{
            System.out.println("Canal não encontrado.");
        }
    }

    public void exibirInfo() {
        if (ligada) {
            System.out.println("Número da TV: " + numeroTv);
            System.out.println("Volume atual: " + volume);
            if (canalAtual != null) {
                System.out.println("Número da TV: " + numeroTv);
                System.out.println("Volume atual: " + volume);
                if (canalAtual != null) {

                    canalAtual.exibirInfo();
                }else {
                    this.mensagemTVDesligada();
                }

                
            }
        }
    } 
}
    //TODO criar funções para adicionar canais


    public void proximoCanal() {
        if(ligada && !canais.isEmpty()) {
            canal_Atual = (canal_Atual + 1) % canais.size();
        }
    }

    public void canalAnterior() {
        if(ligada && !canais.isEmpty()) {
            canal_Atual = (canal_Atual - 1 + canais.size()) % canais.size();
        }
    }

    public void escolherCanal(int numero) {
        if(ligada) {
            for (int i = 0; i < canais.size(); i++) {
                if(canais.get(i).getNumero() == numero) {
                    canal_Atual = i;
                    return;
                }
            }
            System.out.println("Canal " + numero + " não encontrado.");
        }
    }

    public void listarCanais() {
        if(ligada) {
            System.out.println("Lista de canais disponíveis:");
            for (canal c : canais) {
                System.out.println(c);
            }
        }
    }

    public void verInformacoes() {
        if(ligada) {
            System.out.println("Informações da TV " + numeroTV + ":");
            System.out.println("Volume: " + volume);
            System.out.println("Canal atual: " + canais.get(canal_Atual));
            System.out.println("Número da TV: " + numeroTV);
        } else {
            System.out.println("A TV está desligada.");
        }
    }
