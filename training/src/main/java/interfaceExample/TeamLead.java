package interfaceExample;

abstract class TeamLead implements Manager{
    abstract void bakiTeamManage();

    public void leaveApprove(){
        System.out.println("chutti approve karo");
    }
}
