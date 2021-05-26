/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcional_lambda;
import java.util.function.BiPredicate;
/**
 *
 * @author mahmoud_mohsen
 */
public class Funcional_lambda {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String string2="mahmoud mohsen";
        String string1="mahmoud";
	StringUtils.betterString(string1, string2, (s1,s2)->s1.length()>s2.length());
	StringUtils.betterString(string1, string2, (s1,s2)->true);
       
         
    }
    
}
