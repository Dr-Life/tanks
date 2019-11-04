package AToDoList;

public class CyAssignment extends Assignment {
    //周期任务

    private String actDate;       //执行日期
    private int time;             //循环次数
    private int cycle;            //循环周期

    public CyAssignment(String name,String detail,String actDate,int time,int cycle){
        super(name,detail);
        this.actDate=actDate;
        this.cycle=cycle;
        this.time=time;
        this.finish=false;
    }

    public void setActDate(String actDate){this.actDate=actDate;}
    public String getActDate(){return actDate;}
    public void setTime(int time){this.time=time;}
    public int getTime(){return time;}
    public void setCycle(int cycle){this.cycle=cycle;}
    public int getCycle(){return cycle;}

}
