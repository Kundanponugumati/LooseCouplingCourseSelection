package dao;

import service.CourseList;

public class Spring implements CourseList {
    @Override
    public void courseChoice(double amount) {
        System.out.println("Spring Course is Purchased with "+amount+" Rs");
    }
}
