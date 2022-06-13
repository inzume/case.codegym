package io;

import SubjectComputerAndCustumer.ADMIN;
import SubjectComputerAndCustumer.CUSTOMER;

import java.io.*;
import java.util.ArrayList;

public class ReaderAndWriterTKMK {
    public void write(ArrayList<ADMIN> admins){
        File file = new File("admin.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(admins);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public  ArrayList<ADMIN> reader() {
        File file = new File("admin.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<ADMIN>) objectInputStream.readObject();
        } catch (IOException e) {
            System.err.println("File not found");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }}
