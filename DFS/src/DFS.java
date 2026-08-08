import java.util.*;

public class DFS {

    private final Map<String, List<String>> graph = new HashMap<>();

    public void addEdge(String u,String v){
        graph.computeIfAbsent(u,key->new ArrayList<>()).add(v);
        graph.computeIfAbsent(v,key->new ArrayList<>()).add(u);
    }

    public void bfs(String start){
        Deque<String> stack = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();

        stack.push(start);
        visited.add(start);

        while(!start.isEmpty()){
            String current = stack.pop();
            System.out.println(current+" ");

            for(String neighbor: graph.get(current)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }

    }

}
