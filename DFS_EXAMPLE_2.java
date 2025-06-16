package xyz;
import java.util.*;

class SocialNetwork {
    private Map<String, List<String>> friendships = new HashMap<>();

    void addFriendship(String person1, String person2) {
        friendships.putIfAbsent(person1, new ArrayList<>());
        friendships.putIfAbsent(person2, new ArrayList<>());
        friendships.get(person1).add(person2);
        friendships.get(person2).add(person1); 
    }

    void findSocialCircle(String startPerson, Set<String> visited) {
        if (visited.contains(startPerson)) return; 

        System.out.print(startPerson + " ");
        visited.add(startPerson);

        for (String friend : friendships.getOrDefault(startPerson, new ArrayList<>())) {
            findSocialCircle(friend, visited); 
        }
    }
}

public class DFS_EXAMPLE_2 {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();
        network.addFriendship("Alice", "Bob");
        network.addFriendship("Bob", "Charlie");
        network.addFriendship("Charlie", "David");
        network.addFriendship("Eve", "Frank");

        Set<String> visited = new HashSet<>();
        System.out.println("Social Circle of Bob:");
        network.findSocialCircle("Bob", visited);
    }
}
