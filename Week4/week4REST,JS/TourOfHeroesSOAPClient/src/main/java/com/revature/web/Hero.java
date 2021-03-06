
package com.revature.web;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hero complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="healthLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialMove" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hero", propOrder = {
    "alive",
    "healthLevel",
    "name",
    "specialMove"
})
public class Hero {

    protected boolean alive;
    protected int healthLevel;
    protected String name;
    @XmlElement(nillable = true)
    protected List<String> specialMove;

    /**
     * Gets the value of the alive property.
     * 
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Sets the value of the alive property.
     * 
     */
    public void setAlive(boolean value) {
        this.alive = value;
    }

    /**
     * Gets the value of the healthLevel property.
     * 
     */
    public int getHealthLevel() {
        return healthLevel;
    }

    /**
     * Sets the value of the healthLevel property.
     * 
     */
    public void setHealthLevel(int value) {
        this.healthLevel = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the specialMove property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialMove property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialMove().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialMove() {
        if (specialMove == null) {
            specialMove = new ArrayList<String>();
        }
        return this.specialMove;
    }

}
