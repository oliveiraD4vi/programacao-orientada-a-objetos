class Trampoline{
  private LinkedList<Kid> waiting;
  private LinkedList<Kid> playing;
  public Trampoline();
  //remove and return the Kid with this name or null
  private Kid remove_kid(String name, LinkedList<Kid> list);
  //insere na lista de espera
  public void arrive(Kid kid);
  //remove da lista de espera e insere na lista playing
  public void in();
  //remove de playing para wainting
  public void out();
  //remove do parquinho
  public Kid remove(String name);
  public String toString();
}
