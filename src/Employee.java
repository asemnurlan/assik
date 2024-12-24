public class Employee {
    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private double salary;
    private String position;

    public Employee(){
        id_gen=id++;
    }

    public Employee(String name, String surname, int age, boolean gender, double salary, String position ){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
        this.position=position;

    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public boolean getGender(){
        return gender;
    }
    public void setGender(boolean gender){
        this.gender=gender;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }

    @Override
    public String toString() {
        return "Employee id: " + id_gen +
                "\nFull name: " + name + " " + surname +
                "\nAge: " + age +
                "\nGender: " + (gender ? "male" : "female") +
                "\nSalary: " + salary+
                "\nPosition: " + position;
    }
}
