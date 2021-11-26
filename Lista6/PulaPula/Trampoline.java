import java.util.LinkedList;

class Trampoline{
  private LinkedList<Kid> waiting = new LinkedList<Kid>();
  private LinkedList<Kid> playing = new LinkedList<Kid>();

  /**
   * 
   */
  public Trampoline() {}

  /**
   * 
   * @param name
   * @param list
   * @return
   */
  private Kid remove_kid(String name, LinkedList<Kid> list) {
    Kid kid = new Kid(name, 10);

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getName() == name) {
        kid = list.get(i);
        list.remove(kid);
        break;
      }
    }

    return kid;
  }
  
  /**
   * 
   * @param kid
   */
  public void arrive(Kid kid) {
    waiting.addFirst(kid);
  }
  
  /**
   * 
   */
  public void in() {
    playing.addFirst(waiting.getLast());
    waiting.removeLast();
  }
  
  /**
   * 
   */
  public void out() {
    waiting.addFirst(playing.getLast());
    playing.removeLast();
  }
  
  /**
   * 
   * @param name
   * @return
   */
  public Kid remove(String name) {
    Kid kid = new Kid("undefined", 0);

    kid = remove_kid(name, waiting);
    if (kid.getName() == "undefined") remove_kid(name, playing);

    return kid;
  }
  
  public String toString() {
    return ("=> " + waiting + " => " + playing);
  }
}
