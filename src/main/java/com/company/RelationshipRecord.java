package com.company;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="http://www.gleif.org/data/schema/rr/2016", name="RelationshipRecord")
@XmlAccessorType(XmlAccessType.FIELD)
public class RelationshipRecord {
    Relationship relationship1;

    @XmlElement(namespace="http://www.gleif.org/data/schema/rr/2016",name="Relationship")
    public Relationship getRelationship(){ return this.relationship1; }
    public void setRelationship(Relationship relationship1){ this.relationship1=relationship1; }


}
