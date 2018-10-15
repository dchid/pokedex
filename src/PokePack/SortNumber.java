/*
 * //Lab 10
 //Pokedex DM
 //12/8/2015
 This Class sorts our index numbers for our pokemon
 It was written by Mitchell
 */
package PokePack;

/**
 *
 * @author mitchell
 */
public class SortNumber implements Comparable<SortNumber> {

    private String name;
    private int index;
    private double height;
    private double weight;

    public SortNumber(int i, String n, double w, double h) {
        index = i;
        name = n;
        weight = w;
        height = h;
    }

    public SortNumber(SortNumber p) {
        this.name = p.getName();
        this.index = p.getIndex();
        this.height = p.getHeight();
        this.weight = p.getWeight();
    }

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "#" + index + " " + name;//+ "          " + weight + "kilograms " + height + "meters";

    }

    public int compareTo(SortNumber t) {
        if (this.index > t.getIndex()) {
            return 1;
        } else if (this.index < t.getIndex()) {
            return -1;
        } else {
            return 0;
        }
    }
}
