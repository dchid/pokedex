/*
 * //Lab 10
 //Pokedex DM
 //12/8/2015
 This Class creastes a sprite label with a vector image icon in the corner of our gui
 This is a subclass of our GUI
 It was written by Mitchell
 */
package PokePack;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author david
 */
public class Sprites extends PokeGui {

    private ImageIcon image;
    private JLabel Sprite;

    public Sprites() {
        setLayout(null);

        image = new ImageIcon(("src\\PokePack\\" + 1 + ".png"));
        Sprite = new JLabel(image);
        add(Sprite);
        Sprite.setLocation(200, 50);
        Sprite.setSize(100, 100);
    }
}
