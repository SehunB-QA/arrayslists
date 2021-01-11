package arrayslists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumArrayList {

	List<Integer> OneToTen = new ArrayList<>();
	List<Integer> OneToTenClone = new ArrayList<>();
	
	  public void AddNums()
	   {
		   OneToTen.add(3);
		   OneToTen.add(9);
		   OneToTen.add(1);
		   OneToTen.add(10);
		   OneToTen.add(7);
		   OneToTen.add(4);
		   OneToTen.add(5);
		   OneToTen.add(8);
		   OneToTen.add(6);
		   OneToTen.add(2);
	   }
	  
	  
	  public void AddCloneNums()
	   {
		   OneToTenClone.add(1);
		   OneToTenClone.add(1);
		   OneToTenClone.add(1);
		   OneToTenClone.add(1);
		   OneToTenClone.add(1);
		   OneToTenClone.add(1);
		   OneToTenClone.add(1);
		   OneToTenClone.add(1);
		   OneToTenClone.add(1);
		   OneToTenClone.add(1);
	   }
	  
	  
	  
	  
	  public void DisplayNums()
	   {
		   for(int i= 0; i < OneToTen.size(); i++){
	           System.out.println(OneToTen.get(i) );
	   }
		   
	   }
	  
	  
	  
	  public void DisplayNumsClone()
	   {
		   for(int i= 0; i < OneToTenClone.size(); i++){
	           System.out.println(OneToTenClone.get(i) );
	   }
		   
	   }
	  
	   
	  public void SortNums()
	   {
		   Collections.sort(OneToTen);
	   }
		   
	  public void ReverseNums()
	   {
		   Collections.reverse(OneToTen); 
	   }
		   
	  
	  public void SwapNums()
	   {
		   Collections.swap(OneToTen, 0, 9);
	   }
		   
	  
	  public void CloneNums()
	   {
		   Collections.copy(OneToTenClone, OneToTen);
	   }
	  
	  
}
