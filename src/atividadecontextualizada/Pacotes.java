package atividadecontextualizada;

public class Pacotes {
    protected String pacote = "padrao";
    
    protected final String pacoteA = "Equipamentos premium, nutricionista, treinador e orientação 24h!";
    protected final String pacoteB = "Equipamento de ótima, água mineral e treinador disponível das 06h00 da manhã às 18h00 da noite";
    protected final String pacoteC = "Equipamento padrão, água mineral, treinador das 06h00 da manhã às 13h da tarde";
    public String getPacoteA() {
        return this.pacoteA;
    }
    public String getPacote() {
        return pacote;
    }
     public void setPacote(String opcao) {
        switch (opcao.toLowerCase()){
            case "a":
                this.pacote = pacoteA;
                System.out.println("PACOTE A selecionado");
                break;
            case "b":
                this.pacote = pacoteB;
                System.out.println("PACOTE B selecionado");
                break;
            case "c":
                this.pacote = pacoteC;
                System.out.println("PACOTE C selecionado");
                break;
            default:
                System.out.println("PACOTE INVÁLIDO");
                break;
        }
    }
}

