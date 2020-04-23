package com.cts.AcademyPortal.Controllers;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.AcademyPortal.Dao.AdminDao;
import com.cts.AcademyPortal.Models.AdminLogin;
import com.cts.AcademyPortal.Models.AdminReg;

@Controller
	public class AdminController {
		@Autowired
		private AdminDao dao;
		@GetMapping(value="/admin")
		 public String admin(Model model) {
			AdminReg reg=new AdminReg();
			 model.addAttribute("admin",reg);
			 return "AdminRegistration";
		 }
		@PostMapping(value="/adminreg")
		public String adminreg(@ModelAttribute("admin") AdminReg adminreg,Model model) {
			AdminReg ar= dao.save(adminreg);
			if(ar!=null) {
			model.addAttribute("message","Your details are submitted successfully.");
			return "AdminRegistration";
			}else {
				model.addAttribute("message","Oops...Something went wrong.");
				return "failure";
			}
			
		}
		@GetMapping(value="/adminlogin")
		public String adminlogin(Model model) {
			AdminLogin adminlogin=new AdminLogin();
			model.addAttribute("adminlogin", adminlogin);
			return "AdminLogin";
		}
		@PostMapping(value="/loginverify")
		public String loginverify(@ModelAttribute("adminlogin") AdminLogin adminlogin,Model model,HttpSession session) {
			Optional<AdminReg> al=dao.findById(adminlogin.getUserId());
			if(al!=null) {
				AdminReg a1=al.get();
				if(a1.getPassword().equals(adminlogin.getPassword())) {
					session.setAttribute("name", a1.getFirstName());
					return "adminhome";
				}		
			}
			model.addAttribute("message", "Invalid userId or password");
			return "AdminLogin";
			
		}
		

	}
