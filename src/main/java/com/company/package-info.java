@XmlSchema(
        //namespace = "http://www.example.org/abc",
        xmlns = {
                @XmlNs(prefix = "gleif", namespaceURI ="http://www.gleif.org/concatenated-file/header-extension/2.0"),
                @XmlNs(prefix = "rr", namespaceURI = "http://www.gleif.org/data/schema/rr/2016")
        },
        elementFormDefault = XmlNsForm.QUALIFIED)
    package com.company;

import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlNsForm;
import jakarta.xml.bind.annotation.XmlSchema;