public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

    // Part 3: Queue operations
    public void partThree() {
        System.out.println("Part 3: Queue operations output");

        Employee operator = new Employee("Junyi", 30, "Male", "Operator", 1);
        Ride rollerCoaster = new Ride("Roller Coaster", operator);

        Visitor visitor1 = new Visitor("Xiao", 25, "Female", 101, true);
        Visitor visitor2 = new Visitor("Zhen", 20, "Male", 102, false);
        Visitor visitor3 = new Visitor("Charlie", 35, "Male", 103, false);
        Visitor visitor4 = new Visitor("David", 28, "Male", 104, true);
        Visitor visitor5 = new Visitor("Eve", 22, "Female", 105, false);

        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        rollerCoaster.printQueue();
        rollerCoaster.removeVisitorFromQueue();
        rollerCoaster.printQueue();
    }