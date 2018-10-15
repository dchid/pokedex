/*
 //Lab 10
 //Pokedex DM
 //12/8/2015
 * This Class contains fields and information about our pokemon
 This class is istantiated in PokeArray
 David wrote the constructor
 Mitchell wrote everything else
 */
package PokePack;

import javax.swing.ImageIcon;

/**
 *
 * @author david
 */
public class Pokemon {

    private String name;
    private int index;
    private double hight;
    private double weight;
    private String type1;
    private String type2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double height) {
        this.hight = hight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public Pokemon(int i, String n, double w, double h, String t1, String t2) {
        index = i;
        name = n;
        weight = w;
        hight = h;
        type1 = t1;
        type2 = t2;
    }

    @Override
    public String toString() {
        String info = "Index: " + index + "Name: " + name + "Weight: " + weight + "Hight: " + hight;
        return info;
    }
}
