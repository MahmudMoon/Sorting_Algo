public class margeSort{
	int[] num = {9,8,7,6,5,4,3,2,1,0};
	public static void main(String[] args){
		margeSort ms = new margeSort();
		ms.num = ms.divideArray(ms.num);
		for(int i=0;i<ms.num.length;i++){
			System.out.print(ms.num[i]+",");
		}
	}
	
	
	public int[] divideArray(int[] ary){
		if(ary.length<2){
			return ary ;
		}
		else{
			int n = ary.length;
			int mid = n/2;
			int[] left = new int[mid];
			int[] right = new int[n-mid];
			
		
			for(int i=0;i<mid;i++){
				left[i] = ary[i];
				System.out.print(" "+left[i]);
			}
			
			
			for(int j=0;j<n-mid;j++){
				right[j] = ary[j+mid];
				System.out.print(" "+right[j]);
			}
			
			
			
			left = divideArray(left);
			right = divideArray(right);
			ary = margeBoth(left,right);
			return ary;
			
		}
	}
	
	public int[] margeBoth(int[] left,int[] right){
		int i=0,j=0,k=0;
		int nL = left.length;
		int nR = right.length;
		int[] temp = new int[nL+nR];
		while(i<nL && j<nR){
			if(left[i]<right[j]){
				temp[k] = left[i];
				k++;
				i++;
			}else{
				temp[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i<nL){
			temp[k] = left[i];
			i++;
			k++;
		}
		
		while(j<nR){
			temp[k] = right[j];
			j++;
			k++;
		}
		
		return temp;
	}
}
