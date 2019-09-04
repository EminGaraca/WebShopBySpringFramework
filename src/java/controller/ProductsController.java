
package controller;


import model.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsController {
    
    @RequestMapping (value = "/products", method = RequestMethod.GET)
    public String createForm(ModelMap model) throws ClassNotFoundException {
        
        model.addAttribute("products", new Products());
        return "products";
    }
    @RequestMapping (value = "/products", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("products") Products products, ModelMap model) throws ClassNotFoundException {
        
        products.insertProducts();;
        products.deleteProducts();;
        products.updateProducts();;
        createForm(model);
        return "products";
    }
}
