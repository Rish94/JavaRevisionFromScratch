


public class Person {

    String name = "Atrangi";
    int age;

    //abb hamne private bna deye jesse koi faltu data na dal paye client ess isue ko solve k eye abb encapsulation aya
    // private String name = "Atrangi";
    // private int age;

    //Non parameterised Constructor
    public Person(){
        this.name = "Motu";
        this.age = 35;
    }

    //Parameterised Constructor
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        }

    public void func(){
        int ad_no = 2651561;
        System.out.println(this.name + " " + this.age + " " + ad_no);
    }
    
}
