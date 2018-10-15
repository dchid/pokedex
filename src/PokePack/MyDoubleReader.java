/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokePack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author david
 */
//Lab 10
//Pokedex DM
//12/8/2015
//This class reads doubles from a text file and puts them in an array as doubles
//modified from Lab 8 by David
public class MyDoubleReader {

    double[] data;

    /**
     * Reads in a list of doubles into file. Assumes one data item per line.
     *
     * @param fileName the name of the file
     */
    public MyDoubleReader(String fileName) {
        System.out.println("Reading data file.");
        File file = new File(fileName);
        try {
            ArrayList<Double> dataList = new ArrayList<Double>();
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String data = reader.nextLine();
                double temp = Double.parseDouble(data);
                dataList.add(temp);
            }
            reader.close();
            data = new double[dataList.size()];
            System.out.println("Length of array: " + dataList.size());
            for (int i = 0; i < dataList.size(); i++) {
                data[i] = dataList.get(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e + "\nFile not found:\n " + file.getAbsolutePath());
            System.exit(0);
        } catch (NullPointerException e) {
            System.out.println("No data found " + e);
            System.exit(0);
        } catch (NumberFormatException e) {
            System.out.println("String does not contain a number. " + e);
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Problem reading file. " + e);
            System.exit(0);
        }
        System.out.println("Done reading file.");
    }
//toString

    public String toString() {
        return Arrays.toString(data);
    }
}
