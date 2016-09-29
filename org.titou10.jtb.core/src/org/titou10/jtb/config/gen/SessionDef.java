
package org.titou10.jtb.config.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.titou10.jtb.util.jaxb.EncryptedStringXmlAdapter;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationFilter" type="{}destinationFilter" minOccurs="0"/>
 *         &lt;element name="host2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="host3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{}properties"/>
 *       &lt;/sequence>
 *       &lt;attribute name="qManagerDef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="folder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder = { "host", "port", "userid", "password", "destinationFilter", "host2", "port2", "host3", "port3",
                       "properties" })
@XmlRootElement(name = "sessionDef")
public class SessionDef {

   @XmlElement(required = true)
   protected String            host;
   protected int               port;
   @XmlElement(required = true)
   protected String            userid;
   protected DestinationFilter destinationFilter;
   protected String            host2;
   protected Integer           port2;
   protected String            host3;
   protected Integer           port3;
   @XmlElement(required = true)
   protected Properties        properties;
   @XmlAttribute(name = "qManagerDef")
   protected String            qManagerDef;
   @XmlAttribute(name = "name")
   protected String            name;
   @XmlAttribute(name = "folder")
   protected String            folder;

   @XmlJavaTypeAdapter(EncryptedStringXmlAdapter.class)
   protected String            password;

   /**
    * Gets the value of the host property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getHost() {
      return host;
   }

   /**
    * Sets the value of the host property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setHost(String value) {
      this.host = value;
   }

   /**
    * Gets the value of the port property.
    * 
    */
   public int getPort() {
      return port;
   }

   /**
    * Sets the value of the port property.
    * 
    */
   public void setPort(int value) {
      this.port = value;
   }

   /**
    * Gets the value of the userid property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getUserid() {
      return userid;
   }

   /**
    * Sets the value of the userid property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setUserid(String value) {
      this.userid = value;
   }

   /**
    * Gets the value of the password property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getPassword() {
      return password;
   }

   /**
    * Sets the value of the password property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setPassword(String value) {
      this.password = value;
   }

   /**
    * Gets the value of the destinationFilter property.
    * 
    * @return possible object is {@link DestinationFilter }
    * 
    */
   public DestinationFilter getDestinationFilter() {
      return destinationFilter;
   }

   /**
    * Sets the value of the destinationFilter property.
    * 
    * @param value
    *           allowed object is {@link DestinationFilter }
    * 
    */
   public void setDestinationFilter(DestinationFilter value) {
      this.destinationFilter = value;
   }

   /**
    * Gets the value of the host2 property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getHost2() {
      return host2;
   }

   /**
    * Sets the value of the host2 property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setHost2(String value) {
      this.host2 = value;
   }

   /**
    * Gets the value of the port2 property.
    * 
    * @return possible object is {@link Integer }
    * 
    */
   public Integer getPort2() {
      return port2;
   }

   /**
    * Sets the value of the port2 property.
    * 
    * @param value
    *           allowed object is {@link Integer }
    * 
    */
   public void setPort2(Integer value) {
      this.port2 = value;
   }

   /**
    * Gets the value of the host3 property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getHost3() {
      return host3;
   }

   /**
    * Sets the value of the host3 property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setHost3(String value) {
      this.host3 = value;
   }

   /**
    * Gets the value of the port3 property.
    * 
    * @return possible object is {@link Integer }
    * 
    */
   public Integer getPort3() {
      return port3;
   }

   /**
    * Sets the value of the port3 property.
    * 
    * @param value
    *           allowed object is {@link Integer }
    * 
    */
   public void setPort3(Integer value) {
      this.port3 = value;
   }

   /**
    * Gets the value of the properties property.
    * 
    * @return possible object is {@link Properties }
    * 
    */
   public Properties getProperties() {
      return properties;
   }

   /**
    * Sets the value of the properties property.
    * 
    * @param value
    *           allowed object is {@link Properties }
    * 
    */
   public void setProperties(Properties value) {
      this.properties = value;
   }

   /**
    * Gets the value of the qManagerDef property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getQManagerDef() {
      return qManagerDef;
   }

   /**
    * Sets the value of the qManagerDef property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setQManagerDef(String value) {
      this.qManagerDef = value;
   }

   /**
    * Gets the value of the name property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getName() {
      return name;
   }

   /**
    * Sets the value of the name property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setName(String value) {
      this.name = value;
   }

   /**
    * Gets the value of the folder property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getFolder() {
      return folder;
   }

   /**
    * Sets the value of the folder property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setFolder(String value) {
      this.folder = value;
   }

}
