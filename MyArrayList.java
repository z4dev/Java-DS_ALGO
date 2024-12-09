package Java;
import static Java.Printer.print;
import java.util.Arrays;

public class MyArrayList<T>{

    private static final int DEFAULT_CAPACITY = 10 ;
    private T[] elements ;
    private  int size;

    public MyArrayList(){
        size = 0 ;
        elements =  (T[]) new Object[DEFAULT_CAPACITY];
    }

    //add element to the end of the list 
    //at the end of the exists data , not the end of the capacity which it is 10
    public void add(T element){
        checkCapacityGuard(this.size, this.elements);
        elements[size] = element ;
        this.size+=1;
    }

    public void add(T element , int index){

          checkCapacityGuard(this.size, this.elements);
          checkIndexGuard(index);
            for(int i = index-1 ; i <= size ; i++){
                elements[i+1] = elements[i];
          }

          elements[index-1] = element;
          this.size+=1;

    }

    private void resize(){
        int newCapacity = 2 * elements.length;
        elements = Arrays.copyOf(elements, newCapacity);

    }
    public void print(){
        Java.Printer.print("[");
        for(int i = 0; i < this.size; i++){
            System.out.print(elements[i]);
            if (i < this.size - 1) {
                System.out.print(" , ");
            }
        }
        Java.Printer.println("]");
    
    };

    public void checkIndexGuard(int index) {

        if(index>0 || index > size){

            throw new IllegalArgumentException("Invalid Index: " + index);

        }
    }

    public void checkCapacityGuard(int size , T[] elements){
          if(elements.length > size){
            resize();
          }
    }
    


    public static void main(String args[]){
        MyArrayList<String> myArr = new MyArrayList<>();
        myArr.add("myArr");
        myArr.add("myArr2");
        myArr.add("myArr3");
        myArr.add("myArr4");
    

        myArr.print();
        System.err.println(myArr.size);



        
        


    }
}







