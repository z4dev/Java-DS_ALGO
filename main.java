package Java ;
import static  Java.Printer.print; 



class MyValue<K,V> {
     V value;
     K key; 
        
     MyValue(K k , V v ){
       this.value = v ;
       this.key = k ;
    }

    public MyValue<K, V> getValue(K key, V value) {
        return new MyValue<>(key, value);
    }

     // Override toString() to print key and value
     @Override
     public String toString() {
         return "Key: " + key + ", Value: " + value;
     }
}

class HelloWorld {
    public static void main(String[] args) {
        MyValue<String,Integer> str1 = new MyValue<String,Integer>("hello",10);
         print(str1.getValue("hellom",10));
        print(str1); // print the refernce of the object rather that the k,v
    }
}


