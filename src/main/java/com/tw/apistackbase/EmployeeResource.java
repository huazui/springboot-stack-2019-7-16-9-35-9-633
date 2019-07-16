package com.tw.apistackbase.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.remainderUnsigned;

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
//    @GetMapping()
//    public  @ResponseBody String getAllCompany() {
//        List<Employee> employees = getEmployeeList();
//        String result = "";
//        for (int i = 0; i < employees.size() - 1; i++) {
//            result += employees.get(i).getEmployeeID() + " " + employees.get(i).getName() + " " + employees.get(i).getSex() + ",";
//        }
//        result += employees.get(employees.size()-1).getEmployeeID() + " " + employees.get(employees.size()-1).getName() + " " + employees.get(employees.size()-1).getSex() + ".";
//        return result;
//    }
//    @GetMapping("/{id}")
//    public @ResponseBody String getAEmployee(@PathVariable("id") int id) {
//        List<Employee> employees = getEmployeeList();
//        String result = "";
//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i).getEmployeeID() == id) {
//                result = employees.get(i).getEmployeeID()+" "+employees.get(i).getName()+" "+employees.get(i).getSex()+".";
//            }
//        }
//        return result;
//    }
//    @GetMapping("/{id}")
//    public @ResponseBody String getEmployeeIndex(@PathVariable("id") String id) {
//        String array[]=id.split("&");
//        String arrayPage[]=array[0].split("=");
//        String arraySize[]=array[1].split("=");
//        List<Employee>employees=getEmployeeList();
//        String result="";
//        for (int i = parseInt(arrayPage[1]);i<parseInt(arraySize[1]);i++){
//                result += employees.get(i).getEmployeeID() + " " + employees.get(i).getName() + " " + employees.get(i).getSex() + ",";
//            }
//            result += employees.get(employees.size()-1).getEmployeeID() + " " + employees.get(employees.size()-1).getName() + " " + employees.get(employees.size()-1).getSex() + ".";
//            return result;
//        }
    @PutMapping("/{id}")
    public  @ResponseBody String getAdd(@PathVariable("id") int id) {
        List<Employee> employees = getEmployeeList();
        List<Employee>newList=employees.stream().filter(item->item.getEmployeeID()==id).collect(Collectors.toList());
        String result="";
        for (int i = 0; i < newList.size() - 1; i++) {
            result += employees.get(i).getEmployeeID() + " " + employees.get(i).getName() + " " + employees.get(i).getSex() + ",";
        }
        result += employees.get(employees.size()-1).getEmployeeID() + " " + employees.get(employees.size()-1).getName() + " " + employees.get(employees.size()-1).getSex() + ".";
        return result;
    }

//    @GetMapping("/{id}")
//    public ResponseEntity getEmployees1(@PathVariable("id") int id){
//        Company result = new Company();
//        List<Company> companies = getCompany();
//        List<Employee> employees = getEmployees();
//        for (int i = 0; i < companies.size(); i++) {
//            if (companies.get(i).getCompanyID() == id) {
//                result = companyList.get(i);
//            }
//        }
//        result.setEmployees(employees);
//        List<Employee>getEmployeeOne=result.getEmployees();
//        return ResponseEntity.ok().body(getEmployeeOne);
//    }
//    @PostMapping()
//    public ResponseEntity create(@RequestBody Company company){
//        List<Company>companyList=getCompany();
//        companyList.add(company);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }
//    @PutMapping("/{id}")
//    public ResponseEntity <Company>writenEmployee(@PathVariable("id") int id){
//        List<Company> companies = getCompany();
//        Company result=new Company();
//        for (int i = 0; i < companies.size(); i++) {
//            if (companies.get(i).getCompanyID() == id) {
//                result = companyList.get(i);
//            }
//        }
//        result.setName("new Name");
//        return ResponseEntity.ok().body(result);
//    }
//    @DeleteMapping("/{id}")
//    public ResponseEntity delete(@PathVariable("id") int id) {
//        List<Company> companies = getCompany();
//        List<Employee> employees = getEmployees();
//        companies.get(0).setEmployees(employees);
//        Company result=new Company();
//        for (int i = 0; i < companies.size(); i++) {
//            if (companies.get(i).getCompanyID() == id) {
//                result = companyList.get(i);
//            }
//        }
//        result.setEmployees(null);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }
}

