class Kid {
  private int age;
  private String name;

  /**
   * 
   * @param name
   * @param age
   */
  public Kid(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  /**
   * 
   * @return
   */
  int getAge() {
    return age;
  }
  
  /**
   * 
   * @return
   */
  String getName() {
    return name;
  }
  
  /**
   * 
   * @param age
   */
  void setAge(int age) {
    this.age = age;
  }
  
  /**
   * 
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * 
   */
  public String toString() {
    return (name + ":" + age);
  }
}
