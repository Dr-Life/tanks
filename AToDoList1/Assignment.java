package AToDoList;

import javax.swing.*;

public class Assignment {
    protected String name;
    protected String detail;
    protected Boolean finish;
    protected JFrame frame;

    public Assignment(String name,String detail){
        this.detail=detail;
        this.name=name;
    }

    public void move(){}

    public void copy(){}

    public void setName(String name){this.name=name;}
    public String getName(){return this.name;}
    public void setDetail(String detail){this.detail=detail;}
    public String getDetail(){return this.detail;}
    public void setFinish(Boolean finish){this.finish=finish;}
    public Boolean getFinish(){return this.finish;}
}
