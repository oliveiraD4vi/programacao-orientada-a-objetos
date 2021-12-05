package Cliente;

public class Client {
  private String id;
  private String fone;
  
  /**
   * 
   * @param id
   * @param fone
   */
  public Client(String id, String fone) {
    this.id = id;
    this.fone = fone;
  }
  
  /**
   * 
   */
  public String toString() {
    return ("cliente");
  }
  
  /**
   * 
   * @return
   */
  String getId() {
    return this.id;
  }
  
  /**
   * 
   * @param id
   */
  void setId(String id) {
    this.id = id;
  }
  
  /**
   * 
   * @return
   */
  String getFone() {
    return this.fone;
  }
  
  /**
   * 
   * @param fone
   */
  void setFone(String fone) {
    this.fone = fone;
  }
}
