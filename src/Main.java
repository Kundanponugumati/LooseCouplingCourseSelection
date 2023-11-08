import dao.*;
import service.ProcessCourse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ProcessCourse pc = new ProcessCourse();
        System.out.println("Please Enter Payment Options");
        System.out.println("Options-1 : Java");
        System.out.println("Options-2 : Spring");
        System.out.println("Options-3 : SQL");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1)
        {
          pc.setList(new Java());
        }
        else if(num==2)
        {
            pc.setList(new Spring());
        }
        else if(num==3)
        {
            pc.setList(new SQL());
        }
        else
        {
            System.out.println("Please Select Among the Three Options");
        }
        pc.doPayment(4789);
    }
}

// when constructor injection and setter injection is performed at a time then
// setter injection dominates constructor injection.