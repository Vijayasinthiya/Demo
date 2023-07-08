package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class Sample {
	
	@GetMapping(value = "/Hi")
	public String getHi() {
		return "Helloworld";
	}
	
	@GetMapping(value="/name")
	public String id() {
		return "Sinthiya";
	}
	
	@GetMapping(value="/add/{n1}/{n2}")
	public int Add(@PathVariable int n1,@PathVariable int n2) {
		return n1+n2;
	}
	
	@GetMapping(value="/vote/{n1}")
	public String eligible(@PathVariable int n1) {
		if(n1>18) {
			return "Eligible";
		}
		else {
			return "Not Eligible";
		}
		}
	
	@GetMapping(value="/number/{n1}")
	public List<Integer> series(@PathVariable int n1) {
		List<Integer> li=new ArrayList<> ();
		for(int i=0;i<=n1;i++) {
		li.add(i);
		}
		return li;
	}
	
	
	@GetMapping(value="/num/{n1}")
	public List<Integer> even (@PathVariable int n1) {
		List<Integer> sq=new ArrayList<> ();
		for(int i=0;i<=n1;i++) {
			if(i%2==0) {
				sq.add(i);
			}
		}
			return sq;
		}
	
	@GetMapping(value="/fact/{n1}")
	public int fact(@PathVariable int n1) {
		int total=1;
		for(int i=1;i<=n1;i++) {
			total=i*total;
		}
		return total;
		}
	

@GetMapping(value="/fibo/{n1}")
public int fibo(@PathVariable int n1) {
	int a=0;
	int b=0;
	int c=1;
	for(int i=0;i<=n1;i++) {
		a=b;
		b=c;
		c=a+b;
	}
	return a;
}
@GetMapping(value="/prime/{n1}")
public String prime(@PathVariable int n1) {
	boolean a=true;
	if(n1%2==0) {
		a=false;
		return "Prime";
	}
	else {
		return "Not Prime";
	}
}
	@GetMapping(value="/square/{n1}")
	public String square(@PathVariable int n1) {
		boolean a=true;
		for(int i=1;i*i<=n1;i++) {
			if(n1%i!=i) {
				a=false;
			return "Not Square";
			}
		}
		return "Square";
			}
		
		@GetMapping(value="/check")
public String check(@PathParam("username") String username,@PathParam("password") String password) {
	if(username.equals("mark")&&password.equals("antony")) {
		return "Welcome";
	}
	else {
		return "Not Match";
	}
}
	@GetMapping(value="/emp")
	public Employee getEmp(@RequestBody Employee e) {
		e.setSalary(e.getSalary()+20000);
		return e;
	}
	
	@GetMapping(value="/emp1")
	public List<Employee> getEmp1(@RequestBody List<Employee> e1 ){
//		return e;
		List<Employee> women=e1.stream().filter(x->x.getGender().equals("female")).collect(Collectors.toList());
		return women;
}
	@GetMapping(value="/emp2")
	public List<Employee> getEmp2(@RequestBody List<Employee> e2){
		List<Employee> men=e2.stream().filter(x->x.getGender().equals("male")).collect(Collectors.toList());
		return men;
	}
	@GetMapping(value="/emp3")
	public Employee getEmp3(@RequestBody List<Employee> e3){
	Employee r=e3.stream().max(Comparator.comparing(Employee::getSalary)).get();
		return r;
	}
	@GetMapping(value="/emp4")
	public Employee getEmp4(@RequestBody List<Employee> e4){
		Employee a=e4.stream().min(Comparator.comparing(Employee::getSalary)).get();
		return a;
		}
	@GetMapping(value="/emp5")
	public List<Employee> getEmp5(@RequestBody List<Employee> e5) {
		for(int i=0;i<e5.size();i++) {
			if(e5.getAge()>45) {
				e5.setSalary(e5.getSalary()+e5.getSalary()*5/100);
			}
		}
		return e5;
	}
	@GetMapping(value="/emp6")
	public List<Employee> getEmp6(@RequestBody List<Employee> e6){
		e6.stream().filter((x)->x.getAge()>45).forEach((y)-> {
		int temp1=y.getSalary();
		int temp2=y.getSalary()*5/100;
		y.setSalary(temp1+temp2);
	});
	return e6;
	}
	}


	
	
	


