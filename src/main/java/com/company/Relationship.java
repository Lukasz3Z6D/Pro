package com.company;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="http://www.gleif.org/data/schema/rr/2016", name="Relationship")

public class Relationship {
    StartNode startNode;

    @XmlElement(namespace="http://www.gleif.org/data/schema/rr/2016",name="StartNode")
    public StartNode getStartNode() { return this.startNode; }
    public void setStartNode(StartNode startNode) { this.startNode=startNode; }
}
