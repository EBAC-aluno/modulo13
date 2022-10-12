public class PessoaFisica extends Pessoa {

  private boolean isOwnerInJail;

  public PessoaFisica(String name, String identifier) {
    setName(name);
    setIdentifier(identifier);
  }

  public boolean isOwnerInJail() {
    return isOwnerInJail;
  }

  public void setIsOwnerInJail(boolean isOwnerInJail) {
    this.isOwnerInJail = isOwnerInJail;
  }

}
