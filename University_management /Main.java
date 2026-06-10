import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<UniversityMember> members = new ArrayList<>();

        // Sample Data
        members.add(new Professor(1, "Dr. Rahman", 90000, "CSE", "AI", 25));
        members.add(new AdministrativeOfficer(2, "Mr. Karim", 50000, "HR Manager"));

        // Dynamic Binding
        System.out.println("=== Performing Duties ===");
        for (UniversityMember member : members) {
            member.displayBasicInfo();
            member.performDuty();  // Runtime Polymorphism
            System.out.println();
        }

        // Downcasting
        System.out.println("=== Professor Research Info ===");
        for (UniversityMember member : members) {
            if (member instanceof Professor) {
                Professor p = (Professor) member;
                p.showResearchProfile();
                System.out.println();
            }
        }
    }
}
