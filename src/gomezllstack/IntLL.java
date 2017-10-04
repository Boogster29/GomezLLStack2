/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomezllstack;

/**
 *
 * @author Boogster
 */
public class IntLL // creating the structure to be used for LLStack
{
    private int value = 0;
    public IntLL nextLL = null;
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
