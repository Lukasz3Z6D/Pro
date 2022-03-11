package com.company;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="http://www.gleif.org/data/schema/rr/2016", name="RelationshipData")
//@XmlAccessorType(XmlAccessType.FIELD)
public class RelationshipData
{
    RelationshipRecords relationshipRecords1;

    @XmlElement(namespace="http://www.gleif.org/data/schema/rr/2016",name="RelationshipRecords")
    public RelationshipRecords getRelationshipRecords() { return this.relationshipRecords1; }
    public void setRelationshipRecords(RelationshipRecords relationshipRecords1) { this.relationshipRecords1=relationshipRecords1; }

}