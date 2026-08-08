import java.util.*;

public class Bfs {
    private final Map<String,List<String>> graph = new HashMap<>();

    public void addEdge(String u,String v){
        graph.computeIfAbsent(u,key->new ArrayList<>()).add(v);
        graph.computeIfAbsent(v,key->new ArrayList<>()).add(u);
    }

    public void bfs(String start){
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);

        while(!queue.isEmpty()){
            String current = queue.poll();
            System.out.println(current+" ");

            for(String neighbor:graph.get(current)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }

}
