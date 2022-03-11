package com.company;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(namespace="http://www.gleif.org/data/schema/rr/2016", name="EndNode")
public class EndNode
{
    String NodeID;
    String NodeIDType;


    @XmlElement(namespace="http://www.gleif.org/data/schema/rr/2016")
    public String getNodeID() {
        return this.NodeID;
    }
    public void setNodeID(String NodeID) {
        this.NodeID=NodeID;
    }

    @XmlElement(namespace="http://www.gleif.org/data/schema/rr/2016")
    public String getNodeIDType() {
        return this.NodeIDType;
    }
    public void setNodeIDType(String NodeIDType) {
        this.NodeIDType=NodeIDType;
    }

}






