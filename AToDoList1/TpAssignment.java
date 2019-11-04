package AToDoList;

public class TpAssignment extends Assignment {
    //短期任务

    private String deadline;

    public TpAssignment(String name,String detail,String deadline){
        super(name,detail);
        this.deadline=deadline;
    }
    public void setDeadline(String deadline){this.deadline=deadline;}
    public String getDeadline(){return deadline;}
}
