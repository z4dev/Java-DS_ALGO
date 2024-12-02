package Java ;

import static  Java.Printer.print; 


class Apply {
    private int age; 
    private int name;
    Apply(){}
    Apply(int x, int y){
       age = x;
       name = y;
    }
    String display(){
        return "Age: " + age + " Name: " + name;
    }
    void setter(int age, int name){
        this.age = age;
        this.name = name;
    }
}

// super => parent class 
class Pre extends Apply{

    boolean isGeeks = true;

    Pre(){
        super();
    }

    Pre(int age, int name){
        super(age, name);
    }

    @Override
     String display(){
         String output = super.display();
         setter(40,30);
         return output + " isGeeks: " + this.isGeeks;
         
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Pre obj = new Pre(10, 2);
        print(obj.display());
    }
}


