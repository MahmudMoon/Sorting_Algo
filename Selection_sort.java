public class Selection_sort{
	public static void main(String[] args){
		int[]  numbers = {64,25,12,22,11};
		int temp = -1;
		int smallest_pos = -1;
		for(int i=0;i<numbers.length-1;i++){
			temp = numbers[i];
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[j]<temp){
					temp = numbers[j];
					smallest_pos = j;
				}
			}
			
			temp = numbers[i];
			numbers[i] = numbers[smallest_pos];
			numbers[smallest_pos] = temp;
			
		}
		
		for(int j=0;j<numbers.length;j++){
		System.out.print(","+numbers[j]);
		}
	}
	
	
}