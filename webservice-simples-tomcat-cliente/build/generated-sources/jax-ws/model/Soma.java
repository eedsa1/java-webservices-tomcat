
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de soma complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="soma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soma", propOrder = {
    "numero1",
    "numero2"
})
public class Soma {

    protected String numero1;
    protected String numero2;

    /**
     * Obtém o valor da propriedade numero1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero1() {
        return numero1;
    }

    /**
     * Define o valor da propriedade numero1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero1(String value) {
        this.numero1 = value;
    }

    /**
     * Obtém o valor da propriedade numero2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero2() {
        return numero2;
    }

    /**
     * Define o valor da propriedade numero2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero2(String value) {
        this.numero2 = value;
    }

}
