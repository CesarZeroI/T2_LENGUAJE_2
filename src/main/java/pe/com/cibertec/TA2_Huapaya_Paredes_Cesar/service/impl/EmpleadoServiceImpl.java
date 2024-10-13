package pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model.AreaEntity;
import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model.EmpleadoEntity;
import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.repository.EmpleadoRepository;
import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.service.EmpleadoService;
@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<EmpleadoEntity> buscarEmpleado() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

	@Override
	public EmpleadoEntity buscarEmpleadoID(String id) {
		EmpleadoEntity  empleadoEncontrada = empleadoRepository.findById(id).get();
        return empleadoEncontrada;
	}

	@Override
	public void crearEmpleado(EmpleadoEntity nuevoEmpleado) {
		empleadoRepository.save(nuevoEmpleado);
		
		
	}

	@Override
	public void actualizarEmpleado(Integer id, EmpleadoEntity actualizarEmpleado) {
		 EmpleadoEntity updatedEmpleado = buscarEmpleadoID(actualizarEmpleado.getDni_empleado());
	        if (updatedEmpleado != null) {
	        	updatedEmpleado.setNombre_empleado(actualizarEmpleado.getNombre_empleado());
	        	empleadoRepository.save(updatedEmpleado);
	 }
		
	}

	@Override
	public void eliminarEmpleado(String id) {
		EmpleadoEntity empleadoToDelete = buscarEmpleadoID(id);
        if(empleadoToDelete != null){
           empleadoRepository.delete(empleadoToDelete);
        }
	}

}
