package AToDoList;

import javax.swing.*;
import java.util.ArrayList;

public class AssignmentList {
    String name;
    String type;
    ArrayList<Assignment> assignments=new ArrayList<>();
    JFrame frame;

    public AssignmentList(String name,String type) {
        this.name=name;
        this.type=type;
    }

    public void addAssignment(){}        //增加任务
    public void deleteAssignment(){}     //删除任务
    public void changeAssignment(){}     // ？    弹出选择框选择需要修改的任务

    public void setName(String name){this.name=name;}              //设置名称
    public String getName(){return name;}
    public void setType(String type){this.type=type;}              //设置类型
    public String getType(){return type;}
}
