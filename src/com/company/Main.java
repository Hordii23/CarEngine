package com.company;

public  class Main implements Cloneable {
    public  static void main(String[] args) throws CloneNotSupportedException {
        Car c = new Car(4, 3, "SINAbooba", "G100000505", "red");
        Car clone1 = (Car) c.clone();
        Engine e = new Engine(29, "hukihih", "Eojijoi221213", 300, 60);
        Engine clone2 = (Engine) e.clone2();


        System.out.println(clone1);

        System.out.println(clone2);

        clone1.model = new

                String("GIBABOBA");

        clone2.markaMashini = new

                String("oijojo");


        System.out.println(clone1);

        System.out.println(clone2);
    }
}