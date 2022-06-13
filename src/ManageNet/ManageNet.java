package ManageNet;

import SubjectComputerAndCustumer.ADMIN;
import SubjectComputerAndCustumer.COMPUTER;
import SubjectComputerAndCustumer.CUSTOMER;
import SubjectComputerAndCustumer.Food;
import Validate.Validate;
import io.ReaderAndWriter;
import io.ReaderAndWriterTKMK;


import java.util.ArrayList;
import java.util.Scanner;

public class ManageNet {

    ReaderAndWriterTKMK readerAndWriterTKMK = new ReaderAndWriterTKMK();
    ReaderAndWriter readerAndWriter = new ReaderAndWriter();
    ArrayList<CUSTOMER> customers = readerAndWriter.reader();
    ArrayList<COMPUTER> computers = new ArrayList<>();
    ArrayList<ADMIN> admins = new ArrayList<>();
    ArrayList<Food> foods = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();
    {
    admins = readerAndWriterTKMK.reader();
    }
public void SortMoney(){
    customers.sort(new CUSTOMER.Up());

}


    public ManageNet() {
        computers.add(new COMPUTER());
        computers.add(new COMPUTER(1,4000,"Vip1"));
        computers.add(new COMPUTER(2,5000,"Vip2"));
        computers.add(new COMPUTER(3,3500,"Vip3"));
        computers.add(new COMPUTER(4,3000,"Vip4"));
        computers.add(new COMPUTER(5,4000,"Vip1"));
        foods.add(new Food());
        foods.add(new Food("Coca"));
        foods.add(new Food("Sting"));
        foods.add(new Food("Mì Tôm"));
        foods.add(new Food("Mì Tôm Trứng"));
        foods.add(new Food("Mì Tôm 2 Trứng"));
        foods.add(new Food("Không ăn"));

    }

    public void menu(){
        System.out.println("----Net Manh Dung----");
        System.out.println("1 Thêm Khoản Người Dùng ");
        System.out.println("2 Sửa Thông Tin Người Dùng");
        System.out.println("3 Xóa Người Dùng");
        System.out.println("4 Nạp Tiền ");
        System.out.println("5 Show Ra Máy Và Đồ Ăn Được Đặt");
        System.out.println("6 Show ra thời gian của người dùng");
        System.out.println("7 Đổi mật khẩu");
        System.out.println("8 Sắp xếp người dùng");
//        Vip 1 thì cấu hình chơi đc LOL
//        Vip 2 thì cấu hình chơi đc PUBG
        int choice = Integer.parseInt(scanner.nextLine());
       switch (choice){
           case 1: add();
           break;
           case 2: repair();
           break;
           case 3:delete();
           break;
           case 4:addMoney();
           break;
           case 5:show();
           break;
           case 6:show1();
           break;
           case 7: repairmk();
           break;
           case 8:SortMoney();
           break;

       }
    }

    public CUSTOMER CreateCustomer(){
        String name = validate.ValidateTK("Name");
        String age = validate.ValidateAge("Age");
        String address = validate.ValidateName("Address_");
        for (int i = 1; i <computers.size() ; i++) {
            System.out.println("   "+":"+computers.get(i).getComputerNumber()+" - "+computers.get(i).getPrice()+" - "+computers.get(i).getType());
        }
        String choice = validate.ValidateC("May");
        for (int i = 1; i <foods.size() ; i++) {
            System.out.println("  "+i+":"+foods.get(i).getTyFood());
        }
        int choicefood = Integer.parseInt(scanner.nextLine());
        double money = validate.ValidateMoney("Nhap tien");
        double time = money/(computers.get(Integer.parseInt(choice)).getPrice());
         return new  CUSTOMER(name,age,address,computers.get(Integer.parseInt(choice)),foods.get(choicefood),time,money);

    }
    public void add(){
        customers.add(CreateCustomer());
        readerAndWriter.write(customers);
    }
    public void addtkmk(){
        admins.add(new ADMIN("manhdung","dung2003"));
        readerAndWriterTKMK.write(admins);
    }
    public void repair(){

        System.out.println("nhap ten can tim");
        for (int i = 0; i <customers.size(); i++) {


            String name = scanner.nextLine();
            if (customers.get(i).getName().equals(name)){
                customers.set(i,CreateCustomer());
                readerAndWriter.write(customers);
        }
            else {
                System.out.println("khong ton tai");
            }
        }
    }
    public void delete(){

        System.out.println("nhap ten can xoa");
        for (int i = 0; i <customers.size() ; i++) {
            String name = scanner.nextLine();
            if (customers.get(i).getName().equals(name)){
                customers.remove(i);
                readerAndWriter.write(customers);
            }
            else {
                System.out.println("khong tim dc");
            }
        }
    }
    public void addMoney(){
        System.out.println("nhap ten nguoi can nap");
        String name = scanner.nextLine();
        for (int i = 0; i <customers.size() ; i++) {
            if (customers.get(i).getName().equals(name)){
                System.out.println("nhap so tien can nap");
                double money = Double.parseDouble(scanner.nextLine());
                customers.get(i).setMoney((money+customers.get(i).getMoney()));
                readerAndWriter.write(customers);

                break;
            }
        }
    }
    public void show(){

        for (int i = 0; i <customers.size() ; i++) {
            System.out.println("Tk"+customers.get(i).getName()+" "+customers.get(i).getComputer()+customers.get(i).getFood());

        }
    }
    public void show1(){
        for (int i = 0; i<customers.size(); i++) {
            System.out.println("Tk "+ customers.get(i).getName()+" "+customers.get(i).getComputer().getPrice()  +"  "+ customers.get(i).getMoney() + " "+ customers.get(i).getTime()+"h");
        }
    }
    public void repairmk(){
        while (true){
        System.out.println("nhap mk hien tai ");
        String mk = scanner.nextLine();
        if (admins.get(0).getPassword().equals(mk)){
        String str   = validate.ValidateMK("mat khau");
            admins.get(0).setPassword(str);
            System.out.println("doi mk thanh cong");
            readerAndWriterTKMK.write(admins);
            break;
        }
        else {
            System.out.println("mk hien tai sai");
        }
        }}
        public void log(){
            System.out.println(admins);
            while (true){
                System.out.println("nhap tai khoan");
                String str = scanner.nextLine();
                System.out.println("nhap mat khau");
                String mk = scanner.nextLine();
            if (admins.get(0).getUser().equals(str)&&admins.get(0).getPassword().equals(mk)){
                System.out.println("hello "+ admins.get(0).getUser()+":)))");
                while (true){
                    menu();
                }

            }
            else {
                System.out.println("sai tk or mk");
            }
        }
    }


    public static void main(String[] args) {

        ManageNet manageNet = new ManageNet();
        manageNet.log();


    }

}


