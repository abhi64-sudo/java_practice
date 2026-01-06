

// object oriented programming concepts--------------------------------------------------

//class main {
//    public static void main(String[] args){
//        class Animal
//        {
//            void eat(){
//                System.out.println("eating");
//            }
//
//            void run(){
//                System.out.println(" hjbsj");
//            }
//        }
//         Animal ani =new Animal();
//        ani.eat();
//        ani.run();
//    }
//}
//class main {
//    class Student {
//        String name;
//        int roll_no;
//
//        void display() {
//            System.out.println(name);
//            System.out.println(roll_no);
//        }
//    }
//    public void main(String[] args){
//        Student s = new Student();
//        s.name = "abhoi";
//        s.roll_no= 23;
//        s.display();
//    }
//}
//    class calculater {
//    void add( int a, int b){
//        System.out.println(a+b);
//    }
//    void sub( int a , int b){
//        System.out.println(a-b);
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        calculater c = new calculater();
//        c.add(2,3);
//        c.sub(4, 2);
//    }
//
//}
//  class rectangle {
//    void area( int len , int bre){
//        System.out.println(len*bre);
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        rectangle re = new rectangle();
//        re.area(2,3);
//    }
//}
//ss employee {
//int id;
//int salary;
//void displaydetial(){
//
//    System.out.println( " id : " + id);
//    System.out.println(" salary: "+salary);
//}
//
//}
//public class Main {
//    public static void main(String[] args) {
//
//        employee emp = new employee();
//        emp.id = 1;
//        emp.salary=120000;
//
//        emp.displaydetial();
//
//        employee emp1 = new employee();
//        emp1.id = 2;
//        emp1.salary=203033;
//        emp1.displaydetial();
//    }
//}
//class interst{
//    int p;
//    int r;
//    int t;
//    void calculateSI( int p, int r, int t){
//         int SI = (p * r * t)/100;
//        System.out.println(SI);
//    }
//}
//public  class Main {
//    public  static void main(String[] args){
//        interst in = new interst();
//        in.calculateSI(1000,5,3);
//    }
//
//}
//class Marks{
//    int math;
//    int eng;
//    int hindi;
//    int average;
//     void calculateAverage(){
//        average = (math+eng+hindi)/3;
//        System.out.println(average);
//        System.out.println(math);
//         System.out.println(eng);
//         System.out.println(hindi);
//     }
//}
//public class Main {
//    public static void main(String[] args){
//        Marks m = new Marks();
//        m.math=20;
//        m.hindi=90;
//        m.eng=34;
//        m.calculateAverage();
//    }
//}

//constructor-------------------
//class student {
//    student(){
//        System.out.println("hey i am constroctor");
//    }
//}
//public class Main {
//
//
//    public static void main(String[] args) {
//        new student();// this is a constructor
//    }
//}
//class car{
//    String brand;
//    double price;
//    car(){
//
//        System.out.println("car object created");
//    }
//
//}
//public class Main {
//    public static void main(String[] args){
//        car c = new car();
//        student s = new student();
//        student s1 = new student();
//
//    }
//}
// class student{
//    student(){
//        System.out.println("hey");
//    }
//
//class employee{
//    int id;
//    String name;
//    employee(int a , String b){
//        id = a;
//        name = b;
//          System.out.println("id is "+a);
//        System.out.println("name is "+b);
//
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        employee e = new em


// method overloading --------------------


//class boy{
//    void m(int a , int b , int c){
//        int sum = a+b+c;
//         System.out.println(sum);
//    }
//    void m(double A, double B){
//           double sub = A - B;
//           System.out.println(sub);
//    }
//}
//public class Main {
//    public static void main(String[] args){
//            boy b = new boy();
//            b.m(2,3,5);
//            b.m(7,4);
//    }
//}



// abstraction-----------------------------

//
//
//
//
//
//
//
//
//abstract class shape {
//   abstract void calculateArea();
//}
//class circle extends shape{
//    double radius;
//    circle(double radius){
//        this.radius=radius;
//
//    }
//
//    @Override
//    void calculateArea() {
//        double area = Math.PI * radius*radius;
//        System.out.println(area);
//    }
//}
//class rectangle extends shape{
//    double length , width;
//    rectangle (double length , double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    @Override
//    void calculateArea() {
//        double area = length*width;
//        System.out.println(area);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        shape c = new circle(5);
//        c.calculateArea();
//
//        shape r = new rectangle(3 ,4);
//        r.calculateArea();
//    }
//}

//abstract class bank{
//    abstract double  getintrestrte();
//}
// class sbi extends bank{
//    @Override
//     double getintrestrte(){
//        return  6.0;
//    }
// }
// class hdfc extends bank {
//    @Override
//     double getintrestrte(){
//        return  5.6;
//    }
// }
//
//
// public class Main{
//    public  static  void main(String[] args){
//        bank s = new sbi();
//        System.out.println(s.getintrestrte());
//        bank h = new hdfc();
//       System.out.println( h.getintrestrte());}
// }
//


//employee salary calculation -----------------
 
 abstract class employee{
    abstract int calculatesalary();
 }
  class fulltimeemp extends employee {
    int monthlysalary;
    fulltimeemp( int monthlysalary){
        this.monthlysalary= monthlysalary;

    }
    @Override
      int calculatesalary(){
        return monthlysalary;
    }
  }
  class parttime extends employee{
    int hours;
    int hourly;
      parttime( int hours, int hourly) {
         this.hourly = hourly;
         this.hours = hours;
     }
    @Override
      int calculatesalary(){
         return hourly * hours;
    }
  }
  public class Main{
    public static void main(String[] args){
        employee e = new fulltimeemp(4000);
        employee m = new parttime(2,344);
        System.out.println(e.calculatesalary());
        System.out.println(m.calculatesalary());

    }

  }