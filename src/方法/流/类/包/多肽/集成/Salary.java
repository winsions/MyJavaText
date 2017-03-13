package 方法.流.类.包.多肽.集成;
/**
 * Created by winsion on 2017/3/13
 */
public class Salary extends Employee {

    private double salary;


    public Salary(String name,String address,int number,double salary){
        super(name,address,number);

        setSalary(salary);
    }

    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double newSalary)
    {
        if(newSalary >= 0.0)
        {
            salary = newSalary;
        }
    }
    public double computePay()
    {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
