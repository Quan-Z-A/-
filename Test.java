package ʵ����;

public class Test {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("qza");//��������
        graduate.setmoney(5000, 1600);//����ÿѧ�ڵķ���,�¹���
        System.out.println("qzaѧ��Ϊ��"+graduate.getxuefei());
        System.out.println("qza������Ϊ��"+graduate.getsalary()); 
        System.out.println("qza��˰�"+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(5000, 2500);//����ÿѧ�ڵķ���,�¹���
        System.out.println("zaѧ��Ϊ��"+graduate.getxuefei());
        System.out.println("za������Ϊ��"+graduate.getsalary()); 
        System.out.println("za��˰�"+((graduate.getsalary()*0.25)-1005)); 
        }
        
        
}