package service;

import dao.Java;

public class ProcessCourse
{
    private CourseList list;

//    public ProcessCourse(CourseList list) {
//        this.list=list;
//    }

    public void setList(CourseList list) {
        this.list = list;
    }

    public void doPayment(double amount)
    {
       list.courseChoice(amount);
    }
}
