package banco922;


public class Conta {
    
    private int numero;
    private double saldo;
    private String titular;
    private int senha;

    Conta(int numero, int i, String nome, int senha) {
    }

    Conta() {
    }


    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }//final dos get e settter's
    
    
    //depositar
    public void depositar(double deposito){
        this.setSaldo(this.getSaldo()+deposito   );
        System.out.println("\nSaldo Atual:"+this.getSaldo());
    }
    /**
     * 
     * @param saque Valor a ser retirado da conta
     */
    public void sacar(double saque){
        //verifica se há saldo
        if (this.getSaldo()>=saque){
            //realiza o saque    
            this.setSaldo(this.getSaldo()-saque);
            System.out.println(
                "Saldo Atual:"+this.getSaldo());
            }//final do if
        else{
            System.out.println("Saldo insuficiente.");
            System.out.println("Seu saldo é de: R$"+this.getSaldo());
        }//final do else
    }//final de sacar
    
    //senhaCerta
    public boolean senhaCerta(int senhaDigitada){
        return this.getSenha()== senhaDigitada; 
    }
    
    //mudarSenha
    public void mudarSenha(int senhaNova){
            this.setSenha(senhaNova);
    
    }//fim de mudarSenha
    
    public void mudarNomeDoTitular( String novoTitular){
        this.setTitular(novoTitular);
    }
    
    public void mudarNumeroDaConta(int novoNumero){
        this.setNumero(novoNumero);
    }
    
    public void mostrarDados(){
        this.getNumero();
        this.getSaldo();
        this.getSenha();
        this.getTitular();
    }
    
        
    
    
}//final da classe
