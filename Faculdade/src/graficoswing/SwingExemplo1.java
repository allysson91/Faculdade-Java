package graficoswing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingExemplo1 extends JFrame {
JPanel panel;
JLabel msg;

//Uso do construtor.
public SwingExemplo1() {
super("Texto do titulo da tela");
}

public void criaJanela() {
Container x = getContentPane();

panel = new JPanel();

msg = new JLabel("Digite seu nome:");
panel.add(msg);

msg = new JLabel("Digite seu sobrenome:");
panel.add(msg);
x.add(panel, BorderLayout.CENTER);

panel = new JPanel();
msg = new JLabel("Digite sua cor favortita");
panel.add(msg);
x.add(panel, BorderLayout.SOUTH);

panel = new JPanel();
msg = new JLabel("Digite sua idade");
panel.add(msg);
x.add(panel, BorderLayout.NORTH);

panel = new JPanel();
msg = new JLabel("Digite seu telefone");
panel.add(msg);
x.add(panel, BorderLayout.WEST);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setSize(275, 200);// 1 - largura , 2 - altura
setVisible(true);
}

public static void main(String args[]) {
SwingExemplo1 s = new SwingExemplo1();
s.criaJanela();
}
}
