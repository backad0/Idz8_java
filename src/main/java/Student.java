public class Student extends Human{
    private String faculty;

    public Student() {
        super("", "", "", 1);
        this.faculty = "";
    }
    public Student(String surname, String name, String patronymic, int age, String faculty) {
        super(surname, name, patronymic, age);
        this.faculty = faculty;
    }

    public Student(Human human, String faculty){
        super(human.getSurname(), human.getName(), human.getPatronymic(), human.getAge());
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
