package SubjectComputerAndCustumer;

import java.io.Serializable;

public class COMPUTER implements Serializable {
  int ComputerNumber;
  double Price;
  String Type;


  public COMPUTER() {
  }

  public COMPUTER(int computerNumber, double price, String type) {
    ComputerNumber = computerNumber;
    Price = price;
    Type = type;

  }

  public int getComputerNumber() {
    return ComputerNumber;
  }

  public void setComputerNumber(int computerNumber) {
    ComputerNumber = computerNumber;
  }

  public double getPrice() {
    return Price;
  }

  public void setPrice(double price) {
    Price = price;
  }

  public String getType() {
    return Type;
  }

  public void setType(String type) {
    Type = type;
  }

  @Override
  public String toString() {
    return
            "Number=" + ComputerNumber +
            ", Price=" + Price +
            ", Type='" + Type + '\'';
  }
}