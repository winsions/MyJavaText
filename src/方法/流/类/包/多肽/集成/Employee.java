package 方法.流.类.包.多肽.集成;

/**
 * Created by winsion on 2017/3/13d抽象类
 */;
public abstract class Employee {


    private String name;
    private String address;
    private int number;

    public Employee(String name,String address,int number){

        System.out.println("chou想累");

        this.name = name;
        this.address = address;
        this.number = number;

    }

    public abstract double computePay();
    public void checkmail(){

        System.out.println("checkmail"+this.name +" "+this.address);


    }
    public String toString()
    {
        return name + " " + address + " " + number;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    public int getNumber()
    {
        return number;
    }
}