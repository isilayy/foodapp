package com.isilay.foodapp.web.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.isilay.foodapp.service.jpa_impl.ActionsServiceImpl;
import com.isilay.foodapp.service.jpa_impl.PersonsServiceImpl;
import com.isilay.foodapp.web.dto.ActionsDTO;

@Controller
public class IndexController {
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@Autowired
	private PersonsServiceImpl personService;
	@Autowired
	private ActionsServiceImpl actionService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("prsn", personService.getAllPersons());
		model.addAttribute("actions", actionService.getAllActions());
	
		model.addAttribute("action",  new ActionsDTO());
		return "index";
	}

	@RequestMapping(value = "/{deleteid}/delete", method = RequestMethod.GET)
	public String deleteActions(@PathVariable(value = "deleteid") Integer id, Model model,
			final RedirectAttributes redirectAttributes) {
		try {
			actionService.deleteActions(id);
			redirectAttributes.addFlashAttribute("css", "success");
			redirectAttributes.addFlashAttribute("msg", "Ýþlem Baþarýyla Gerçekleþti.");
			return "redirect:/";

		} catch (Exception e) {
			System.out.println(e.toString());
			redirectAttributes.addFlashAttribute("css", "danger");
			redirectAttributes.addFlashAttribute("msg", "Ýþlem gerçekleþtirilemedi.");
			return "redirect:/";
		}

	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String addActions(@ModelAttribute("action") ActionsDTO actions, Model model,
			final RedirectAttributes redirectAttributes) {
		try {
			DateFormat  formatter = new SimpleDateFormat("yyyy-MM-dd");
		    String dateInString = actions.getEatDate();
			try {
				actions.setEatDate2( formatter.parse(dateInString));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			actionService.addActions(actions);
			redirectAttributes.addFlashAttribute("css", "success");
			redirectAttributes.addFlashAttribute("msg", "Ýþlem Baþarýyla Gerçekleþti.");
			return "redirect:/";

		} catch (Exception e) {
			System.out.println(e.toString());
			redirectAttributes.addFlashAttribute("css", "danger");
			redirectAttributes.addFlashAttribute("msg", "Ýþlem gerçekleþtirilemedi.");
			return "redirect:/";

		}
	}

	
}