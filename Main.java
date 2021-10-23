/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[]args) {
    Graph miGrafo = new Graph(True,False);
    miGrafo. addVertex ("Bogota");
    miGrafo. addVertex ("Bucaramanga");
    miGrafo. addVertex ("Medellin");

    Vertex bog = getVertexByValue("Bogota");
    Vertex buc = getVertexByValue("Bucaramanfa");
    Vertex med = getVertexByValue("Medellin");

    miGrafo. addEdge(bog,buc,397);
    miGrafo. addEdge(bog,med,416);
    miGrafo. addEdge(med,buc,392);
    
       System.out.printin(miGrafo.print());
    }
}
   
    