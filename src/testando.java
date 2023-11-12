public class testando {
    private String nome;
    private int idade;
    private double saldo;

    public testando ( String nome, int idade, double salario){
        setIdade(idade);
        setNome(nome);
        setSaldo(salario);
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return ""+getNome() +"\n"+getIdade()+"\n"+getSaldo();
    }
}
