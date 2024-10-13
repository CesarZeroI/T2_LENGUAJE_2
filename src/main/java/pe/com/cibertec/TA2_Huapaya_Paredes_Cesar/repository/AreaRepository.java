package pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model.AreaEntity;

@Repository
public interface AreaRepository extends JpaRepository<AreaEntity, Integer>{
	
	

}
