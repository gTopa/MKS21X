public class Sorts{
    public static void printArray(int[] data){
	if (data.length==0){
	    System.out.println("[]");
	}else{
	    String out="[";
	    for (int i=0;i<data.length;i++){
		out+=data[i]+", ";
	    }
	    System.out.println(out.substring(0,out.length()-2)+"]");
	}
    }
    public static void insertionSort(int[] data){
	int temp=0;
	for(int i=1;i<data.length;i++){
	    temp=data[i];
	    data[shift(i,data)]=temp;
	    printArray(data);
	}
    }
    public static int shift(int pos, int[] data){
	int temp=data[pos];
	for (int i=pos-1;i>=0;i--){
	    if(data[i]>temp){
		data[i+1]=data[i];
	    }else{
		return i+1;
	    }
	}
	return 0;
    }
    public static void selectionSort(int[] data){
	for (int start=0;start<data.length-1;start++){
	    int min=Integer.MAX_VALUE;
	    int pos=0;
	    for (int i=start;i<data.length;i++){
		if(data[i]<min){
		    min=data[i];
		    pos=i;
		}
	    }
	    data[pos]=data[start];
	    data[start]=min;
	    printArray(data);
	}
    }
    public static void main(String[]args){
	int[] t1 = new int[] {1,2,9,7,8,0,0,2};
	int[] t2 = new int[] {1,2,9,7,8,0,0,2};
	selectionSort(t1);
	System.out.println();
	insertionSort(t2);
    }
}
