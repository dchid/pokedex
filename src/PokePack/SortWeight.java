//Lab 10
//Pokedex DM
//12/8/2015
//This Class sorts our weight for our pokemon
//It was written by Mitchell
package PokePack;

/**
 *
 * @author david
 */
public class SortWeight implements Comparable<SortWeight> {

    private double weight;
    private String name;
    private int index;

    public SortWeight(double w, String n, int i) {
        weight = w;
        name = n;
        index = i;

    }

    public SortWeight(SortWeight p) {
        this.weight = p.getWeight();
        this.name = p.getName();
        this.index = p.getIndex();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
        return "#" + index + " " + name + "        " + weight + " kilograms ";//+ height + "meters";
    }

    public int compareTo(SortWeight t) {
        if (this.weight > t.getWeight()) {
            return 1;
        } else if (this.weight < t.getWeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}
