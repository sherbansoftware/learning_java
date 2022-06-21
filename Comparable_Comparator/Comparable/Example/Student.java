package Comparable_Comparator.Comparable.Example;

class Student implements Comparable<Student> {

    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // compare by age
//    public int compareTo(Student st) {
//        if (age == st.age)
//            return 0;
//        else if (age > st.age)
//            return 1;
//        else
//            return -1;
//    }

    // the old way to implement CompareTo method to compare
    // object by multiple fields, you'll learn new way as well
    @Override
    public int compareTo(Student s) {
        int i = this.getName().compareTo(s.getName());
        if (i != 0)
            return i;

        i = Integer.compare(this.getAge(), s.getAge());
        if (i != 0)
            return i;

        return Integer.compare(this.getRollno(), s.getRollno());
    }

}

