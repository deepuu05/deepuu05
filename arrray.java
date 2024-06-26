// largest number of an array
import java.util.Scanner;
class Demo {
    void Arr(){
    int age[]={1,3,5,6};
    int ans=0;
   for(int i=0;i< age.length ;i++){
       if(age[i]>sum){
           ans=age[i];
       }
   }
          System.out.println(ans);

    }
}
public class Main{
    public static void main(String[] args) {
       // System.out.println("hello world");
        Demo obj= new Demo();
        //.age=20;
    //System.out.println("the age is "+obj.age);
    obj.Arr();
    }
}
