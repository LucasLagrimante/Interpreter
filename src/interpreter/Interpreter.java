/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Interpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String roman = JOptionPane.showInputDialog("Digite um número romano!");

        if (roman == null || roman.equals("")) {
            JOptionPane.showMessageDialog(null, "Você não digitou nada.");
        } else {

            Context context = new Context(roman);

            // Build the 'parse tree'
            List<Expression> trees = new ArrayList<>();

            trees.add(new ThousandExpression());
            trees.add(new HundredExpression());
            trees.add(new TenExpression());
            trees.add(new OneExpression());

            trees.forEach((tree) -> {
                tree.Interpret(context);
            });

            JOptionPane.showMessageDialog(null, context.getOutput());
        }
    }
}
