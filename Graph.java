/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *and open the template in the editor.
*/
import java.util.ArrayList;
/**
 *
 * @author admin
 */
public class Graph {
    
    private ArrayList<Vertex>vértices;
    private boolean isWeighted;
    private boolean IsDirected;
    
    public Graph(boolean isWeighted, boolean IsDirected) {
        this.vértices = new ArrayList<Vertex>();
        this. isWeighted = isWeighted;
        this. IsDirected = IsDirected;
    }
   
   public Vertex addVAertex(String data) {
       Vertex newVertex = new Vertex (data);
       this.vértices.add(newVertex);
       return newVertex;
   }
   
   public void addEdge (Vertex vertex1,Vertex vertex2,Integer weight) {
       if (!this.isWeighted){
           weight = null;
       }
       vertex1.addEdge(vertex2, weight);
       if(!this.IsDirected){
           vertex2. addEdge (vertex1, weight);
       }
       
   }
   public void removeEdge (Vertex vertec1, Vertex vertex2){
       vertex1.removeEdge(vertex2);
       
       if (!this.IsDirected){
           vertex2.removeEdge(vertex1);
           
       }
    }  
   public void removeVertex(Vertex vertex){
       this.vértices.remove(vertex);
       
   }
   public ArrayList<Vertex>getVerticas(){
       return this.vértices;
   
   }}
   
    
   
