```java
public class HelloWorld {

   public static void main(string[] args){
   
     System.out.println("Hello,Woeld")
   
   }

}
```

---

```java

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

### 

### Can you change the name of `main`?

- **No**, you cannot arbitrarily rename the `main` method if you want the program to execute normally. The JVM requires the method named `main` with the exact signature to begin execution.
- `public`: Ensures the method can be accessed by the Java Runtime Environment (JRE).
- `static`: Allows the method to be called without creating an instance of the class.

---

The `static` keyword in Java indicates that a method or variable belongs to the class rather than any specific instance of the class.

- **Belongs to the class:** A `static` member is shared among all instances of the class. You can access it without creating an object of the class.
- **No object needed:** A `static` method or variable can be accessed directly using the class name.

---

Fix error

```java
The public type Counter must be defined in its own fileJava(16777541)
```

for

```java

Main.java

public class Main {
    public static void main(String[] args) {
        new Counter(); // First object
        new Counter(); // Second object
        Counter.showCount(); // Static method can be called without an object
    }
}

public class Counter {
    static int count = 0; 

    public Counter() {
        count++; 
    }

    public static void showCount() {
        System.out.println("Count is: " + count);
    }
}

```

solve

If you want to keep both classes in the same file, remove the `public` keyword from the `Counter` class. Only one class in a file can be declared as `public`, and that class must match the file name.

---

as the entry point is the `main` class so no matter to change the order like this for example

```java

class Counter {
    static int count = 0; 

    public Counter() {
        count++; 
    }

    public static void showCount() {
        System.out.println("Count is: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        new Counter();
        new Counter(); 
        Counter.showCount(); 
    }
}

```

---

Why here when remove access modifer `public` for the main function this error occurred

```java

Main.js

public class Main {
  
     static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```

error :

```java
Main method not found in class Main, please define the main method as:
public static void main(String[] args)
```

The error **"Main method not found in class Main, please define the main method as: public static void main(String[] args)"** occurs because the Java Virtual Machine (JVM) is specifically designed to look for a **`public static void main(String[] args)`** method as the entry point to start execution.

- **`public`:** Makes it accessible to the JVM.
- **`static`:** Allows it to be called without an object.
- **`void`:** Does not return anything.
- **`String[] args`:** Accepts command-line arguments.

### **Why Does the JVM Require `public static void main`?**

1. **`public`:** The JVM needs to access the `main` method from outside the class.
2. **`static`:** The JVM can invoke the method without creating an instance of the class.
3. **Exact Method Signature:** This is part of the Java language specification, ensuring consistency across all Java programs.

```java

```

### **السبب الأساسي:**

### عند تنفيذ البرنامج:

1. لا يتم إنشاء كائن من الكلاس **HelloWorld** بشكل افتراضي.
2. JVM تحتاج إلى نقطة بداية (entry point) لتشغيل البرنامج.
3. باستخدام `static`، يمكن استدعاء الدالة `main` مباشرةً من الكلاس **HelloWorld** دون الحاجة إلى إنشاء كائن من هذا الكلاس.

باستخدام `static`، يمكن استدعاء الدالة `main` مباشرةً من الكلاس **HelloWorld** دون الحاجة إلى إنشاء كائن من هذا الكلاس.

### **ملخص مزايا استخدام `static` في `main`:**

1. **بساطة التنفيذ:** JVM لا تحتاج إلى إنشاء كائن لتشغيل البرنامج.
2. **نقطة دخول ثابتة:** `main` تعمل كمدخل موحد لجميع برامج Java.
3. **كفاءة:** يمنع الحاجة لإنشاء كائن غير ضروري عند بدء التنفيذ.
4. **تصميم لغوي:** Java صُممت لتجعل `main` دالة عامة تُنفذ مباشرةً دون تعقيدات.

The `static` keyword is what causes `x` to be shared across all instances. If you don't want this behavior, make `x` a non-static instance variable.

### **Conclusion**

- The JVM requires the `main` method to follow the exact signature `public static void main(String[] args)` for program execution.
- Removing or altering any part of this signature will result in a runtime error because the JVM will not be able to locate the entry point.

---

- When removing the public access modifier from the class  :  it would be package-private scope

If the class is not `public`, it will have **package-private** (default) visibility, meaning it can only be accessed by other classes in the same package.

---

Weird Thing

```java
Main.java

class Main {

     public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}

```

- Only one of the classes is declared as `public`, or none of the classes are `public`.
- The file name matches the name of the `public` class, or if no class is `public`, you can still compile and run each class separately.

Both `Main` and `HelloWorld` have their own `main` methods, and each can act as the entry point for a program.

for example you can remove the Main and there is no matter

```java

class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}

الحين لما ادوس رن ويجي الكومباير يحول ل رن

```

Reason

Since neither `Main` nor `HelloWorld` is declared `public`, Java does not enforce the rule that the file name must match the name of the `public` class.

You can save the file with any name (e.g., `Test.java`), compile it, and run either `Main` or `HelloWorld` independently.

---

Examples

```java

class Solution{
    static int x = 1  ;
}

class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        Solution s = new Solution();
        System.out.println(s.x);
  
    }
}

```

The code does not cause an error because in Java, **static variables** are shared across all instances of the class and can be accessed without creating an instance. Here's a detailed explanation of what's happening in your code:

```java

class Solution{
    static int x = 1  ;
}

class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(Solution.x=5);
  
    }
}

```

here there is no error

---

As Static is shardable between all clases

```java

class Solution{
    static int  x = 0 ;
    public  Solution(){
        x = x+1;
    }
}

class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        new Solution();
        new Solution();
        System.out.println(Solution.x);
  
    }
}

```

all access the same (x) when put static .. means when modifies it in one all is going to modify

---

How constant the variable ?? use `final`  int x

---

# Strings

---

### **`equals` Method (value):boolean**

- The `equals` method in Java **compares the content (value)** of two strings.
- It returns `true` if the values of the two strings are the same, and `false` otherwise.

```java
String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1.equals(s2)); 
```

→ True as the content is the same

### **`compareTo` Method (value):int**

- The `compareTo` method **compares two strings lexicographically(الترتيب الاعجمي ، مثل الاوبجيكت)**.

→It is based on the sequence of characters in the strings and their position in the Unicode or ASCII table. Essentially, lexicographical order is similar to alphabetical order but extends to all characters, including numbers, special characters, and upper/lowercase distinctions.

- It returns:
  - `0` if both strings are equal.
  - A negative number if the first string is lexicographically less than the second string.
  - A positive number if the first string is lexicographically greater than the second string.

In summary:

- **`equals`: Compares the content (value).**
- **`compareTo`: Compares lexicographically.**
- **`==`: Compares references (memory addresses).**

---

Examples about `compareTo` :

```java
String a = "aa";
String b = "baba";

a.compareTo(b)
----
a vs b 

a is 97 in ASCII 
b is 98 in ASCII 

b>a 

97 - 98 

returns (-1)
```

then it returns (-2)

### Step-by-Step ASCII Analysis:

1. **Compare the first characters of `a` and `b`**:

   - `a.charAt(0)` is `'a'` (ASCII value = 97).
   - `b.charAt(0)` is `'b'` (ASCII value = 98).

   Since `97 < 98`, string `a` is **lexicographically smaller** than string `b`, and the comparison stops here. The result of `a.compareTo(b)` will be negative.

---

Another examples

```java
String a = "ba";
String b = "baba";

a.compareTo(b)
---

b = b , as 98 = 98 
a = a , as 97 = 97 

check if length still in a ? 

The result of "ba".compareTo("baba") would be negative because "ba"
is shorter than "baba".

Negative 

2-4 = -2 
```

———

## Loops :

---

Arrays :

---

## Arrays

---

```java
String names[] = {"Ahmed","moh","ALI"};
String name = names[0] // the first element 
int length  = names.length;

---- when say 

int z[] = new int[10] 

that means save 10 places in the memory for the z array 
[0][0][0][0][0][0][0][0][0][0]

---
 to print the memory address for single int 
```

class PracticeProgram{
public static void main(String[] args) {
int m[] = new int[10];
int hashcode = System.identityHashCode(m[2]); // return int hashcode
System.out.println(hashcode); // return 0
}
}
``

If you tried directly to pirnt the arra it will causes an printing the address
of the arr

To summarize, 657381135 is the result of calling System.identityHashCode()
on m[2], and it doesn't give a direct memory address but a unique identifier
for that specific value.

```

```java
class PracticeProgram {
    public static void main(String[] args) {
        // Create an array and assign it to both m and z
        int[] m = new int[10];   // Initialize the array with 10 elements
        int[] z = m;             // z now references the same array as m

        // Modify an element through m
        m[2] = 42;

        // Now both m and z reference the same array, so the change will reflect in both
        int hashcodeM = System.identityHashCode(m);  // Get the identity hash code of m
        int hashcodeZ = System.identityHashCode(z);  // Get the identity hash code of z

        // Print the hash codes (both should be the same)
        System.out.println("Hash code for m: " + hashcodeM);
        System.out.println("Hash code for z: " + hashcodeZ);

        // Print the value at index 2 (it will be the same for both m and z)
        System.out.println("Value at index 2 in m: " + m[2]);
        System.out.println("Value at index 2 in z: " + z[2]);
    }
}

// here two arrays point at the same reference

int myNumbers[][] = {{1,2,3}}
int myNumber = myNumbers[0][0] , //row , column -> first row , first element 

for(int i = 0 ; i < myNumbers.length ; i++)
   for(int j = 0 ; j < myNumbers[i].length  ; j++)
      sum+=myNumbers[i][j]
```

---

## Methodes

---

```java
 access_modifier return_type methode_name params
 
 
 public int sum(a,b){
 
  int z;
  z = a+b;
  return z;
 
 }
```

```java
class UserMethods {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean priNT(){

        return isEven(5);

    }

}

class PracticeProgram {
    public static void main(String[] args) {
        int myNumbers[][] = {{1,2,3} , {4,5}};
        int sum = 0 ;
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                sum += myNumbers[i][j];
            }
        }

        System.out.println("Sum = " + sum);

        System.err.println(UserMethods.priNT());

    }
}

when not use static -> use 

boolean result = new UserMethods().priNT()
```

- overloading : the Methods can be the same name but different params

---

## problems

---

→ this is geometric series = n(n+1) / 2

- smallest number between L and R

```java
public static findMaxIndex (int[]A , int L , in R ) {

  if(A == null || A.length == 0 || L > R || L > A.length) 
     throw new IllegalErrorArgumet("Inavalid input")
   
  
 max = L 
 for(int i = L+1 ; i < R.length ; i++){
 
    if (A[i] > A[max]) 
       max = A[i]
   
 } 
 
 return max ;  

}
```

# Good Bye Sequential Programming

---

OOP started

---

```java
Class Variables (static) var

```java
access_modifier class className {
data_members;
constructor;
methodes;
blocks;

}

access_modifier without using it the scope is Package-Private
```

---

- remember , you can not have more than one class is public . Also the one name should be like the file name
- you can not define anything outside class forexample

```java
package Java ;

    public static void print(Object text){
          System.out.println(text);
    }

class HelloWorld {
    static int x = 5 ; 
    static int y = 7 ; 
    public static void main(String[] args) {
        HelloWorld instance1 = new HelloWorld();
        Printer.print(instance1.x);
    }
}

//error solution

class Printer {
    public static void print(Object text){
          System.out.println(text);
    }
}
```

---

**static** variable vs instance variable

```
class HelloWorld {
     int x = 5 ; 
     int y = 7 ; 
     HelloWorld(){
        x+=1;
     }
    public static void main(String[] args) {
        new HelloWorld();  // here the increment applied at the instance it self not the original x 
        new HelloWorld(); // also the same thing here 
        Printer.print(new HelloWorld().x);

   
    }
}

```

```java
how to use print in java

package Java ;

import static Java.Printer.print; // static import

class HelloWorld {
     int x = 5 ; 
     int y = 7 ; 
     HelloWorld(){
        x+=1;
     }
    public static void main(String[] args) {
        new HelloWorld();  // here the increment applied at the instance it self not the original x 
        new HelloWorld(); // also the same thing here 
        print(new HelloWorld().x);

   
    }
}

--- Printer.java code 

package Java;

public class Printer {
    public static void print(Object text){
        System.err.println(text);
    }
}

```

---

```java
final is use to :
- disallows of override a function
- disallows reassign value to varible
```

public static void print(Object input) {
System.err.println(input);
}

# What is the Warning (Shadowing) in Java ?

```java
class Apply {
    private int age; 
    private int name;
    Apply(){}
    Apply(int age, int name){
        this.age = age;
        this.name = name;
    }
    String display(){
        return "Age: " + age + " Name: " + name;
    }
    void setter(int age, int name){
        age = age;
        name = name;
    }
}
```
`It Happends when you try to put the parameter name the same name `
`as the class memeber property name `



`important to talk : the static methods are finals means you can not override them`