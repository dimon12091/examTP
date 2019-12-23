package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintWriter;
import java.util.Scanner;

import static hello.Calculator.*;
import static hello.Fibonachi.fib;
import static hello.Recursive_factorial.factorial;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        int n= 12;
        int a = 5;
        int d = 2;
        int S = a + d*(n-1);
        String str = "Number of 12 : "+Integer.toString(S);
        return str;
    }
    @RequestMapping("/fact")
    public String homefact() {
        int i,fact=1;
        int number=4;
        fact = factorial(number);
        String str = "Factorial of "+Integer.toString(number)+" is: "+Integer.toString(fact);
        return str;
    }
    @RequestMapping("/time")
    public String hometime() {
        int year = 2017;
        int mounth = 1;
        int day = 27;
        String quartal = time.show(year,mounth,day);

        return quartal;
    }

    @RequestMapping("/fine")
    public String homecalc() {
        int a= 15;
        int b = 4;
        int sumar = sum(a,b);
        int subs = substract(a,b);
        int divid = divide(a,b);
        int mult = multiplication(a,b);
        String str = "Sum of "+Integer.toString(a)+"+"+Integer.toString(b)+" is: "+Integer.toString(sumar);
        String str2 = "Substract of "+Integer.toString(a)+"-"+Integer.toString(b)+" is: "+Integer.toString(subs);
        String str3 = "Division of "+Integer.toString(a)+"/"+Integer.toString(b)+" is: "+Integer.toString(divid);
        String str4 = "Multiple of "+Integer.toString(a)+"*"+Integer.toString(b)+" is: "+Integer.toString(mult);
        return str+"\n"+str2+"\n"+str3+"\n"+str4;
    }


    @RequestMapping("/fib")
    public String homefib() {
        int a = 10;
        int fib = fib(a);
        return "Sequence fibonachi of "+Integer.toString(a)+" is: "+Integer.toString(fib);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
