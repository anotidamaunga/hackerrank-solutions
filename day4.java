import java.util.Scanner;
public class day4{
    private int age;

    public int Person(int initialAge) {
        // some more code to run some checks on initialAge
        this.age=initialAge;
        return age;
    }

    public void amIOld() {
        //  code determining if this person's age is old and prints the correct statement:
        if(this.age<0)
        { System.out.println("Age is not valid, setting age to 0.");
            this.age=0;
            amIOld();
        }
        else if(this.age<13)
            System.out.println("You are young.");
        else if(this.age<18)
            System.out.println("You are a teenager.");
        else if(this.age>=18)
            System.out.println("You are old.");
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age+=1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }

            System.out.println();
        }

    }

