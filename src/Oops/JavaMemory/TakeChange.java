package Oops.JavaMemory;

public class TakeChange {
/*
* let's break down what are we doing here
* we are trying change of data
* we declare obj.data = 5 but still it doesn't change obj.data
* because we call changeValue(a,obj) when we call this method
* its launch its own parameter in stack memory, and it will change
* obj.data = 5 to obj.data = 100
* so if you write changeValue(a,obj) before obj.data = 5, so it will assign obj.data = 100
* and then obj.data = 5 will be assigned
* */
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        Data obj = new Data();
        obj.data = 5;
        changeValue(a,obj);
        System.out.println(obj.data);



    }

    static void changeValue(int a,Data obj){
        a = 10;
        obj.data = 100;
    }
}

class Data{
    int data;
}