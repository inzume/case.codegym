package Validate;

import SubjectComputerAndCustumer.CUSTOMER;
import io.ReaderAndWriter;
import org.omg.IOP.CodecPackage.FormatMismatch;

import javax.naming.Name;
import java.text.Format;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Scanner;

public class Validate{
    ReaderAndWriter readerAndWriter = new ReaderAndWriter();
    ArrayList<CUSTOMER> customer = readerAndWriter.reader();
    Scanner scanner=new Scanner(System.in);
    {customer = readerAndWriter.reader();}
    public int getValidate(String name , ArrayList<CUSTOMER> customers){
        for (int i = 0; i <customers.size() ; i++) {
            if (customers.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public int ValidateComputer(String name , ArrayList<CUSTOMER> customers ) {
        for (int i = 0; i < customers.size(); i++) {
            if (name.equals(customers.get(i).getComputer().getComputerNumber())) ;
            {
                return i;
            }

        }
        return -1;
    }
//    public String Validatecomputer(String string) {
//        System.out.println("Nhap"+string);
//        String REGEX ="^[1-5]+";
//        while (true) {
//            String computer = scanner.nextLine();
//            try {
//                for (int i = 0; i <customer.size() ; i++) {
//                    if (ValidateComputer(computer,customer) != -1){
//                        throw new Exception();
//                    }
//                }
//                if (computer.matches(REGEX)){
//                    return computer;
//                }
//                else {
//                    throw new FormatMismatch();
//                }}
//                catch (FormatMismatch e){
//                    System.out.println("khong hop le");
//                }
//            catch (Exception e) {
//                System.out.println("da ton tai");
//            }
//
//        }
//    }
public String ValidateC(String string){
    String REGEX ="^[1-5]+";
    System.out.println("Input"+string+":");

    while (true){
        String name = scanner.nextLine();
        if (name.matches(REGEX)){
            return name;
        }
        else {
            System.out.println("nhap lai");
        }
    }
}
    public String ValidateTK(String string){
        readerAndWriter.reader();
        String REGEX ="^[A-Za-z0-9]{1,12}+";
        System.out.println("Input 1-12 character"+string+":");
        while (true){
            try {
                String name = scanner.nextLine();
                if (getValidate(name, customer) != -1) {
                throw new Exception();
                }
                    if (name.matches(REGEX)) {
                        return name;
                    } else {
                        throw new  FormatMismatch();
                    }

            }
            catch (FormatMismatch formatMismatch){
                System.out.println("nhap sai");
            }
            catch (Exception e){
                System.out.println("ten da ton tai");
            }
        }
    }
    public String ValidateMK(String string){
        String REGEX ="^[A-Z][a-z0-9]+";
        System.out.println("nhap mat khau moi");
        System.out.println("viet hoa chu dau"+string+":");
        while (true){
            try {
                String name = scanner.nextLine();
                if (getValidate(name, customer) != -1) {
                    throw new Exception();
                }
                if (name.matches(REGEX)) {
                    return name;
                } else {
                    throw new  FormatMismatch();
                }

            } catch (FormatMismatch e) {
                System.out.println("nhap sai");
            } catch (Exception e) {
                System.out.println("ten da ton tai");
            }
        }
    }
    public String ValidateName(String string){
        String REGEX ="^[A-Za-z_]+";
        System.out.println("Input"+string+":");

      while (true){
          String name = scanner.nextLine();
      if (name.matches(REGEX)){
          return name;
      }
      else {
          System.out.println("nhap lai");
      }
      }
    }
    public String ValidateAge(String string){
        String REGEX = "^[0-9]{1,2}+";
        System.out.println("Input"+string+":");

        while (true){
            String number = scanner.nextLine();
            if (number.matches(REGEX)){
                return number;
            }
            else {
                System.out.println("nhap lai tuoi");

            }
        }

    }
    public double ValidateMoney(String s){
        String REGEX = "^[0-9]{4,9}";
        System.out.println("Input"+s+":");

        while (true){
            String money = scanner.nextLine();
            if (money.matches(REGEX)){
                return Double.parseDouble(money);
            }
            else {
                System.out.println("nhap lai so tien ");
            }
        }
    }

}
