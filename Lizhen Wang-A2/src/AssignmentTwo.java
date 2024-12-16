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

    // Part 4A: Use LinkedList to store Ride history
    public void partFourA() {
        System.out.println("Part 4A: Use LinkedList to store Ride history output");

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
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);

        rollerCoaster.printRideHistory();
        System.out.println("Visitor in history: " + rollerCoaster.checkVisitorFromHistory(visitor1));
    }
    // Part 4B: Sorting Ride history output
    public void partFourB() {
        System.out.println("Part 4B: Sorting Ride history output");

        Employee operator = new Employee("Junyi", 30, "Male", "Operator", 1);
        Ride rollerCoaster = new Ride("Roller Coaster", operator);

        Visitor visitor1 = new Visitor("Xiao", 25, "Female", 101, true);
        Visitor visitor2 = new Visitor("Zhen", 20, "Male", 102, false);
        Visitor visitor3 = new Visitor("Charlie", 35, "Male", 103, false);
        Visitor visitor4 = new Visitor("David", 28, "Male", 104, true);
        Visitor visitor5 = new Visitor("Eve", 22, "Female", 105, false);

        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        System.out.println("Before Sorting:");
        rollerCoaster.printRideHistory();

        VisitorComparator comparator = new VisitorComparator();
        rollerCoaster.sortRideHistory(comparator);

        System.out.println("After Sorting:");
        rollerCoaster.printRideHistory();
    }
    

    // Part 5: Run a cycle for Ride
    public void partFive() {
        System.out.println("Part 5: Run Ride cycle output");

        Employee operator = new Employee("Junyi", 30, "Male", "Operator", 1);
        Ride rollerCoaster = new Ride("Roller Coaster", operator);

        Visitor visitor1 = new Visitor("Xiao", 25, "Female", 101, true);
        Visitor visitor2 = new Visitor("Zhen", 20, "Male", 102, false);
        Visitor visitor3 = new Visitor("Charlie", 35, "Male", 103, false);
        Visitor visitor4 = new Visitor("David", 28, "Male", 104, true);
        Visitor visitor5 = new Visitor("Eve", 22, "Female", 105, false);
        Visitor visitor6 = new Visitor("Frank", 30, "Male", 106, true);
        Visitor visitor7 = new Visitor("Grace", 24, "Female", 107, false);
        Visitor visitor8 = new Visitor("Hannah", 21, "Female", 108, true);
        Visitor visitor9 = new Visitor("Ivy", 26, "Female", 109, false);
        Visitor visitor10 = new Visitor("Jack", 27, "Male", 110, true);

        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        rollerCoaster.addVisitorToQueue(visitor6);
        rollerCoaster.addVisitorToQueue(visitor7);
        rollerCoaster.addVisitorToQueue(visitor8);
        rollerCoaster.addVisitorToQueue(visitor9);
        rollerCoaster.addVisitorToQueue(visitor10);

        rollerCoaster.printQueue();
        rollerCoaster.runOneCycle();
        rollerCoaster.printQueue();
        rollerCoaster.printRideHistory();
    }

    // Part 6: Write to file
    public void partSix() {
        System.out.println("Part 6: Writing to file output");

        Employee operator = new Employee("Junyi", 30, "Male", "Operator", 1);
        Ride rollerCoaster = new Ride("Roller Coaster", operator);

        Visitor visitor1 = new Visitor("Xiao", 25, "Female", 101, true);
        Visitor visitor2 = new Visitor("Zhen", 20, "Male", 102, false);
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);

        rollerCoaster.exportRideHistory("ride_history.csv");
    }

    // Part 7: Read from file
    public void partSeven() {
        System.out.println("Part 7: Reading from file output");

        Employee operator = new Employee("Junyi", 30, "Male", "Operator", 1);
        Ride rollerCoaster = new Ride("Roller Coaster", operator);

        rollerCoaster.importRideHistory("ride_history.csv");
        rollerCoaster.printRideHistory();
    }
}