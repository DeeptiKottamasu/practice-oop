public class Account {
  private String id;
  private String name;
  private int balance;

  public Account(String id, String name){
    this.id = id;
    this.name = name;
  }

  public Account(String id, String name, int balance){
    this.id = id;
    this.name = name;
    this.balance = balance;

  }
  public void setID(String id){
    this.id = id;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getID(){
    return this.id;
  }

  public int getBalance() {
    return this.balance;
  }

  public String getName() {
    return this.name;
  }

  public int credit(int credit_amt){
    this.balance = this.balance + credit_amt;
    return this.balance;

  }

  public int debit(int debit_amt) throws Exception{
    if ( this.balance > debit_amt){
      this.balance = this.balance - debit_amt;
      return this.balance;
    }
    else{
      System.out.println("Amount exceeded balance");
//      throw new Exception("Balance insufficient");
      return this.balance;
    }
  }

  public int transferTo(Account another, int amount) throws Exception{
    if ( this.balance > amount){
      this.debit(amount);
      another.credit(amount);
      return this.balance;
    }
    else{
      System.out.println("Amount exceeded balance");
//      throw new Exception("Balance insufficient");
      return this.balance;
    }

  }

  public String toString(){
    return "Account: name" + this.name + " balance: " + this.balance;
  }

}
