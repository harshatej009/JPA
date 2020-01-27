package harsh.rane.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ELEMENT",schema="cidb")
public class Element {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ELEMENT_ID")
	int ELEMENT_ID;
	@Column(name="element_source_name")
	String element_source_name;
	@Column(name="element_ctgy_name")
	String ELEMENT_CTGY_NAME;
	public int getELEMENT_ID() {
		return ELEMENT_ID;
	}
	public void setELEMENT_ID(int eLEMENT_ID) {
		ELEMENT_ID = eLEMENT_ID;
	}
	public String getElement_source_name() {
		return element_source_name;
	}
	public void setElement_source_name(String element_source_name) {
		this.element_source_name = element_source_name;
	}
	public String getELEMENT_CTGY_NAME() {
		return ELEMENT_CTGY_NAME;
	}
	public void setELEMENT_CTGY_NAME(String eLEMENT_CTGY_NAME) {
		ELEMENT_CTGY_NAME = eLEMENT_CTGY_NAME;
	}
	@Override
	public String toString() {
		return "Element [ELEMENT_ID=" + ELEMENT_ID + ", element_source_name=" + element_source_name
				+ ", ELEMENT_CTGY_NAME=" + ELEMENT_CTGY_NAME + "]";
	}
	
	
	
}
