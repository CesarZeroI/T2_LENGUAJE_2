package pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model.AreaEntity;
import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.service.AreaService;

@Controller
public class AreaController {
	
	@Autowired
	private AreaService areaService;
	
	@GetMapping("/")
	public String home(Model model) {
	
			List<AreaEntity>listaArea = areaService.buscarArea();
			model.addAttribute("lst_area", listaArea);
			
			return "listar_area";
		
		
	}
	
}
