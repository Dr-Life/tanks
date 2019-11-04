package AToDoList;

import java.util.ArrayList;

public class LAssignment extends Assignment {
    ///长期任务

    private String deadline;
    ArrayList<TpAssignment> TpAssignments=new ArrayList<>();

    public LAssignment(String name,String detail,String deadline){
        super(name,detail);
        this.deadline=deadline;
    }
    public void addAssignment(){}

    public void setDeadline(String deadline){this.deadline=deadline;}
    public String getDeadline(){return this.deadline;}
}
