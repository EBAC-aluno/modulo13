public class PessoaJuridica extends Pessoa {

  private boolean isTheBusinessRunning;

  public PessoaJuridica(String name, String identifier) {
    setName(name);
    setIdentifier(identifier);
  }

  public boolean isTheBusinessRunning() {
    return isTheBusinessRunning;
  }

  public void setIsTheBusinessRunning(boolean isTheBusinessRunning) {
    this.isTheBusinessRunning = isTheBusinessRunning;
  }

}
