/**
 * Created by Dulya on 28.04.2016.
 */
import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;

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

    JLabel label = new JLabel("ВЫБЕРИТЕ БУКВУ: ");
    JComboBox countryBox = new JComboBox(country);
    final JTextArea  countryTextArea = new JTextArea(5,10);
    //JScrollPane scrollPane = new JScrollPane(countryTextArea);
    Color newColor = new Color(200, 200, 255,50);


    private void createGUI()
    {

        final JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        //contentPane.setLayout(new GridLayout(2,1));

        ActionListener countryBoxListener = new CountryBoxListener();
        countryBox.addActionListener(countryBoxListener);

        countryBox.setBackground(Color.LIGHT_GRAY);
        countryTextArea.setBackground(Color.WHITE);
       // contentPane.add(label, BorderLayout.NORTH);
        contentPane.add(countryBox, BorderLayout.NORTH);
        contentPane.add(countryTextArea, BorderLayout.CENTER);

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

            countryTextArea.setBackground(newColor);
        }
    }

}
