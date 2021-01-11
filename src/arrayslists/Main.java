package arrayslists;

public class Main {

	public static void main(String[] args) {
		ArrayListProgram al = new ArrayListProgram();
		NumArrayList numList = new NumArrayList();
//		al.AddNames();
//		//al.DisplayNames();
//		//al.DisplayNamesWithEnhancedForLoops();
//		//al.GetNamesAtIndexZero();
//		al.AddMoreNames();
//		//al.DisplayNames();
//		System.out.println(" ");
//		al.ReplaceNames();
//		//al.DisplayNames();
//        al.RemoveNameAtIndexZero();
//       // al.DisplayNames();
//        al.SortNames();
//        al.DisplayNames();
		
		numList.AddNums();
		//numList.DisplayNums();
		System.out.println(" ");
		numList.SortNums();
		//numList.ReverseNums();
		//numList.DisplayNums();
		//numList.SwapNums();
		//numList.DisplayNums();
		numList.SortNums();
		numList.AddCloneNums();
        numList.CloneNums();
        numList.DisplayNumsClone();
        
	}

}
