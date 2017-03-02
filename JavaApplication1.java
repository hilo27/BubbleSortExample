
package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("hello world!\n");
        System.out.println("hello world!");
        
        int a = 101;
       // System.out.printf("a = %d",a);
        System.out.println("a = " + a);
        a=5+2;
        System.out.println("a = " + a);
        
        float b = (float).5;
        b = b/0;
        b = b*0;
        System.out.println("b= " + b);
       
        //for (int i=0; i<10; i++) System.out.println(i);
        
        //массивы
        //int m[] = {1,7,3,9,8,23,122,11,2223,32,11};
        //for(int i=0; i<m.length; i++) System.out.println(m[i]);
        
        //цикл для каждого for each
        //for(int mi : m) System.out.println(mi); //много временных объектов
        
        a = mySum(2,3);
        System.out.println("a= "+a);
        
        int m3[] = new int[100]; //массив из 100 элементов
        
        
        // пузырьковая сортировка
        int m[] = {1,7,3,9,8,23,122,11,2223,32,12};
        System.out.println(" \n Исходная последовательность");
        for(int mi : m) System.out.print(mi+", ");
        
        for (int i=0; i<m.length; i++){
            int rightNumber = m[i];
            for (int j = i-1;j>=0;j--){
                int leftNumber = m[j];
                if (rightNumber < leftNumber) {
                    m[j+1]= leftNumber;
                    m[j]= rightNumber;                  
                } 
            }
        }
        System.out.println(" \n Новая последовательность");
        for (int mi : m) System.out.print(mi+", ");
        
        
        
    }

    private static int mySum(int a, int b) { //int mySum тип возвращаемых данных
        return a+b;
    }    
}
