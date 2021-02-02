package atividadecontextualizada;

public class Aluno {

    private String nome;
    private int idade;
    private float altura;
    private float peso;
    private String status;
    private String cpf;
   
    private String pacoteDoAluno;
    Pacotes pacote = new Pacotes();
    public String getPacoteDoAluno() {
        return pacoteDoAluno;
    }

    public void setPacoteDoAluno(String pacoteEscolhido) {
        pacote.setPacote(pacoteEscolhido);
        pacoteDoAluno = pacote.getPacote();
    }


 

    public Aluno(String nome, int idade, float altura, float peso, String status, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        setStatus(status);
        this.cpf = cpf;

    }

    public Aluno() {

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setStatus(String status) {
        
        if (status.equals("ativo")) {
            this.status = "ativo";
        } else if (status.equals("inativo")) {
            this.status = "inativo";
        } else {
            System.out.println("Valor inválido, escolha inativo ou ativo");  
        }
    }

    public String getStatus() {
        return this.status;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected float getAltura() {
        return altura;
    }

    protected void setAltura(float altura) {
        this.altura = altura;
    }

    protected float getPeso() {
        return peso;
    }

    protected void setPeso(float peso) {
        this.peso = peso;
    }
    // método responsável pra mostrar informações a fim de debugar a aplicação
    public String mostrarInformacoes() {
        return "Aluno(a){"
                + " nome = " + this.getNome()
                + ", status = " + getStatus()
                + ", cpf = " + this.getCpf()
                + ", idade = " + this.getIdade()
                + ", altura = " + this.getAltura()
                + ", peso = " + this.getPeso()
                + '}';
    }

}
