package com.example.onlinestore2;

import com.example.onlinestore2.model.Carshop;
import com.example.onlinestore2.model.Customer;
import com.example.onlinestore2.repository.CarshopRepository;
import com.example.onlinestore2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class OnlineStore2Application {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CarshopRepository carshopRepository;

    public static void main(String[] args) {
        SpringApplication.run(OnlineStore2Application.class, args);

    }
    @EventListener(ApplicationReadyEvent.class)
    public void testRepository(){
        Customer customer1 = new Customer();
        customer1.setFirstName("Zhakyp");
        customer1.setLastName("Zhoomart uulu");
        customerRepository.save(customer1);

        Carshop carshop = new Carshop();
        carshop.setModel("Mercedes");
        carshop.setProvided_year("2021");
        carshop.setCustomer(customer1);
        carshopRepository.save(carshop);


    }

}
