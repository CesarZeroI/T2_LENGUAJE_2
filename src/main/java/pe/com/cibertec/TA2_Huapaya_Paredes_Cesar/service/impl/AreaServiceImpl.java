package pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model.AreaEntity;
import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.repository.AreaRepository;
import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.service.AreaService;
@Service

public class AreaServiceImpl implements AreaService{
	
	@Autowired
	private AreaRepository areaRepository;
	
	
	@Override
	public List<AreaEntity> buscarArea() {
		// TODO Auto-generated method stub
		return areaRepository.findAll();
	}

	@Override
	public AreaEntity buscarAreaporID(Integer id) {
		AreaEntity areaEncontrada = areaRepository.findById(id).get();;
        return areaEncontrada;
	}

	@Override
	public void crearArea(AreaEntity nuevaArea) {
		   // TODO Auto-generated method stub
        areaRepository.save(nuevaArea);
		
	}

	@Override
	public void actualizarArea(Integer id, AreaEntity areaEntity) {
		 AreaEntity updatedArea = buscarAreaporID(areaEntity.getArea_id());
	        if (updatedArea != null) {
	            updatedArea.setNombre_area(areaEntity.getNombre_area());
	            areaRepository.save(updatedArea);
	 }
		
	}

	@Override
	public void eliminarArea(Integer id) {
		// TODO Auto-generated method stub
        AreaEntity areaToDelete = buscarAreaporID(id);
        if(areaToDelete != null){
            areaRepository.delete(areaToDelete);
        }
    }

}
