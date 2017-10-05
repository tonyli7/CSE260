public class Account{
  private int id;
  private double balance;
  private double annualInterestRate;
  private java.util.Date dateCreated;

  public Account(){
    id = 0;
    balance = 1000;
    annualInterestRate = 4.5;

  }

  public Account(int id, double balance){
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = 4.5;

  }

  public int getId(){
    return id;
  }

  public double getBalance(){
    return balance;
  }

  public double getAIR(){
    return annualInterestRate;
  }

  public void setId(int id){
    this.id = id;
  }

  public void setBalance(double balance){
    this.balance = balance;
  }

  public void setAIR(double annualInterestRate){
    this.annualInterestRate = annualInterestRate;
  }

  public java.util.Date getDateCreated(){
    return dateCreated;
  }

  public double getMonthlyInterestRate(){
    return annualInterestRate / 12;
  }

  public void withDraw(double amount){
    if (amount > balance){
      System.out.println("DENIED. Balance is less than withdrawal amount.");
    }else{
      balance -= amount;
    }
  }

  public void deposit(double amount){
    balance += amount;
  }

  public String toString(){
    return "id: " + id + "\nbalance: " + balance + "\nAIR: " + annualInterestRate;
  }

}
