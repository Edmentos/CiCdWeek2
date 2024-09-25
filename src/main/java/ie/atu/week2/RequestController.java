package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class RequestController {
    @GetMapping("/sayHello")
    public String sayHello()
    {
        return "Hi there :)";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Your Name is " + name;
    }
    @GetMapping("/details")
    public String details(@RequestParam int age, @RequestParam String name)
    {
        return "Your age is " + age + ". Your name is " + name;
    }
    @GetMapping("/Calculate")
    public String calculator(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        float ans=0;
        switch(operation){
            case"add":
                ans = num1 + num2;
                break;
            case"subtract":
                ans = num1 - num2;
                break;
            case"multiply":
                ans = num1 * num2;
                break;
            case"divide":
                if(num2 == 0){
                    return "cant return by 0";
                }
                else{
                    ans = (float)num1 / num2;
                }
                break;
            default:
                break;
        }
        return Float.toString(ans);
    }
}

