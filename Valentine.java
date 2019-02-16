
package valentine;
import java.util.ArrayList;
import java.util.Scanner;
public class Valentine {

    
    public static void main(String[] args) {
    ArrayList<String>tim=new ArrayList();
    Scanner jim=new Scanner(System.in); 
    System.out.println("enter student(enter exit when done)");
    int e=1;
    while(true) {
    System.out.println("student name;" + e + ": ");
    String v = jim.next();
    if(v.toLowerCase().equals("exit"))
        break;
    else
    {
       while(true){
        String name;
    String subject1;
    String subject2;
    String subject3;
    String subject4;
    String subject5;
    String suject6;
     
    int markinga;
    int markingb;
    int markingc;
    int markingd;
    int markinge;
    int markingf;
    
  int ava=0;
   Scanner a = new Scanner(System.in);
  Schoolgrades obj = new Schoolgrades ();
    System.out.println("enter student");
    obj.name = a.next();
    System.out.println("enter course unit 1");
    obj.subject1=a.next();
    System.out.println("enter mark");
    obj.markinga=a.nextInt();
    System.out.println("enter course unit 2");
    obj.subject2=a.next();
    System.out.println("enter mark");
    obj.markingb=a.nextInt();
    System.out.println("enter course unit 3");
    obj.subject3=a.next();
    System.out.println("enter mark");
   obj.markingc=a.nextInt();
    System.out.println("enter course unit 4");
    obj.subject4=a.next();
    System.out.println("enter mark");
    obj.markingd=a.nextInt();
    System.out.println("enter course unit 5");
    obj.subject5=a.next();
    System.out.println("enter mark");
    obj.markinge=a.nextInt();
    System.out.println("enter course unit 6");
    obj.suject6=a.next();
    System.out.println("enter mark");
    obj.markingf=a.nextInt();
    
    
    
System.out.println("Name: "+ obj.name );
System.out.println("courses");
System.out.println(obj.subject1+obj.markinga);
System.out.println(obj.subject2+obj.markingb);
System.out.println(obj.subject3+obj.markingc);
System.out.println(obj.subject4+obj.markingd);
System.out.println(obj.subject5+obj.markinge);
System.out.println(obj.suject6+obj.markingf);


float ava=(obj.markinga+obj.markingb+obj.markingc+obj.markingd+obj.markinge+obj.markingf)*100/60;
       
System.out.println("GPA IS: "+ ava);
       
        tim.add(v);
        e++;
       
    }
    }
    }
    
}
