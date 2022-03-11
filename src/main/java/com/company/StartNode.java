package com.company;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(namespace="http://www.gleif.org/data/schema/rr/2016")
public class StartNode
{
    String NodeID;
    String NodeIDType;


    @XmlElement(namespace="http://www.gleif.org/data/schema/rr/2016",name="NodeID")
    public String getNodeID() { return this.NodeID; }
    public void setNodeID(String NodeID) { this.NodeID=NodeID; }

    @XmlElement(namespace="http://www.gleif.org/data/schema/rr/2016",name="NodeIDType")
    public String getNodeIDType() { return this.NodeIDType; }
    public void setNodeIDType(String NodeIDType) { this.NodeIDType=NodeIDType; }

}






