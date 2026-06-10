class AdministrativeOfficer extends Employee {
    private String role;

    public AdministrativeOfficer(int memberId, String name, double salary, String role) {
        super(memberId, name, salary);
        this.role = role;
    }

    public void showRole() {
        System.out.println("Role: " + role);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " manages administrative tasks.");
    }
}
