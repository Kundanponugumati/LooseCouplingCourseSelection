package dao;

import service.CourseList;

public class SQL implements CourseList
{
    @Override
    public void courseChoice(double amount) {
        System.out.println("SQL Course is Purchased with "+amount+" Rs");
    }
}
