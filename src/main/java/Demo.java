import org.joda.time.DateTime;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        DateTime startDate = new DateTime(2015, 9, 2, 9, 0);
        DateTime endDate = new DateTime(2019, 6, 15, 14, 0);

        Course csit = new Course("CSIT", startDate, endDate);
        Course eng = new Course("ENG", startDate, endDate);
        Course sci = new Course("SCI", startDate, endDate);

        Student john = new Student("John Smyth", 22, "08/01/1996", "16355176", csit);
        Student mary = new Student("Mary Joe", 19, "22/08/1999", "1633372", csit);
        Student brian = new Student("Brian Griffin", 19, "19/05/1999", "17833241", eng);
        Student emily = new Student("Emily Green", 20, "14/04/1998", "15671278", eng);
        Student paul = new Student("Paul White", 25, "01/01/1993", "1234232", sci);
        Student ray = new Student("Ray Aherne", 22, "09/03/1996", "16377171", sci);

        ArrayList<Student> csitStudents = new ArrayList<Student>();
        csitStudents.add(john);
        csitStudents.add(mary);

        csit.setStudents(csitStudents);

        ArrayList<Student> engStudents = new ArrayList<Student>();
        engStudents.add(brian);
        engStudents.add(emily);

        eng.setStudents(engStudents);

        ArrayList<Student> sciStudents = new ArrayList<Student>();
        sciStudents.add(paul);
        sciStudents.add(ray);

        sci.setStudents(sciStudents);

        Module ma180 = new Module("Mathematics", "MA180");
        Module ee123 = new Module("Electronic Engineering", "EE123");
        Module cs410 = new Module("Operating Systems", "CS410");
        Module ct417 = new Module("Machine Learning", "CT417");
        Module ct475 = new Module("Software Engineering 3", "CT475");
        Module ma310 = new Module("Differential Forms", "MA310");

        ArrayList<Module> csMods = new ArrayList<Module>();
        csMods.add(ma180);
        csMods.add(cs410);
        csMods.add(ct417);

        john.setModules(csMods);
        mary.setModules(csMods);

        csit.setModules(csMods);

        ArrayList<Module> sciMods = new ArrayList<Module>();
        sciMods.add(ma180);
        sciMods.add(ee123);
        sciMods.add(ct475);

        brian.setModules(sciMods);
        emily.setModules(sciMods);

        sci.setModules(sciMods);


        ArrayList<Module> engMods = new ArrayList<Module>();
        engMods.add(ma310);
        engMods.add(ma180);
        engMods.add(ct417);

        paul.setModules(engMods);
        ray.setModules(engMods);

        eng.setModules(engMods);

        Course[] courses = {csit, sci, eng};
        Student[] students = {john, mary, brian, emily, paul, ray};

        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i].getName());
            for (Module m : courses[i].getModules()) {
                System.out.println(m.getName());
            }
            for (Student s : courses[i].getStudents()) {
                System.out.println(s.getName());
            }
        }

        for (int j = 0; j < students.length; j++) {
            System.out.println(students[j].getName() + "\n" + students[j].getUsername() + "\n" + students[j].getCourse().getName());

            for (Module m : students[j].getModules()) {
                System.out.println(m.getName());
            }
        }
    }
}
