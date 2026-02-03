package com.vighnesh.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello from my First Controller";
//    }
    @GetMapping("/post")
    public String giveTheMessage(){
        return "message is :  YOU";
    }

    @PostMapping("/post")
    public String post(
            @RequestBody String message
    ){

        System.out.println(message);
            return "THE MESSAGE IS: " + message;
    }
    @PostMapping("/postorder")
    public String postOrder(@RequestBody Order order){
        System.out.println(order+ "has come from the Class Order");
        System.out.println("CUSTOMER NAME IS "+order.getCustomerName());
        System.out.println("PRODUCT NAME IS "+order.getProductName());
        System.out.println("QUANTITY OF THE ORDER IS "+order.getQuantity());
        System.out.println("-----------------------------------------------");

        return "THE Order  IS: " + order.toString();
    }
    @PostMapping("/post-order-record")
    public String postOrder(@RequestBody OrderRecord order){
        System.out.println(order + "has come from the Record Order ");
       // System.out.println("CUSTOMER NAME IS "+order.getCustomerName());
      //  System.out.println("PRODUCT NAME IS "+order.getProductName());
      //  System.out.println("QUANTITY OF THE ORDER IS "+order.getQuantity());
      //  System.out.println("-----------------------------------------------");

        return "THE Order  IS: " + order.toString();
    }
    //http://localhost:8080/hello/variable
    @GetMapping("/hello/{user-name}")
    public String pathVar(
           @PathVariable("user-name") String userName
    ) {
        System.out.println(userName);
        return "My User Name is " + userName;
    }
    //http://localhost:8080/hello?param_name=paramvalue&param2=param2value
    @GetMapping("/hello")
    public String paramVar(
           @RequestParam("user") String userFirstName,
           @RequestParam("lastName") String userLastName
    ) {
        System.out.println(userFirstName + userLastName);
        return "My User Name is " + userFirstName + "and the last Name is " + userLastName;
    }
}
