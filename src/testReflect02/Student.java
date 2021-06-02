package testReflect02;

public class Student extends Person{
    private String sex;
    double height;
    protected double weight;
    public int sid;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Student() {
    }

    public Student(int age, String name, String sex, double height, double weight, int sid) {
        super(age, name);
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.sid = sid;
    }

    private Student(int age, String name, String sex, double height) {
        super(age, name);
        this.sex = sex;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sex='" + sex + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", sid=" + sid +
                '}';
    }
    private void a(){

    }
        public void b(int a, double c, String b){
            System.out.println(a+b+c);
        }
}
