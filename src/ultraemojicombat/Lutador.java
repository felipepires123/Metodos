package ultraemojicombat;

public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;

    private float peso;
    private String categoria;
    private int vitorias, derrotar, empates;
    //metodos Públicos
    public void apresentar(){
        System.out.println("----------------------------------------------------");
        System.out.println("chegou a hora! Apresentamos o lutaor " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + "anos de idade e com " + this.altura + "metros");
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotar() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }
    public void status(){
        System.out.println(this.getNome() + "é um peso " + this.getCategoria());
        System.out.println("Ganhou" + this.getVitorias() + " vezes");
        System.out.println("Perdeu" + this.getDerrotar() + " vezes");
        System.out.println("Empatou" + this.getEmpates() + " vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotar(this.getDerrotar()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    //metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, float peso, int vitorias, int derrotar, int empates, float altura) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotar = derrotar;
        this.empates = empates;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso<52.2){
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "médio";
        } else if (this.peso <= 120.2) {
            this.categoria ="pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotar() {
        return derrotar;
    }

    public void setDerrotar(int derrotar) {
        this.derrotar = derrotar;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
