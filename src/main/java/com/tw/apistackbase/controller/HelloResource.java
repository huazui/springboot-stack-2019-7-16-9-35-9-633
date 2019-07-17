<<<<<<< HEAD
package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.Company;
import com.tw.apistackbase.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static java.lang.Integer.parseInt;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController
@RequestMapping("/companies")
public class HelloResource {
   private final Logger log = Logger.getLogger(this.getClass().getName());
    private Company company1=new Company(1,"one");
    private Company company2=new Company(2,"two");
   private  Company company3=new Company(3,"three");
   private Company company4=new Company(4,"four");
   private Company company5=new Company(1,"five");
   private  Company company6=new Company(1,"six");
    private Employee employee1=new Employee(1,"zhangsan","male");
   private  Employee employee2=new Employee(2,"xiaofang","female");
   private  List<Company> companyList=new ArrayList<Company>();
   private List<Employee>employeeList=new ArrayList<Employee>();
   public List<Company>getCompany(){
       companyList.add(company1);
       companyList.add(company2);
       companyList.add(company3);
       companyList.add(company4);
       companyList.add(company5);
       companyList.add(company6);
       return  companyList;
   }
    public List<Employee>getEmployees(){
       employeeList.add(employee1);
       employeeList.add(employee2);
       return employeeList;
    }

    @GetMapping

    public @ResponseBody String getSpecificPageCompany(@RequestParam("page") int id, @RequestParam("pageSize") int id1) {

        List<Company> returnList=getCompany();
        String result="";
        for(int i=id;i<=id1;i++){
            result +=returnList.get(i).getCompanyID()+" "+returnList.get(i).getName()+".";
        }
        return result;
    }

   @GetMapping
   public ResponseEntity<List<Company>>getAllCompany(){
      List<Company> companies=getCompany();
      return ResponseEntity.ok().body(companies);
}
@GetMapping("/{id}")
public ResponseEntity getACompany(@PathVariable("id") int id) {

   Company result = new Company();
   List<Company> companies = getCompany();
   for (int i = 0; i < companies.size(); i++) {
       if (companies.get(i).getCompanyID() == id) {
           result = companyList.get(i);
       }
   }
   return ResponseEntity.ok().body(companies);
}


   //
@GetMapping("/{id}")
       public ResponseEntity getEmployees1(@PathVariable("id") int id){
   Company result = new Company();
   List<Company> companies = getCompany();
   List<Employee> employees = getEmployees();
   for (int i = 0; i < companies.size(); i++) {
       if (companies.get(i).getCompanyID() == id) {
           result = companyList.get(i);
       }
   }
   result.setEmployees(employees);
   List<Employee>getEmployeeOne=result.getEmployees();
   return ResponseEntity.ok().body(getEmployeeOne);
}
   @PostMapping()
   public ResponseEntity create(@RequestBody Company company){
       List<Company>companyList=getCompany();
       companyList.add(company);
       return ResponseEntity.status(HttpStatus.CREATED).build();
   }
   @PutMapping("/{id}")
   public ResponseEntity <Company>writenEmployee(@PathVariable("id") int id){
       List<Company> companies = getCompany();
       Company result=new Company();
       for (int i = 0; i < companies.size(); i++) {
           if (companies.get(i).getCompanyID() == id) {
               result = companyList.get(i);
           }
       }
       result.setName("new Name");
       return ResponseEntity.ok().body(result);
   }
   @DeleteMapping("/{id}")
   public ResponseEntity delete(@PathVariable("id") int id) {
       List<Company> companies = getCompany();
       List<Employee> employees = getEmployees();
      companies.get(0).setEmployees(employees);
      Company result=new Company();
       for (int i = 0; i < companies.size(); i++) {
           if (companies.get(i).getCompanyID() == id) {
               result = companyList.get(i);
           }
       }
       result.setEmployees(null);
       return ResponseEntity.status(HttpStatus.CREATED).build();
   }

}
=======
package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.Company;
import com.tw.apistackbase.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static java.lang.Integer.parseInt;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController
@RequestMapping("/companies")
public class HelloResource {
   private final Logger log = Logger.getLogger(this.getClass().getName());
    private Company company1=new Company(1,"one");
    private Company company2=new Company(2,"two");
   private  Company company3=new Company(3,"three");
   private Company company4=new Company(4,"four");
   private Company company5=new Company(1,"five");
   private  Company company6=new Company(1,"six");
    private Employee employee1=new Employee(1,"zhangsan","male");
   private  Employee employee2=new Employee(2,"xiaofang","female");
   private  List<Company> companyList=new ArrayList<Company>();
   private List<Employee>employeeList=new ArrayList<Employee>();
   public List<Company>getCompany(){
       companyList.add(company1);
       companyList.add(company2);
       companyList.add(company3);
       companyList.add(company4);
       companyList.add(company5);
       companyList.add(company6);
       return  companyList;
   }
    public List<Employee>getEmployees(){
       employeeList.add(employee1);
       employeeList.add(employee2);
       return employeeList;
    }

    @GetMapping

    public @ResponseBody String getSpecificPageCompany(@RequestParam("page") int id, @RequestParam("pageSize") int id1) {

        List<Company> returnList=getCompany();
        String result="";
        for(int i=id;i<=id1;i++){
            result +=returnList.get(i).getCompanyID()+" "+returnList.get(i).getName()+".";
        }
        return result;
    }

   @GetMapping
   public ResponseEntity<List<Company>>getAllCompany(){
      List<Company> companies=getCompany();
      return ResponseEntity.ok().body(companies);
}
@GetMapping("/{id}")
public ResponseEntity getACompany(@PathVariable("id") int id) {

   Company result = new Company();
   List<Company> companies = getCompany();
   for (int i = 0; i < companies.size(); i++) {
       if (companies.get(i).getCompanyID() == id) {
           result = companyList.get(i);
       }
   }
   return ResponseEntity.ok().body(companies);
}


   //
@GetMapping("/{id}")
       public ResponseEntity getEmployees1(@PathVariable("id") int id){
   Company result = new Company();
   List<Company> companies = getCompany();
   List<Employee> employees = getEmployees();
   for (int i = 0; i < companies.size(); i++) {
       if (companies.get(i).getCompanyID() == id) {
           result = companyList.get(i);
       }
   }
   result.setEmployees(employees);
   List<Employee>getEmployeeOne=result.getEmployees();
   return ResponseEntity.ok().body(getEmployeeOne);
}
   @PostMapping()
   public ResponseEntity create(@RequestBody Company company){
       List<Company>companyList=getCompany();
       companyList.add(company);
       return ResponseEntity.status(HttpStatus.CREATED).build();
   }
   @PutMapping("/{id}")
   public ResponseEntity <Company>writenEmployee(@PathVariable("id") int id){
       List<Company> companies = getCompany();
       Company result=new Company();
       for (int i = 0; i < companies.size(); i++) {
           if (companies.get(i).getCompanyID() == id) {
               result = companyList.get(i);
           }
       }
       result.setName("new Name");
       return ResponseEntity.ok().body(result);
   }
   @DeleteMapping("/{id}")
   public ResponseEntity delete(@PathVariable("id") int id) {
       List<Company> companies = getCompany();
       List<Employee> employees = getEmployees();
      companies.get(0).setEmployees(employees);
      Company result=new Company();
       for (int i = 0; i < companies.size(); i++) {
           if (companies.get(i).getCompanyID() == id) {
               result = companyList.get(i);
           }
       }
       result.setEmployees(null);
       return ResponseEntity.status(HttpStatus.CREATED).build();
   }

}

