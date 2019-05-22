public class InsertionSort{
	public static void main(String[] args){
		int[] numbers = {9,8,7,1,2,5,6};
		for(int i=0;i<numbers.length;i++){
			int hole = i;
			int temp;
			while(hole>0 && numbers[hole]<numbers[hole-1]){
				temp = numbers[hole-1];
				numbers[hole-1]=numbers[hole];
				numbers[hole]=temp;
				hole--;
			}
		}
		
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+",");
		}
	}
}