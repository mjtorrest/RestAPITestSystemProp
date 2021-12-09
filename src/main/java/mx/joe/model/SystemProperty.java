package mx.joe.model;

import java.io.Serializable;

public class SystemProperty  implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	private String name;
	private boolean value;
	
	public SystemProperty() {super();}

	public SystemProperty(String name, boolean value) {
		super();
		this.name = name;
		this.value = value;
	}

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
