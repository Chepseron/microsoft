/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticTests;

/**
 *
 * @author Amon.Sabul
 */
class StaticVariables {

    public static int staticVariable;

    public static void main(String[] args) {
    }

    public int returnStaticMethod() {
        staticVariable = 12;
        return staticVariable;
    }

}
