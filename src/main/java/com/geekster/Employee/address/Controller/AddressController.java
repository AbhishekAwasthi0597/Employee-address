package com.geekster.Employee.address.Controller;

import com.geekster.Employee.address.model.Address;
import com.geekster.Employee.address.model.Employee;
import com.geekster.Employee.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
     @PostMapping("/address")
    public String addEmployee(@RequestBody Address addr){
         addressService.addEmployee(addr);
         return  "Employee hase been addaed";
     }
    @GetMapping("/address/{id}")
    public Address getService(@PathVariable Long id){
        return  addressService.getService(id);
    }
    @DeleteMapping("/address/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }
    @PutMapping("/address/{id}/{address}")
    public  String updateAddress(@PathVariable Long id , @PathVariable Address address){
        return  addressService.updateAddress(id,address);
    }

}
