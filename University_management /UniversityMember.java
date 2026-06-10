abstract class UniversityMember {
    protected int memberId;
    protected String name;

    public UniversityMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void displayBasicInfo() {
        System.out.println("ID: " + memberId + ", Name: " + name);
    }

    // Abstract method
    public abstract void performDuty();
}
