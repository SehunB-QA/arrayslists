package arrayslists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListProgram {
	
	List<String> manUnitedPlayerNames = new ArrayList<>();

   public void AddNames()
   {
	   manUnitedPlayerNames.add("Anthony Martial");
	   manUnitedPlayerNames.add("Marcus Rashford");
   }
   
 
   public void DisplayNames()
   {
	   for(int i=0; i < manUnitedPlayerNames.size(); i++){
           System.out.println( manUnitedPlayerNames.get(i) );
   }
	   
   }
	   public void DisplayNamesWithEnhancedForLoops()
	   {
		   for(String str : manUnitedPlayerNames) {
		        System.out.println(str);
		    }
		  
	   }
	   
	   public void GetNamesAtIndexZero()
	   {
	   System.out.println(manUnitedPlayerNames.get(0));
	   }
	   
	   
	   public void AddMoreNames()
	   {
	   manUnitedPlayerNames.add("Paul Pogba");
	   manUnitedPlayerNames.add("Juan Mata");
	   manUnitedPlayerNames.add("Scott McTominay");
		   
	   }


	   
	   public void ReplaceNames()
	   {
	   manUnitedPlayerNames.set(1,"Luke Shaw");
	   manUnitedPlayerNames.set(2,"Phil Jones");
	   manUnitedPlayerNames.set(3,"Mason greenwood");
		   
	   }
	   
	   public void RemoveNameAtIndexZero()
	   {
		   manUnitedPlayerNames.remove(0);
	   }
	   
	   
	   public void SortNames()
	   {
		   Collections.sort(manUnitedPlayerNames);
	   }
	   
	   

}
