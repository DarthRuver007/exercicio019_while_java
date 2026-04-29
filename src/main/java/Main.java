

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
                int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vezes"));
        String frase = JOptionPane.showInputDialog("Digite a frase:");
        
        int i = 1;
        while (i<=n)        {
            JOptionPane.showMessageDialog(null,"A frase abaixo:\n" + frase + "\n\nSerá repetida "+ n +" vezes. \nEssa é a vez: " + i);
            i++;
        }
    }
}
