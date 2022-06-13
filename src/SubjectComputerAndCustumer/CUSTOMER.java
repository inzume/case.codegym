package SubjectComputerAndCustumer;

import java.io.Serializable;
import java.util.Comparator;

public class CUSTOMER implements Serializable {
    String Name;
    String Age;
    String Address;
    COMPUTER computer;
    Food food;
    double Time;
    double Money;

    public CUSTOMER() {
    }

    public CUSTOMER(String name, String age, String address, COMPUTER computer, Food food, double time, double money) {
        Name = name;
        Age = age;
        Address = address;
        this.computer = computer;
        this.food = food;
        Time = money/(computer.Price);
        Money = money;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public COMPUTER getComputer() {
        return computer;
    }

    public void setComputer(COMPUTER computer) {
        this.computer = computer;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public double getTime() {
        return Time;
    }

    public void setTime(double time) {
        Time = time;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
        Time = Money/(computer.Price);
    }

    @Override
    public String toString() {
        return "CUSTOMER{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Address=" + Address +
                ", computer=" + computer +
                ", food=" + food +
               ", time="+Time+
                ", money="+Money+
                '}';
    }
    public static class Up implements Comparator<CUSTOMER> {
        @Override
        public int compare(CUSTOMER o1, CUSTOMER o2) {
            if (o1.getMoney()> o2.getMoney()){
                return 1;
            }
            else return -1;

        }
    }
}

