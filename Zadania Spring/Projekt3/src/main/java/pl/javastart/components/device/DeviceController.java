package pl.javastart.components.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.javastart.components.category.Category;
import pl.javastart.components.category.CategoryRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class DeviceController {

    private Scanner scanner;
    private DeviceRepository deviceRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public DeviceController(Scanner scanner, DeviceRepository deviceRepository, CategoryRepository categoryRepository){
        this.scanner = scanner;
        this.deviceRepository = deviceRepository;
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    public void createDevice(){
        try {
            Device device = readDevice();
            deviceRepository.save(device);
            System.out.println("Dodano urządzenie");
            System.out.println(device);
        }catch (CategoryNotFoundException e){
            System.err.println("Urządzenia nie dodano. " + e.getMessage());
        }
    }
    private Device readDevice(){
        Device device = new Device();
        System.out.println("Nazwa urządzenia");
        device.setName(scanner.nextLine());
        System.out.println("Opis urządzenia");
        device.setDescription(scanner.nextLine());
        System.out.println("Cena urządzenia");
        device.setPrice(scanner.nextDouble());
        System.out.println("Podaj ilość(szt) urządzenia");
        device.setQuantity(scanner.nextInt());
        System.out.println("Kategoria urządzenia:");
        String categoryName = scanner.nextLine();
        Optional<Category>category = categoryRepository.findByNameIgnoreCase(categoryName);
        scanner.nextLine();
        category.ifPresent(device::setCategory); {
            throw new CategoryNotFoundException("Kategoria o podanym nazwie nie istnieje");
        }
    }
    public void removeDevice(){
        System.out.println("Podaj id urządzenia, które chcesz usunać");
        long deviceId = scanner.nextLong();
        Optional<Device>device = deviceRepository.findById(deviceId);
        device.ifPresent(deviceRepository::delete);
    }
    public void searchDevice(){
        System.out.println("Podaj fragment nazwy:");
        String name = scanner.nextLine();
        List<Device>devices = deviceRepository.findAllByNameContainingIgnoreCase(name);
        if (devices.isEmpty())
            System.out.println("Brak urzuądzenia o wskazanej nazwie");
        else {
            System.out.println("Znalezione urządzenie ");
            devices.forEach(System.out::println);
        }
    }
}
