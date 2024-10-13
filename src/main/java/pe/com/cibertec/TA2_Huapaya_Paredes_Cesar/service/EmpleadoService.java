package pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.service;

import java.util.List;


import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model.EmpleadoEntity;

public interface EmpleadoService {
	List<EmpleadoEntity>buscarEmpleado();
	EmpleadoEntity buscarEmpleadoID(String id);
	void crearEmpleado(EmpleadoEntity nuevoEmpleado);
	void actualizarEmpleado(Integer id, EmpleadoEntity actualizarEmpleado);
	void eliminarEmpleado(String id);
	
}
