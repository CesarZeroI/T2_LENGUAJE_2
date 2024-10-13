package pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model.AreaEntity;
import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.model.EmpleadoEntity;
import pe.com.cibertec.TA2_Huapaya_Paredes_Cesar.service.EmpleadoService;

@Controller

public class EmpleadoController {
	
	
	private EmpleadoService empleadoService;
	@GetMapping("listar_empleados")
	public String home(Model model) {
		
		List<EmpleadoEntity>listaEmpleado = empleadoService.buscarEmpleado();
		model.addAttribute("lst_empleado", listaEmpleado);
		
		return "listar_empleados";
	
}
	
}
