package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID ID) {
        return CustomerDto.builder()
                .ID(UUID.randomUUID())
                .name("Kevin Stanley")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .ID(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerID, CustomerDto customerDto) {
        // todo would update existing customer if it exists or create new customer
    }

    @Override
    public void deleteCustomerByID(UUID customerID) {
        //todo would delete customer using customerID parameter
        log.debug("Deleting a customer");
    }
}
