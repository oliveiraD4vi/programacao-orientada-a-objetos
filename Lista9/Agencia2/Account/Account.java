/**
 * A classe Account...
 * @author Davi Silva Alves de Oliveira
 */

package Account;

abstract public class Account {
  protected int id;
  protected float balance;
  protected String clientId;
  protected String type; //CC or CP

  /**
   * 
   * @param id
   * @param clientId
   */
  public Account(int id, String clientId) {

  }
  
  /**
   * 
   */
  public abstract void monthlyUpdate();
  
  /**
   * 
   * @param value
   */
  public void withdraw(float value) {

  }
  
  /**
   * 
   * @param value
   */
  public void deposit(float value) {

  }
  
  /**
   * 
   * @param other
   * @param value
   */
  public void transfer(Account other, float value) {

  }
  
  /**
   * 
   */
  public String toString() {
    return "aa";
  }
  
  /**
   * 
   * @return
   */
  int getId() {
    return this.id;
  }
  
  /**
   * 
   * @return
   */
  float getBalance() {
    return this.balance;
  }
  
  /**
   * 
   * @return
   */
  String getClientId() {
    return this.clientId;
  }
  
  /**
   * 
   * @return
   */
  String getType() {
    return this.type;
  }
}
