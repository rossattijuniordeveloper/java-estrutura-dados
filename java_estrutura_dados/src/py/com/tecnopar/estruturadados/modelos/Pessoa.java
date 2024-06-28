package py.com.tecnopar.estruturadados.modelos;

import java.util.Objects;

public class Pessoa {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pessoa(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Pessoa() {
		super();
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return id == other.id;
	}

}
