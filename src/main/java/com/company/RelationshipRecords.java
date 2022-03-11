package com.company;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(namespace="http://www.gleif.org/data/schema/rr/2016", name="RelationshipRecords")
@XmlAccessorType(XmlAccessType.FIELD)
public class RelationshipRecords {


    @XmlElement(namespace = "http://www.gleif.org/data/schema/rr/2016",name="Relationship")
    private List<Relationship> relationships;

    public List<Relationship> getRelationships() {
        return this.relationships;
    }

    public void setRelationships(List<Relationship> records) {
        this.relationships= relationships;
    }


}
