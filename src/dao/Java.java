package dao;

import service.CourseList;

public class Java implements CourseList
{
    @Override
    public void courseChoice(double amount) {
        System.out.println("Java Course is Purchased with "+amount+" Rs");
    }
}
