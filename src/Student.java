import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private static int id=1;
    private int id_gen;
    private List<Integer> grades;

    public Student(String name,String surname, int age,boolean gender){
        super(name,surname,age,gender);
        this.id_gen=id++;
        this.grades = new ArrayList<>();
    }

    public void AddGrade(int grade){
        if (grade>0 && grade<100){
            grades.add(grade);
        }
        else{
            System.out.println("Incorrect value "+grade);
        }
    }

    public double CalculateGPA(){
        if (grades.isEmpty()){
            return 0;
        }
        int sum=0;
        for (int grade : grades){
            sum+=grade;
        }
        return sum/(double) grades.size();
    }

    @Override
    public String toString() {
        return "I am student with ID "+id_gen;
    }
}
