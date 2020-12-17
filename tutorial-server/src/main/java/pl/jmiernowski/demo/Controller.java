package pl.jmiernowski.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jmiernowski.demo.model.Car;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/car")
    public Car getCar(){
        return new Car("Opel", 2010);
    }


//    List<Car> getCar(){
//        Car car1= new Car("name1", 123);
//        Car car2= new Car("name2", 456);
//        Car car3= new Car("name3", 789);
//        List<Car> cars = List.of(car1,car2,car3);
//        return  cars;
//    }

}


