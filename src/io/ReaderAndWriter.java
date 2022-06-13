package io;

import SubjectComputerAndCustumer.CUSTOMER;

import java.io.*;
import java.util.ArrayList;

public class ReaderAndWriter {


    public void write(ArrayList<CUSTOMER> customers){
File file = new File("customer.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
 objectOutputStream.writeObject(customers);
objectOutputStream.close();
fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public  ArrayList<CUSTOMER> reader() {
        File file = new File("customer.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<CUSTOMER>) objectInputStream.readObject();
        } catch (IOException e) {
            System.err.println("File not found");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }}
