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
public class OneExpression extends Expression {

    @Override
    public String One() {
        return "I";
    }

    @Override
    public String Four() {
        return "IV";
    }

    @Override
    public String Five() {
        return "V";
    }

    @Override
    public String Nine() {
        return "IX";
    }

    @Override
    public int Multiplier() {
        return 1;
    }

}
