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
public class ThousandExpression extends Expression {

    @Override
    public String One() {
        return "M";
    }

    @Override
    public String Four() {
        return " ";
    }

    @Override
    public String Five() {
        return " ";
    }

    @Override
    public String Nine() {
        return " ";
    }

    @Override
    public int Multiplier() {
        return 1000;
    }

}
