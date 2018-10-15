/*
 * Lab 10
 Pokedex DM
 december 8th 2015
 sort methods written by Mitchell
 constructor and everything else written by David
 This Class puts pokemon objects into an array and sorts pokemon objects by fields
 We instantiate this class in our GUI
 */
package PokePack;

import java.util.Arrays;

/**
 *
 * @author david
 */
public class PokeArray {

    private Pokemon pokeArray[];
    private SortNumber NumberArray[];
    private SortWeight WeightArray[];//sortbyweight
    private SortHeight HeightArray[];//sortbyheight

    public PokeArray() {
        //Sets the pokemon's name
        MyFileReader reader0 = new MyFileReader("src/PokePack/PokeList.txt");
        String[] pokemonNames = reader0.data;
        pokeArray = new Pokemon[pokemonNames.length];//

        MyFileReader reader = new MyFileReader("src/PokePack/PokeList.txt");
        String[] number = reader.data;
        NumberArray = new SortNumber[number.length];
        int NdexNum = 1;
        for (int x = 0; x < pokeArray.length; x++) {
            SortNumber temp = new SortNumber(NdexNum, number[x], 1, 2);
            NdexNum++;
            NumberArray[x] = temp;
        }
//        This sets each pokemon's weight
        MyDoubleReader reader1 = new MyDoubleReader("src/PokePack/PokeWeights.txt");
        double[] pokemonWeight = reader1.data;//
        WeightArray = new SortWeight[pokemonWeight.length];
        int windexnum = 1;
        for (int y = 0; y < pokeArray.length; y++) {
            SortWeight wtemp = new SortWeight(pokemonWeight[y], pokemonNames[y], windexnum);
            windexnum++;
            WeightArray[y] = wtemp;
        }
        //Sets the Hight for all Pokemon elements in the array
        MyDoubleReader reader2 = new MyDoubleReader("src/PokePack/PokeHights.txt");
        double[] pokemonHeight = reader2.data;//
        HeightArray = new SortHeight[pokemonHeight.length];
        int hindexnum = 1;
        for (int z = 0; z < HeightArray.length; z++) {
            SortHeight htemp = new SortHeight(pokemonHeight[z], pokemonNames[z], hindexnum);
            hindexnum++;
            HeightArray[z] = htemp;
        }
        //Sets the pokemon's dex number 
        int dexNum = 1;
        //Sets the Pokemon's Types
        MyFileReader reader3 = new MyFileReader("src/PokePack/Type1.txt");
        String[] pokemonType1 = reader3.data;
        MyFileReader reader4 = new MyFileReader("src/PokePack/Type2.txt");
        String[] pokemonType2 = reader4.data;
        for (int a = 0; a < pokeArray.length; a++) {
            Pokemon temp = new Pokemon(dexNum, pokemonNames[a], pokemonWeight[a], pokemonHeight[a], pokemonType1[a], pokemonType2[a]);
            dexNum++;
            pokeArray[a] = temp;
        }

    }

    public void setPokeArray(Pokemon[] pokeArray) {
        this.pokeArray = pokeArray;
    }

    public Pokemon[] getPokeArray() {
        return pokeArray;
    }
//The following methods allow us to set an index for our pokeArray so we can select an index in our GUI

    public String pokemonName(int i) {
        return pokeArray[i].getName();
    }

    public int pokemonIndex(int i) {
        return pokeArray[i].getIndex();
    }

    public double pokemonWeight(int i) {
        return pokeArray[i].getWeight();
    }

    public double pokemonHight(int i) {
        return pokeArray[i].getHight();
    }

    public String PokemonType(int i) {
        if (pokeArray[i].getType2().equals("None")) {
            pokeArray[i].setType2(" ");
        }
        return pokeArray[i].getType1() + " " + pokeArray[i].getType2();

    }

    @Override
    public String toString() {
        String names = "";
        for (int x = 0; x < pokeArray.length; x++) {
            names += pokeArray[x].getIndex() + " " + pokeArray[x].getName() + " Weight " + pokeArray[x].getHight() + " Hight " + pokeArray[x].getWeight() + "\n";
        }
        return names;
    }

    public int add(int i) {
        return i++;
    }
//These methods sort our pokemon by their respective fields

    public SortNumber[] sort() {

        SortNumber[] half = new SortNumber[NumberArray.length];
        for (int i = 0; i < half.length; i++) {
            half[i] = NumberArray[i];
        }
        Arrays.sort(half);
        return half;
    }

    public SortWeight[] sortW() {

        SortWeight[] half = new SortWeight[WeightArray.length];
        for (int i = 0; i < half.length; i++) {
            half[i] = WeightArray[i];
        }
        Arrays.sort(half);
        return half;
    }

    public SortHeight[] sortH() {

        SortHeight[] half = new SortHeight[HeightArray.length];
        for (int i = 0; i < half.length; i++) {
            half[i] = HeightArray[i];
        }
        Arrays.sort(half);
        return half;
    }
}
