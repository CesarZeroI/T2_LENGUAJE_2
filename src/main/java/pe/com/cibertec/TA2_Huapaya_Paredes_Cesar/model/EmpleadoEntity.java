package pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tb_empleado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpleadoEntity {
	
	@Id
	@Column (name="dni_empleado", nullable= false)
	private String dni_empleado;
	@Column (name="nombre_empleado", nullable= false )
	private String nombre_empleado;
	@Column (name="apellido_empleado", nullable= false )
	private String apellido_empleado;
	@Column (name="fecha_nacimiento", nullable= false )
	private Date fecha_nacimiento;
	@Column (name="direccion", nullable= false )
	private String direccion;
	@Column (name="correo", nullable= false )
	private String correo;
	
	@ManyToOne
	@JoinColumn (name = "fk_area", nullable= false)
	private AreaEntity areaEntity;

	public String getDni_empleado() {
		return dni_empleado;
	}

	public void setDni_empleado(String dni_empleado) {
		this.dni_empleado = dni_empleado;
	}

	public String getNombre_empleado() {
		return nombre_empleado;
	}

	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}

	public String getApellido_empleado() {
		return apellido_empleado;
	}

	public void setApellido_empleado(String apellido_empleado) {
		this.apellido_empleado = apellido_empleado;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public AreaEntity getAreaEntity() {
		return areaEntity;
	}

	public void setAreaEntity(AreaEntity areaEntity) {
		this.areaEntity = areaEntity;
	}

	public EmpleadoEntity(String dni_empleado, String nombre_empleado, String apellido_empleado, Date fecha_nacimiento,
			String direccion, String correo, AreaEntity areaEntity) {
		super();
		this.dni_empleado = dni_empleado;
		this.nombre_empleado = nombre_empleado;
		this.apellido_empleado = apellido_empleado;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.correo = correo;
		this.areaEntity = areaEntity;
	}
	
	

}
