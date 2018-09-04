/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posist.NodeFiles;

import java.util.ArrayList;
import posist.SHA;

/**
 *
 * @author Student
 */
public class Node {
    private long timestamp;
    private static String nodeNumber;
    private String nodeID;
    private Node referenceNodeID;
    private ArrayList<Node> childReferenceID;
    
    private String ownerName;
    private String HashValue;
    private String ownerID;
    private float value;
    
    private static Node genesisReferenceID;
    private final long timeStamp;
    
    public ArrayList<Node> getChildReferenceID() {
        return childReferenceID;
    }
  
    public float getValue() {
        return value;
    }
    
    public Node(String ownerID, String ownerName,float value, Node parent){
        nodeNumber = nodeNumber+1;
        timeStamp = System.currentTimeMillis();
        this.ownerID= ownerID;
        this.ownerName = ownerName;
        this.value  = value;
        this.referenceNodeID = parent; 
        setParentChildNode(referenceNodeID);
        
    }
    
    public String calculateHash() {
	String calculatedhash = SHA.applySha256( 
			ownerID +
			Float.toString(value) +
			ownerName
			);
	return calculatedhash;
    }
   public static void setGenesisNode(Node genesis){
       genesisReferenceID = genesis;
   }
   private void setParentChildNode(Node parent){
       parent.childReferenceID.add(this);
   }
}