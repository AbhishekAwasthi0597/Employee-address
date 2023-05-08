package com.geekster.Employee.address.service;

import com.geekster.Employee.address.dao.AddressDao;
import com.geekster.Employee.address.model.Address;
import com.geekster.Employee.address.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressDao addressDao;
    public void addEmployee(Address addr) {
         addressDao.save(addr);
    }

    public Address getService(Long id) {
       return addressDao.findById(id).get();
    }

    public String deleteAddress(Long id) {
        addressDao.deleteById(id);
        return "i have deleted id";
    }
    @Transactional
    public String updateAddress(Long id, Address address) {
            if(addressDao.existsById(id)){
                addressDao.save(address);
            }
            return "address get updated";
    }
}
