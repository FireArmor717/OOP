import java.util.*;
public class Ride implements RideInterface{
    private String rideName;
    private Employee operator;
    private Queue<Visitor> visitorQueue;
    private LinkedList<Visitor> rideHistory;

    public Ride(String rideName, Employee operator) {
        this.rideName = rideName;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public String getRideName() { return rideName; }
    public void setRideName(String rideName) { this.rideName = rideName; }

    public Employee getOperator() { return operator; }
    public void setOperator(Employee operator) { this.operator = operator; }

    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println(visitor.getName() + " joined the queue.");
    }

    public void removeVisitorFromQueue() {
        if (!visitorQueue.isEmpty()) {
            Visitor removedVisitor = visitorQueue.poll();
            System.out.println(removedVisitor.getName() + " has left the queue.");
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("No visitors in the queue.");
        } else {
            for (Visitor visitor : visitorQueue) {
                System.out.println(visitor.getName());
            }
        }
    }

    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
    }

    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    public int numberOfVisitors() {
        return rideHistory.size();
    }

    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors have taken the ride.");
        } else {
            for (Visitor visitor : rideHistory) {
                System.out.println(visitor.getName());
            }
        }
    }

    public void runOneCycle() {
        if (operator == null) {
            System.out.println("No operator assigned.");
            return;
        }

        if (visitorQueue.isEmpty()) {
            System.out.println("No visitors in the queue.");
            return;
        }

        int maxRiders = 3;  
        int ridersProcessed = 0;

        while (!visitorQueue.isEmpty() && ridersProcessed < maxRiders) {
            Visitor visitor = visitorQueue.poll(); 
            addVisitorToHistory(visitor);  
            ridersProcessed++;
        }

        System.out.println(ridersProcessed + " visitors completed the ride.");
    }
}
