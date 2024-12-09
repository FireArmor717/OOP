import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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


    public void exportRideHistory(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getGender() + "," + visitor.getVisitorId() + "," + visitor.isVIP());
                writer.newLine();
            }
            System.out.println("Ride history exported successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("Error exporting ride history: " + e.getMessage());
        }
    }


    public void importRideHistory(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length != 5) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }

                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String gender = data[2];
                int visitorId = Integer.parseInt(data[3]);
                boolean isVIP = Boolean.parseBoolean(data[4]);

                Visitor visitor = new Visitor(name, age, gender, visitorId, isVIP);
                rideHistory.add(visitor);
            }
            System.out.println("Ride history imported successfully from " + fileName);
        } catch (IOException e) {
            System.out.println("Error importing ride history: " + e.getMessage());
        }
    }
    
    public void sortRideHistory(Comparator<Visitor> comparator) {
        Collections.sort(rideHistory, comparator);
        System.out.println("Ride history sorted.");
    }
}
