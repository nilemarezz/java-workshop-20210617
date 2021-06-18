package com.nile.hellospring.workshop02;

public class FizzBuzz {
    public String getResult(int num){
//        FizzCondition c1 = new FizzCondition();
//        BuzzCondition c2 = new BuzzCondition();
//        FizzBuzzCondition c3 = new FizzBuzzCondition();
//        if(c3.checkCondition(num)){
//            return c3.print();
//        }
//        if(c2.checkCondition(num)){
//            return c2.print();
//        }
//        if(c1.checkCondition(num)){
//            return c1.print();
//        }
        MyCondition conditions[] = new MyCondition[]{
                new FizzBuzzCondition(),
                new FizzCondition(),
                new BuzzCondition(),
                new KBTGCondition(),
        };
        for (MyCondition condition : conditions){
            if(condition.checkCondition(num)){
                return condition.print();
            }
        }
        return String.valueOf(num);
    }
}

class FizzCondition implements MyCondition {

    public boolean checkCondition(int num){
        return (num % 3 ) == 0;
    }
    public String print(){
        return "Fizz";
    }

}

class BuzzCondition implements MyCondition{
    public boolean checkCondition(int num){
        return (num % 5 ) == 0;
    }
    public String print(){
        return "Buzz";
    }
}

class FizzBuzzCondition implements MyCondition {
    public boolean checkCondition(int num){
        return (num % 15) == 0;
    }
    public String print(){
        return "FizzBuzz";
    }
}

class KBTGCondition implements MyCondition {
    public boolean checkCondition(int num){
        return (num % 7) == 0;
    }
    public String print(){
        return "KBTG JAVA";
    }
}


