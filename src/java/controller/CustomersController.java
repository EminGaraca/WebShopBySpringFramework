package controller;

import model.Customers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomersController {
    
    @RequestMapping (value = "/customers", method = RequestMethod.GET)
    public String createForm(ModelMap model) throws ClassNotFoundException {
        
        model.addAttribute("customers", new Customers());
        return "customers";
    }
    @RequestMapping (value = "/customers", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("customers") Customers customers, ModelMap model) throws ClassNotFoundException {
        
        customers.insertCustomer();;
        customers.deleteCustomer();;
        customers.updateCustomer();;
        createForm(model);
        return "customers";
    }
     
}
