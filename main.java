public class main
{
    public static void main(String[] args)
    {
        Person Sweeney = new Person("Coach Sweeney", 58, "M");
        System.out.println(Sweeney);

        Student Gretchen = new Student("Gretchen Klees", 17, "F", "62264", 3.7);
        System.out.println(Gretchen);

        Teacher mrSos = new Teacher("Shannon Sos", 36, "M", "Computer Science", 9001);
        System.out.println(mrSos);

        CollegeStudent Rebecca = new CollegeStudent("Rebecca Bradley", 22, "F", "W851802", 4.1, 4, "English");
        System.out.println(Rebecca);
    }
}
