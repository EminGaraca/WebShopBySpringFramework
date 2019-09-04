package controller;


import model.Sale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SaleController {
    
    @RequestMapping (value = "/sale", method = RequestMethod.GET)
    public String createForm(ModelMap model) throws ClassNotFoundException {
        
        model.addAttribute("sale", new Sale());
        return "sale";
    }
    @RequestMapping (value = "/sale", method = RequestMethod.POST)
    public String addSale(@ModelAttribute("sale") Sale sale, ModelMap model) throws ClassNotFoundException {
        
        sale.addSale();;
  
        createForm(model);
        return "sale";
    }
    
}
