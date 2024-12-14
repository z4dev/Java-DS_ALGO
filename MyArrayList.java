package Java;
import static Java.Printer.print;
import static Java.Printer.println;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList<T>{

    private static final int DEFAULT_CAPACITY = 10 ;
    private T[] elements ;
    private  int size;

    public MyArrayList(){
        size = 0 ;
        elements =  (T[]) new Object[DEFAULT_CAPACITY];
    }


    public T get(int index){
        checkIndexGuard(index);
        return elements[index];
    }
    public void set(int index){
        checkIndexGuard(index);


    }

    public void clear(){
        this.size = 0 ; 
        elements =  (T[]) new Object[DEFAULT_CAPACITY];
    }

    public T[] removeAt(int index){
        for(int j = index ;j <= size-1; j++){
            elements[j] = elements[j+1];
        }
        this.size-=1;
        elements[size] = null; // Optional, helps with garbage collection for object arrays

        return elements;

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
            for(int i = index; i <= size ; i++){
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
        MyArrayList<Object> myArr = new MyArrayList<>();
        myArr.add("myArr");
        myArr.add("myArr2");
        myArr.add("myArr3");
        myArr.add("myArr4");  
        myArr.print();
    }
}







