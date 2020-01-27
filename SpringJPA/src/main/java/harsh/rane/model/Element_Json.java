package harsh.rane.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;


@Entity
@Table(name="ELEMENT_JSON",schema="cidb")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Element_Json {
	
	@Id
	@Column(name="element_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int elementId;
	@Column(name="element_name")
	private String element_Name;
	@Column(name="element_desc")
	private String element_Desc;
	@Type(type = "jsonb")
    @Column(name="products",columnDefinition = "jsonb")
	private Products products;
	
	
	public int getElementId() {
		return elementId;
	}
	public void setElementId(int elementId) {
		this.elementId = elementId;
	}
	public String getElement_Name() {
		return element_Name;
	}
	public void setElement_Name(String element_Name) {
		this.element_Name = element_Name;
	}
	public String getElement_Desc() {
		return element_Desc;
	}
	public void setElement_Desc(String element_Desc) {
		this.element_Desc = element_Desc;
	}
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Element_Json [elementId=" + elementId + ", element_Name=" + element_Name + ", element_Desc="
				+ element_Desc + ", products=" + products + "]";
	}
	

}
