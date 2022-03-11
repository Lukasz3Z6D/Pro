
package com.company;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;


public class DbJAXB {

    public static void marshall(String fileName) throws JAXBException {
        try{

            //Initialize the employees list
            RelationshipData employees = new RelationshipData();

            JAXBContext jaxbContext = JAXBContext.newInstance(RelationshipData.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //Marshal the employees list in console
            jaxbMarshaller.marshal(employees, System.out);

            //Marshal the employees list in file
            jaxbMarshaller.marshal(employees, new File(".\\dba.xml"));

        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void unmarshall(String fileName) throws JAXBException {
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(RelationshipData.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            RelationshipData emps = (RelationshipData) jaxbUnmarshaller.unmarshal( new File(fileName) );

            for(Relationship emp : emps.getRelationshipRecords().getRelationships()){
                System.out.println(emp.getStartNode().getNodeID());
                System.out.println(emp.getStartNode().getNodeIDType());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

