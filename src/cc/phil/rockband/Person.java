package cc.phil.rockband;

public class Person {
    // Memberconstants
    //
    private final String FIRSTNAME;
    private final String SURNAME;

    // Membervariables
    //
    private int age;

    // Constructor
    //
    public Person(String FIRSTNAME, String SURNAME, int age) {
        this.FIRSTNAME = FIRSTNAME;
        this.SURNAME = SURNAME;
        this.age = age;
    }

    // Methodes
    //
    // Used in Typcasting.java
    //
    public void shopAs(Person person){
        System.out.println("Einkaufen als Person");
    }

    // Getter/Setter
    //
    public String getFIRSTNAME() {return FIRSTNAME;}

    public String getSURNAME() {return SURNAME;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}
}
