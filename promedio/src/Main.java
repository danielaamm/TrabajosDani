import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String x = JOptionPane.showInputDialog("Dame la cantidad 1");
        String y = JOptionPane.showInputDialog("Dame la cantidad 2");
        String z = JOptionPane.showInputDialog("Dame la cantidad 3");
        System.out.println("El promedio es: ");
        System.out.println((Double.parseDouble(x) + Double.parseDouble(y) + Double.parseDouble(z))/3);
    }
}