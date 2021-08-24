package com.pavchishin.Employee.conrtoller;

import com.pavchishin.Employee.customer.Customer;
import com.pavchishin.Employee.repo.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/customer")
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/add")
    public String addPage () {
        return "add-customer";
    }

    @PostMapping(path="/add")
    public String addNewUser (@ModelAttribute("customer") Customer customer) {
        int bankCount = customer.getBankCount();
        customer.setBankCount(bankCount);
        repository.save(customer);
        return "redirect:/";
    }

    @GetMapping(path="/all")
    public String getAllUsers(Model model) {
        model.addAttribute("customers", repository.findAll());
        return "all-customers";
    }
}
