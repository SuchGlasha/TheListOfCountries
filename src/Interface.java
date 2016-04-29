/**
 * Created by Dulya on 28.04.2016.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Interface extends JFrame {

    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 600;

    public Interface(String title) // Конструктор, параметр - название окна
    {
        super(title);
        createGUI(); // Графический интерфейс
        pack();
    }

    Font font = new Font("Verdana", Font.PLAIN, 30); // шрифт
    String[] country = {
            "","A", "B", "C", "D","E","F","G","H","I",
            "J","K","L","M","N","O","P","Q","R","S",
            "T","U","V","W","X","Y","Z"
    };

    public Dimension getPreferredSize()
    {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    JComboBox countryBox = new JComboBox(country);
    JTextArea  countryTextArea = new JTextArea(5,10);

    private void createGUI()
    {

        final JPanel contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(2,1));

        ActionListener countryBoxListener = new CountryBoxListener();
        countryBox.addActionListener(countryBoxListener);
        contentPane.add(countryBox);
        contentPane.add(countryTextArea);

        setContentPane(contentPane);
        pack();
        setLocationByPlatform(true);

    }

    //обработка выбора из комбобокса
    class CountryBoxListener implements ActionListener {
        public void actionPerformed (ActionEvent N){
            JComboBox box = (JComboBox)N.getSource();
            String sBoxItem = (String)box.getSelectedItem();//выбранная буква
            char cBoxItem = sBoxItem.charAt(0); //выбранная буква в char
            String outText="";

            ListOfCountries countries = new ListOfCountries();
            ArrayList<Country> myCountries = countries.getCountriesByLetter(cBoxItem);

            for(Country item : myCountries)
            {
                outText+="Страна: "+item.name+" "+"Код: "+item.code+"\n";
            }
            countryTextArea.setText(outText);
        }
    }

}
