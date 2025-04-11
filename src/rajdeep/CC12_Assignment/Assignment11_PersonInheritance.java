package rajdeep.CC12_Assignment;

class Person{
    String name;
    String address;
    Person(String name,String address){
        this.name=name;
        this.address=address;
    }
    void setPerson(String name,String address){
        this.name=name;
        this.address=address;
    }
    String toString1(){
        return "Person[name="+name+",address: "+address+"]";
    }
}
class Student extends Person{
    String program;
    String year;
    double fee;
    Student(String name,String address,String program,String year,double fee){
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    void setStudent( String name,String address,String program,String year,double fee){
        super.setPerson(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    String toString1(){
        return "Person-Student[Person[name="+name+",address: "+address+"],program: "+program+",year: "+year+",fee: "+fee+"]";
    }
}

class Staff extends Person{
    String school;
    double pay;
    Staff(String name,String address,String school,double pay){
        super(name,address);
        this.school=school;
        this.pay=pay;
    }
    void setStaff(String name,String address,String school,double pay){
        super.setPerson(name,address);
        this.school=school;
        this.pay=pay;
    }
    String toString1(){
        return "Person-Staff[Person[name="+name+",address: "+address+"],school: "+school+",pay: "+pay+"]";
    }
}
public class Assignment11_PersonInheritance {
    public static void main(String[] args) {
        Person p = new Person("Rajdeep","Kolkata");
        System.out.println(p.toString1());
        p.setPerson("Rajdeep","Delhi");
        System.out.println(p.toString1());
        p.setPerson("Anirudha","Delhi");
        System.out.println(p.toString1());


        Student s = new Student("Rajdeep","Kolkata","CSE","2020",10000);
        System.out.println(s.toString1());
        s.setStudent("Rajdeep","Delhi","CSE","2020",10000);
        System.out.println(s.toString1());
        s.setStudent("Anirudha","Delhi","CSE","2020",10000);
        System.out.println(s.toString1());


        Staff st = new Staff("Rajdeep","Kolkata","KIIT",10000);
        System.out.println(st.toString1());
        st.setStaff("Rajdeep","Delhi","KIIT",10000);
        System.out.println(st.toString1());
        st.setStaff("Anirudha","Delhi","KIIT",10000);
        System.out.println(st.toString1());
        st.setStaff("Anirudha","Delhi","NIT",10000);
        System.out.println(st.toString1());

    }
}
