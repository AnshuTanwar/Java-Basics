public class oops{
     public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        
        Students s1 = new Students();
        s1.name = "Anshu";
        s1.roll = 435;
        s1.password = " co8uh4e";

        Students s2 = new Students(s1);
        s2.password = "324442f";
        
    }
}

class Students{
    String name;
    int roll;
    String password;

    //copy constructor 
    Students(Students s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Students(String name){
        this.name = name; //parametrized constructor
    }
    Students() {
        System.out.println("constructor is called...");
    }
    Students(int roll){
        this.roll=roll;
    }
}

class Pen{
    String color;
    int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip; 
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int mth){
        percentage = (phy+chem+mth) / 3;
    }
}