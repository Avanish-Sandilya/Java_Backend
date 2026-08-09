import java.util.*;

public class BFS {
    private final Map<String, List<String>> graph = new HashMap<>();

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
            System.out.print(current+" ");

            for(String n:graph.get(current)){
                if(!visited.contains(n)){
                    visited.add(n);
                    queue.offer(n);
                }
            }

        }


    }

}
