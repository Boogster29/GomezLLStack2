/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomezllstack2;

/**
 *
 * @author Boogster
 */
public class LLStack {
    private IntLL root;
    
    
/********************************************************
 *  Push(int value)
 *  Robert Gomez
 * ******************************************************
 * Purpose: Add new int value to end of Link List Stack
 * Method Inputs
 *      int value
 * Return Value
 *      None
 * ******************************************************
 * 10/5/2017
 * ******************************************************
 * @param value 
 ********************************************************/
    public void Push(int value)
    {
        IntLL temp = new IntLL();
        temp.setValue(value);
        IntLL temp2;
        
        if (root == null)
        {
            root = temp;
        }
        else
        {
            
            temp2 = root;
            while (temp2.nextLL != null)
            {
                temp2 = temp2.nextLL;
            }
            temp2.nextLL = temp;
        }
        
    }
    
    
/********************************************************
 *  pop()
 *  Robert Gomez
 * ******************************************************
 * Purpose: removes last Link and returns last link
 * Method Inputs
 *      none
 * Return Value
 *      removed Link
 * ******************************************************
 * 10/5/2017
 * ******************************************************
 * @param value 
 ********************************************************/
    public IntLL pop()
    {
        IntLL current = root;
        IntLL previous = root;
        
        if (root != null)
        {
            while(current.nextLL != null)
            {
                previous = current;
                current = current.nextLL;
            }
            
            if (current == root)
                root  = root.nextLL;
            else
                previous.nextLL = current.nextLL;
        }
        return current;
    }
    
    public String printLinkList()
    {
        String answer = "";
        IntLL temp = root;
        
        while(temp != null)
        {
            answer += temp.getValue() + ", ";
            temp = temp.nextLL;
        }
        
        return answer;
    }
    
    public boolean find(int value)
    {
        return recFind(value, root);
    }
    //Boolean for accepted values
    private boolean recFind(int value, IntLL current)
    {
        boolean found = false;
        
        if (current.getValue() != value)
        {
            if (current.nextLL != null)
                found = recFind(value, current.nextLL);
        }
        else
        {
            found = true;
        }
        
        return found;
    }
}
