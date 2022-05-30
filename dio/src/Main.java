public class Main {
  
  public static void main(String[] args) {
    Cliente Bianka = new Cliente();
    Bianka.setNome("Bianka");

    Conta cp = new ContaPoupanca(Bianka);
    Conta cc = new ContaCorrente(Bianka);
    
    cc.depositar(100);
    cc.transferir(50, cp);
    
    cp.imprimirExtrato();
    cc.imprimirExtrato(); 
  }
}
