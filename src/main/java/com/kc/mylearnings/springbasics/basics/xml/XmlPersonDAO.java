package com.kc.mylearnings.springbasics.basics.xml;

public class XmlPersonDAO {

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    XmlJdbcConnection xmlJdbcConnection;

}
