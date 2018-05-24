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
public class HundredExpression extends Expression {

    @Override
    public String One() {
        return "C";
    }

    @Override
    public String Four() {
        return "CD";
    }

    @Override
    public String Five() {
        return "D";
    }

    @Override
    public String Nine() {
        return "CM";
    }

    @Override
    public int Multiplier() {
        return 100;
    }

}
