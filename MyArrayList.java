package Java;
import static Java.Printer.print;

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
    public void add(Object element){
        elements[size] = (T) element ;
        size+=1;
    }
    public T[] get(){
        return elements;
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
    }
    


    public static void main(String args[]){
        MyArrayList<String> myArr = new MyArrayList<>();
        myArr.add("Apple");
        myArr.add("Banana");
        myArr.add(1);
        myArr.add(true);
        myArr.add("Banana");
        myArr.add("Banana");

        myArr.print();
        


    }
}







