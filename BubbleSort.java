public class BubbleSort{
	  public static void main(String[] args){
		  int[] numbers = {9,5,7,6,2,8,1,10,11,12};
		  for(int i=0;i<numbers.length;i++){
			  for(int j=0;j<numbers.length-i-1;j++){
				  int temp;
				  if(numbers[j]>numbers[j+1]){
					  temp = numbers[j];
					  numbers[j] = numbers[j+1];
					  numbers[j+1] = temp;
				  }
			  }
		  }
		  
		  for(int i=0;i<numbers.length;i++){
			  System.out.printf(",%d",numbers[i]);
		  }
	  }
}