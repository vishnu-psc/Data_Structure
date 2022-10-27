

import java.util.LinkedList;
import java.util.Queue;

public class Graph_Imp 
{
	public int vertices;
	public int[][] adj;
	public int[] visited;
	
	public Graph_Imp(int n)
	{
		vertices = n;
		adj = new int[n][n];
		visited = new int[vertices];
	}
	
	public void insertEdge(int u, int v, int x)
	{
		adj[u][v] = x;	
	}
	
	public void removeEdge(int u, int v)
	{
		adj[u][v] = 0;
	}
	
	public boolean existEdge(int u, int v)
	{
		return adj[u][v] != 0;
	}
	
	public int vertices()
	{
		return vertices;
	}
	
	public int edgeCount()
	{
		int count = 0;
		for(int i =0; i <vertices; i++)
		{
			for(int j =0; j <vertices; j++)
			{
				if(adj[i][j] != 0)
					count++;
			}
		}
		return count;
	}
	
	public void edges()
	{
		System.out.println("Edges");
		for(int i = 0; i < vertices; i++)
		{
			for(int j = 0; j < vertices; j++)
			{
				 if(adj[i][j] != 0)
					 System.out.println(i + "--" + j);
			}
		}
	}
	
	public int outdegree(int u)
	{
		int count = 0;
		for(int j = 0; j < vertices; j++)
		{
			if(adj[u][j] != 0)
				count++;
		}
		return count;
	}
	
	public int indegree(int u)
	{
		int count = 0;
		for(int i = 0; i <vertices; i++)
			if(adj[i][u] != 0)
				count++;
		return count; 
	}
	
	public void display()
	{
		for(int i = 0; i <vertices; i++)
		{
			for(int j = 0; j < vertices; j++)
				System.out.println(adj[i][j] + "\t");
			System.out.println();
		}
	}
	
//	public void BFS(int s)
//	{
//		int i = s;
//		Queue<Integer> q = new LinkedList<>();
//		int[] visited = new int[vertices];
//		System.out.println(i + " ");
//		visited[i] = 1;
//		q.add(i);
//		while(!q.isEmpty())
//		{
//			i = q.remove();
//			for(int j = 0; j < vertices; j++)
//			{
//				if(adj[i][j] == 1 && visited[j] == 0)
//				{
//					System.out.println(j + " ");
//					visited[j] = 1;
//					q.add(j);
//				}
//			}
//		}
//	}
	
	public void DFS(int s)
	{
		if(visited[s] == 0)
		{
			System.out.println(s + " ");
			visited[s] = 1;
			for(int j =0; j < vertices; j++)
			{
				if(adj[s][j] == 1 && visited[j] == 0)
					DFS(j);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Graph_Imp g = new Graph_Imp(5);
		g.insertEdge(0, 3, 1);
		g.insertEdge(0, 4, 1);
		g.insertEdge(2, 3, 1);
		g.insertEdge(4, 3, 1);
		g.insertEdge(4, 4, 1);
		
		g.edges();

	}

}
