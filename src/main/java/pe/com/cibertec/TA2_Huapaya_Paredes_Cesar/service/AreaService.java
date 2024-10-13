package pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.service;

import java.util.List;

import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model.AreaEntity;

public interface AreaService {

	List<AreaEntity>buscarArea();
	AreaEntity buscarAreaporID(Integer id);
	void crearArea(AreaEntity areaEntity);
	void actualizarArea(Integer id, AreaEntity areaEntity);
	void eliminarArea(Integer id);
	
	
}
