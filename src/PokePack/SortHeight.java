/*
 //Lab 10
 //Pokedex DM
 //12/8/2015
 This Class sorts our hights for our pokemon
 It was written by Mitchell
 */
package PokePack;

/**
 *
 * @author david
 */
public class SortHeight implements Comparable<SortHeight> {

    private double height;
    private String name;
    private int index;

    public SortHeight(double h, String n, int i) {
        height = h;
        name = n;
        index = i;

    }

    public SortHeight(SortHeight p) {
        this.height = p.getHeight();
        this.name = p.getName();
        this.index = p.getIndex();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public String toString() {
        return "#" + index + " " + name + "           " + height + " meters ";//+ height + "meters";
    }

    public int compareTo(SortHeight t) {
        if (this.height > t.getHeight()) {
            return 1;
        } else if (this.height < t.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}
