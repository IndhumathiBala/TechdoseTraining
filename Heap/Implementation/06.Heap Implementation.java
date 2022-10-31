import java.util.*;
public class Main{
    static int heap[];
    static int maxSize,size;
    
    Main(int maxSize){
        this.maxSize=maxSize;
        size=0;
        heap=new int[maxSize+1];
    }
    
    static void push(int val){
        heap[size+1]=val;
        int i=size+1;
        while(i>1 && heap[i/2]<heap[i]){
            swap(i/2,i);
            i=i/2;
        }
        size++;
    }
    
    static void swap(int i,int j){
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
    
    static int pop(){
        int popped=heap[1];
        heap[1]=heap[size];
        size--;
        heapify(1);
        return popped;
    }
    
    static void heapify(int index){
        int left=2*index;
        int right=2*index+1;
        int largest=index;
        if(left<=size && heap[left]>heap[largest]){
            largest=left;
        }
        if(right<=size && heap[right]>heap[largest]){
            largest=right;
        }
        if(largest!=index){
            swap(largest,index);
            heapify(largest);
        }
    }
    
    static void increaseKey(int index,int key){
        heap[index]=heap[index]+key;
        int i=index;
        while(i>1 && heap[i/2]<heap[i]){
            swap(i/2,i);
            i=i/2;
        }
    }
    
    static void decreaseKey(int index,int key){
        heap[index]=heap[index]-key;
        heapify(index);
    }
    
    static int max(){
        return heap[1];
    }
    
    static void print(){
        for(int i=1;i<=size;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		Main heap=new Main(N);
		for(int i=0;i<N;i++){
		    push(sc.nextInt());
		}
		print();
		System.out.println("Popped element : "+pop());
		print();
		increaseKey(2,5);//2-index , 4-increaseKey
		print();
		decreaseKey(3,2);
		print();
		System.out.print("Maximum Element : "+max());
	}
}
