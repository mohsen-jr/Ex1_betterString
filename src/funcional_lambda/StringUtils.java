/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcional_lambda;

/**
 *
 * @author mahmoud_mohsen
 */
public interface StringUtils {
    public static void betterString(String a, String b, isBetterInterface<String> i ) {
		if (i.isBetter(a, b)){
			System.out.println("string1 is better than string2");
		}
		else {
			System.out.println("string2 is better than string1");
		}
		
		}
}
