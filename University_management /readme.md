REPORT.md

1. Abstract Class Usage

The abstract class "UniversityMember" serves as the base class for all personnel. It defines common attributes such as "memberId" and "name", and enforces implementation of the abstract method "performDuty()" in all subclasses.

---

2. Multilevel Inheritance

The system follows a multilevel inheritance structure:

UniversityMember → Employee → AcademicStaff → Professor

Each subclass extends functionality:

- "Employee" adds salary
- "AcademicStaff" adds department
- "Professor" adds research-related data

---

3. Dynamic Binding (Runtime Polymorphism)

Dynamic binding occurs in the "Main" class where an "ArrayList<UniversityMember>" stores different types of objects. The method "performDuty()" is called using a superclass reference, but the correct subclass method executes at runtime.

---

4. Downcasting

Downcasting is used to access Professor-specific methods such as "showResearchProfile()". Since this method is not available in the superclass, we safely cast using:

if(member instanceof Professor)

---

5. Future Extensibility

The system is easily extendable. New employee types like "LabEngineer", "Accountant", or "SystemAdmin" can be added by extending "Employee". The design promotes reusability and scalability.
