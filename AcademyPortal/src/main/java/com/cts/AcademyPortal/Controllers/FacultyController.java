package com.cts.AcademyPortal.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.AcademyPortal.Dao.FacultyDao;
import com.cts.AcademyPortal.Models.AdminLogin;
import com.cts.AcademyPortal.Models.FacultyLogin;
import com.cts.AcademyPortal.Models.FacultyReg;
@Controller
public class FacultyController {
	@Autowired
	private FacultyDao dao;
	@GetMapping(value="/faculty")
	 public String admin(Model model) {
		FacultyReg reg=new FacultyReg();
		 model.addAttribute("faculty",reg);
		 return "FacultyRegistration";
	 }
	@PostMapping(value="/facultyreg")
	public String adminreg(@ModelAttribute("faculty") FacultyReg facultyreg,Model model) {
		FacultyReg fr= dao.save(facultyreg);
		if(fr!=null) {
		model.addAttribute("message","Your details are submitted successfully.");
		return "FacultyRegistration";
		}else {
			model.addAttribute("message","Oops...Something went wrong.");
			return "failure";
		}
		
	}
	@GetMapping(value="/facultylogin")
	public String adminlogin(Model model) {
		FacultyLogin facultylogin=new FacultyLogin();
		model.addAttribute("facultylogin", facultylogin);
		return "FacultyLogin";
	}

}
