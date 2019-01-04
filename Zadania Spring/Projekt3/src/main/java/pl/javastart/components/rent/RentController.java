package pl.javastart.components.rent;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.javastart.components.customer.Customer;
import pl.javastart.components.customer.CustomerRepository;
import pl.javastart.components.device.Device;
import pl.javastart.components.device.DeviceRepository;

import java.util.Optional;
import java.util.Scanner;

@Service
public class RentController {

    private Scanner scanner;
    private DeviceRepository deviceRepository;
    private CustomerRepository customerRepository;

    public RentController(Scanner scanner, DeviceRepository deviceRepository, CustomerRepository customerRepository){
        this.scanner = scanner;
        this.deviceRepository = deviceRepository;
        this.customerRepository = customerRepository;
    }
    @Transactional
    public void rentDeviceToCustomer(){
        rent();
    }
    private void rent() {
        System.out.println("Podaj pesel klienta:");
        String pesel = scanner.nextLine();
        System.out.println("Podaj ID urządzenia:");
        long deviceId = scanner.nextLong();
        Optional<Customer> customer = customerRepository.findByPesel(pesel);
        Optional<Device> device = deviceRepository.findById(deviceId);

    }
}
