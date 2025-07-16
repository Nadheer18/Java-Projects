package com.example.bankapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BankController {
    private double balance = 0;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("balance", balance);
        return "index";
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam double amount, Model model) {
        if (amount > 0) balance += amount;
        model.addAttribute("balance", balance);
        return "index";
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam double amount, Model model) {
        if (amount > 0 && amount <= balance) balance -= amount;
        model.addAttribute("balance", balance);
        return "index";
    }
}
