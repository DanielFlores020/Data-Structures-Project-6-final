/*
******************************************************
*** Project 6
*** Daniel Flores
******************************************************
*** Created as part of project 6
******************************************************
*** November 7, 2017
******************************************************
*** Original, no changes
******************************************************
 */
package danielfloresproject6;

import java.util.Hashtable;
import java.util.Enumeration;

public class DFP6hashTable 
{
    Enumeration words;
    String key;
    
    Hashtable<String, String> hashtable = new Hashtable<String, String>();
    
    public void insert(String curWord)
    {
        int wordExist = 1;
        wordExist = checkWordExist(curWord);
        
        if (wordExist == 0)
        {
            hashtable.put("", curWord);
        }
        else
        {
            
        }
    }
    
    public int checkWordExist(String curWord)
    {
        int existance = 1;
        while(words.hasMoreElements())
        {
            if (curWord == words.nextElement())
            {
                existance = 0;
            }
            else
            {
                
            }
        }
        
        return existance;
    }
    
    public String displayTable()
    {
        String tempDisplay = "";
        while (words.hasMoreElements())
        {
            key = (String) words.nextElement();
            tempDisplay += hashtable.get(key);
        }
        
        return tempDisplay;
    }
}
