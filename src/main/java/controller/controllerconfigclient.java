package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerconfigclient {

	@Value("${some.value}")
	private String myValue;
	
	@GetMapping(path="/myValue")
	public String myValue() {
		return this.myValue;
	}
	@GetMapping(path="/myValue/Suma")
	public String suma(@PathVariable Long nm1,@PathVariable Long nm2) {
		return "La suma  de "+nm1+"+"+nm2+"es"+nm1+nm2;
		
	}
	
	@GetMapping(path="/myValue/Resta")
	public String resta(@PathVariable Long nm1,@PathVariable Long nm2) {
		return "La resta  de "+nm1+"-"+nm2+"es"+ (nm1 - nm2);
		
	}
	@GetMapping(path="/myValue/Multiplicar")
	public String multiplicar(@PathVariable Long nm1,@PathVariable Long nm2) {
		return "La multiplicación  de "+nm1+"*"+nm2+"es"+nm1*nm2;
		
	}
	@GetMapping(path="/myValue/Dividir")
	public String dividir(@PathVariable Long nm1,@PathVariable Long nm2) {
		return "La división  de "+nm1+"/"+nm2+"es"+nm1/nm2;
		
	}
	
}
