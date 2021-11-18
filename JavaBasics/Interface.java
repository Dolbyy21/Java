package com.JavaBasics;

interface Writerr{
    void write();
}

class Penn implements Writerr{
    public void write(){
        System.out.println("Im a Pen");
    } 
}

class Pencill implements Writerr{
    public void write(){
        System.out.println("Im a Pencil");
    }
}

class Kit{
    public void doSomething(Writerr  p){
        p.write();
    }
}


public class Interface {
    public static void main(String[] args){

        Writerr w1  =new Penn();
        Writerr w2 = new Pencill();

        Kit k = new Kit();

        k.doSomething(w1);
        k.doSomething(w2);

    }
    
}
