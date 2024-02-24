package sn.elhadji.costumerapp.web;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sn.elhadji.costumerapp.entities.Customer;
import sn.elhadji.costumerapp.repository.CustomerRepository;

import java.util.List;

@Controller
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public String customers(Model model){
        List<Customer> customerList = customerRepository.findAll();
        model.addAttribute("customers", customerList);
        return "customers";
    }

    @GetMapping("/auth")
    @ResponseBody
    public Authentication authentication(Authentication authentication){
        return  authentication;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }


}
