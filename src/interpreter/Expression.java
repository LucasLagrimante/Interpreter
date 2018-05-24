/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author Aluno
 */
public abstract class Expression {

    public abstract String One();

    public abstract String Four();

    public abstract String Five();

    public abstract String Nine();

    public abstract int Multiplier();

    public void Interpret(Context context) {
        if (context.input.length() == 0) {
            return;
        }

        if (context.input.startsWith(Nine())) {
            context.output += (9 * Multiplier());
            context.input = context.input.substring(2);
        } else if (context.input.startsWith(Four())) {
            context.output += (4 * Multiplier());
            context.input = context.input.substring(2);
        } else if (context.input.startsWith(Five())) {
            context.output += (5 * Multiplier());
            context.input = context.input.substring(1);
        }

        while (context.input.startsWith(One())) {
            context.output += (1 * Multiplier());
            context.input = context.input.substring(1);
        }
    }
;
}
