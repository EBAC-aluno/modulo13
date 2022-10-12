public class App {
  public static void main(String args[]) {

    PessoaFisica p1 = new PessoaFisica("Alan Turing", "000.000.000-00");
    PessoaJuridica p2 = new PessoaJuridica("StarLink", "00.000.000/0001-00");

    p1.setIsOwnerInJail(false);
    p2.setIsTheBusinessRunning(true);

  }
}
