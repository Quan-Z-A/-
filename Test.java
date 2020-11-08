package 实验三;

public class Test {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("qza");//设置姓名
        graduate.setmoney(5000, 1600);//设置每学期的费用,月工资
        System.out.println("qza学费为："+graduate.getxuefei());
        System.out.println("qza年收入为："+graduate.getsalary()); 
        System.out.println("qza纳税额："+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(5000, 2500);//设置每学期的费用,月工资
        System.out.println("za学费为："+graduate.getxuefei());
        System.out.println("za年收入为："+graduate.getsalary()); 
        System.out.println("za纳税额："+((graduate.getsalary()*0.25)-1005)); 
        }
        
        
}