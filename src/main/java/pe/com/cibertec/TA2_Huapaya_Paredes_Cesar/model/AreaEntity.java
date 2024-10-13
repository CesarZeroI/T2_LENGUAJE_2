package pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name="tb_area")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AreaEntity {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@Column  (name="area_id", nullable= false )
	private Integer area_id;
	
	@Column (name="nombre_area", nullable= false )
	private String nombre_area;

	public Integer getArea_id() {
		return area_id;
	}

	public void setArea_id(Integer area_id) {
		this.area_id = area_id;
	}

	public String getNombre_area() {
		return nombre_area;
	}

	public void setNombre_area(String nombre_area) {
		this.nombre_area = nombre_area;
	}

	public AreaEntity(Integer area_id, String nombre_area) {
		super();
		this.area_id = area_id;
		this.nombre_area = nombre_area;
	}
	
	
}
