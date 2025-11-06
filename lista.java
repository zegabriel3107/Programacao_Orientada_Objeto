package aula sobre tv;

public class lista {
    private ArrayList<canal> canais = new ArrayList<>();

    public void adicionarCanal(canais canal) {
        canal.add(canal);
    }

    public void removerCanal(canal canal) {
        canal.remove(canal);
    }
    public canais buscarPorNumero(int numero) {
        for (canais canal : canais) {
            if (canal.getNumero() == numero) {
                return canal;
            }
        }
        return null; // se não achar
    }

    public void listarCanais() {
        for (canais canal : canais) {
            canal.exibirInformacoes();
        }
    }

    public ArrayList<canais> getCanais() {
        return canais;
    }
}