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
public class TenExpression extends Expression {

    @Override
    public String One() {
        return "X";
    }

    @Override
    public String Four() {
        return "XL";
    }

    @Override
    public String Five() {
        return "L";
    }

    @Override
    public String Nine() {
        return "XC";
    }

    @Override
    public int Multiplier() {
        return 10;
    }

}
