class AcademicStaff extends Employee {
    protected String department;

    public AcademicStaff(int memberId, String name, double salary, String department) {
        super(memberId, name, salary);
        this.department = department;
    }

    public void showDepartment() {
        System.out.println("Department: " + department);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " teaches and supports academic activities.");
    }
}
