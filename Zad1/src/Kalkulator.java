import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame {

    private JPanel panel1;
    private JRadioButton kwadratRadioButton;
    private JRadioButton prostokatRadioButton;
    private JRadioButton trojkatRadioButton;
    private JRadioButton trapezRadioButton;
    private JRadioButton szescianRadioButton;
    private JRadioButton prostopadloscianRadioButton;
    private JRadioButton kulaRadioButton;
    private JRadioButton walecRadioButton;
    private JTextField bok_a;
    private JTextField bok_b;
    private JTextField wysokosc;
    private JTextField promien;
    private JTextField pole_wynik;
    private JTextField obwod_wynik;
    private JTextField objetosc_wynik;
    private JButton oblicz;
    private JButton wyczysc;

    public Kalkulator(){
        super("Figury geometryczne - kalkulator");
        this.setContentPane(panel1);

        bok_a.setEnabled(false);
        bok_b.setEnabled(false);
        wysokosc.setEnabled(false);
        promien.setEnabled(false);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object object = e.getSource();
                if(kwadratRadioButton.isSelected()){
                    bok_a.setEnabled(true);
                    bok_b.setEnabled(false);
                    wysokosc.setEnabled(false);
                    promien.setEnabled(false);
                } else if (prostokatRadioButton.isSelected()){
                    bok_a.setEnabled(true);
                    bok_b.setEnabled(true);
                    wysokosc.setEnabled(false);
                    promien.setEnabled(false);
                } else if(trapezRadioButton.isSelected()){
                    bok_a.setEnabled(true);
                    bok_b.setEnabled(true);
                    wysokosc.setEnabled(true);
                    promien.setEnabled(false);
                } else if(trojkatRadioButton.isSelected()){
                    bok_a.setEnabled(true);
                    bok_b.setEnabled(true);
                    wysokosc.setEnabled(true);
                    promien.setEnabled(false);
                } else if(szescianRadioButton.isSelected()){
                    bok_a.setEnabled(true);
                    bok_b.setEnabled(true);
                    wysokosc.setEnabled(true);
                    promien.setEnabled(false);
                }else if(prostopadloscianRadioButton.isSelected()){
                    bok_a.setEnabled(true);
                    bok_b.setEnabled(true);
                    wysokosc.setEnabled(true);
                    promien.setEnabled(false);
                }else if(kulaRadioButton.isSelected()){
                    bok_a.setEnabled(false);
                    bok_b.setEnabled(false);
                    wysokosc.setEnabled(false);
                    promien.setEnabled(true);
                }else if(walecRadioButton.isSelected()){
                    bok_a.setEnabled(false);
                    bok_b.setEnabled(false);
                    wysokosc.setEnabled(true);
                    promien.setEnabled(true);
                }
                if(object == oblicz){
                    if(kwadratRadioButton.isSelected()){
                        double a = Double.parseDouble(bok_a.getText());
                        double pole = a*a;
                        double obwod = 4*a;
                        pole_wynik.setText(String.valueOf(pole));
                        obwod_wynik.setText(String.valueOf(obwod));
                    } else if (prostokatRadioButton.isSelected()){
                        double a = Double.parseDouble(bok_a.getText());
                        double b = Double.parseDouble(bok_b.getText());
                        double pole = a*b;
                        double obwod = 2*a+2*b;
                        pole_wynik.setText(String.valueOf(pole));
                        obwod_wynik.setText(String.valueOf(obwod));
                    } else if(trapezRadioButton.isSelected()){
                        double a = Double.parseDouble(bok_a.getText());
                        double b = Double.parseDouble(bok_b.getText());
                        double h = Double.parseDouble(wysokosc.getText());
                        double pole = ((a+b)*h)/2;
                        pole_wynik.setText(String.valueOf(pole));
                    } else if(trojkatRadioButton.isSelected()){
                        double a = Double.parseDouble(bok_a.getText());
                        double h = Double.parseDouble(wysokosc.getText());
                        double pole = (a*h)/2;
                        pole_wynik.setText(String.valueOf(pole));
                    } else if(szescianRadioButton.isSelected()){
                        double a = Double.parseDouble(bok_a.getText());
                        double pole = 6*(a*a);
                        double objetosc = a*a*a;
                        pole_wynik.setText(String.valueOf(pole));
                        objetosc_wynik.setText(String.valueOf(objetosc));
                    }else if(prostopadloscianRadioButton.isSelected()){
                        double a = Double.parseDouble(bok_a.getText());
                        double b = Double.parseDouble(bok_b.getText());
                        double h = Double.parseDouble(wysokosc.getText());
                        double pole = 2*((a*b)+(a*h) + (h*b));
                        double obwod = a*b*h;
                        pole_wynik.setText(String.valueOf(pole));
                        objetosc_wynik.setText(String.valueOf(obwod));
                    }else if(kulaRadioButton.isSelected()){
                        double r = Double.parseDouble(promien.getText());
                        double objetosc = (4/3) * Math.PI * Math.pow(r, 3);
                        objetosc_wynik.setText(String.valueOf(objetosc));
                    }else if(walecRadioButton.isSelected()){
                        double r = Double.parseDouble(promien.getText());
                        double H = Double.parseDouble(wysokosc.getText());
                        double pole = 2*Math.PI*Math.pow(r,2) + 2 * Math.PI*r*H;
                        double objetosc = Math.PI * Math.pow(r,2) * H;
                        pole_wynik.setText(String.valueOf(pole));
                        objetosc_wynik.setText(String.valueOf(objetosc));
                    }
                }
                if(object == wyczysc){
                    bok_a.setText("");
                    bok_b.setText("");
                    wysokosc.setText("");
                    promien.setText("");
                    pole_wynik.setText("");
                    obwod_wynik.setText("");
                    objetosc_wynik.setText("");
                }
            }
        };
        kwadratRadioButton.addActionListener(actionListener);
        prostokatRadioButton.addActionListener(actionListener);
        trojkatRadioButton.addActionListener(actionListener);
        trapezRadioButton.addActionListener(actionListener);
        szescianRadioButton.addActionListener(actionListener);
        prostopadloscianRadioButton.addActionListener(actionListener);
        kulaRadioButton.addActionListener(actionListener);
        walecRadioButton.addActionListener(actionListener);
        oblicz.addActionListener(actionListener);
        wyczysc.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        Kalkulator app = new Kalkulator();
        app.setVisible(true);
        app.setSize(700, 350);
    }
}
