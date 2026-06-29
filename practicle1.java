public class Precticle1{
    public static void main(String[] args){
        System.out.println("HELLO WORLD!!!");

        int age = 20;
        double salary = 35000.75;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Rahul";

        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary);
        System.out.println("Grade: " +grade);
        
        int number = 50;
        double result = number;

        System.out.println("implicit type casting");
        System.out.println("integer value: ");
        System.out.println("convertad number: "+result);

        double marks = 89.75;
        int totalMarks = (int) marks;

        System.out.println("Explicit type casting");
        System.out.println("Double value: " +marks);
        System.out.println("converted into integer: "+totalMarks);



    }
}
