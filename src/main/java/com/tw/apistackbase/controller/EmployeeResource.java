package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeResource {
    private Employee employee1=new Employee(1,"zhangsan","male");
    private  Employee employee2=new Employee(2,"xiaofang","female");
    private List<Employee>employeeList=new ArrayList<Employee>();
    public List<Employee>getEmployeeList(){
        employeeList.add(employee1);
        employeeList.add(employee2);
        return employeeList;
    }
    //
//    @GetMapping(path = "/{userName}", produces = {"application/json"})
//
//    public ResponseEntity<String> getAll(@PathVariable String userName) {
//
//        return ResponseEntity.ok("Hello:" + userName);
//    }
    @GetMapping()
    public  @ResponseBody String getAllEmployee() {
        List<Employee> employees = getEmployeeList();
        String result = "";
        for (int i = 0; i < employees.size() - 1; i++) {
            result += employees.get(i).getEmployeeID() + " " + employees.get(i).getName() + " " + employees.get(i).getSex() + ",";
        }
        result += employees.get(employees.size()-1).getEmployeeID() + " " + employees.get(employees.size()-1).getName() + " " + employees.get(employees.size()-1).getSex() + ".";
        return result;
    }
////    @GetMapping("/{id}")
////    public @ResponseBody String getAEmployee(@PathVariable("id") int id) {
////        List<Employee> employees = getEmployeeList();
////        String result = "";
////        for (int i = 0; i < employees.size(); i++) {
////            if (employees.get(i).getEmployeeID() == id) {
////                result = employees.get(i).getEmployeeID()+" "+employees.get(i).getName()+" "+employees.get(i).getSex()+".";
////            }
////        }
////        return result;
////    }
////    @GetMapping("/{id}")
////    public @ResponseBody String getEmployeeIndex(@PathVariable("id") String id) {
////        String array[]=id.split("&");
////        String arrayPage[]=array[0].split("=");
////        String arraySize[]=array[1].split("=");
////        List<Employee>employees=getEmployeeList();
////        String result="";
////        for (int i = parseInt(arrayPage[1]);i<parseInt(arraySize[1]);i++){
////                result += employees.get(i).getEmployeeID() + " " + employees.get(i).getName() + " " + employees.get(i).getSex() + ",";
////            }
////            result += employees.get(employees.size()-1).getEmployeeID() + " " + employees.get(employees.size()-1).getName() + " " + employees.get(employees.size()-1).getSex() + ".";
////            return result;
////        }
////    @DeleteMapping("/{id}")
////    public  @ResponseBody String getAdd(@PathVariable("id") int id) {
////        List<Employee> employees = getEmployeeList();
////        List<Employee>newList=employees.stream().filter(item->item.getEmployeeID()==id).collect(Collectors.toList());
////        String result="";
////        for (int i = 0; i < newList.size() - 1; i++) {
////            result += employees.get(i).getEmployeeID() + " " + employees.get(i).getName() + " " + employees.get(i).getSex() + ",";
////        }
////        result += employees.get(employees.size()-1).getEmployeeID() + " " + employees.get(employees.size()-1).getName() + " " + employees.get(employees.size()-1).getSex() + ".";
////        return result;
////    }
//    //make sex to "femal"when id is"1"
//    @PutMapping("/{id}")
//    public  @ResponseBody String getAdd(@PathVariable("id") int id) {
//        List<Employee> employees = getEmployeeList();
//        String result="";
//        for (int i = 0; i < employees.size() ; i++) {
//            if(employees.get(i).getEmployeeID()==id)
//                result += employees.get(i).getEmployeeID() + " " + employees.get(i).getName() + " female" + ".";
//            else {
//                result += employees.get(i).getEmployeeID() + " " + employees.get(i).getName() + " " + employees.get(i).getSex() + ".";
//            }
//        }
//         return result;
//    }


}

