package com.example.EndPointProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EndPointService {
@Autowired
public EndPointService() {
	
}
public String calculateNumbre (int p) {
	String Result ="";
	if ( (p%2) != 0) {
		  int i = 1, n = 10, t1 = p, t2 = p + 1;
	        while (i < n)
	        {
	        	Result = Result + t1 + " , ";

	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;

	            i++;
	        }
	        Result = Result + t1;
	        Result = "Série de Fibonnaci : "+Result;
	}else {
		if (p <= 50) {
			 int i;
			 long fact=1;
			  for(i=1;i<=p;i++){    
			      fact=fact*i;    
			  }    
			  Result = "Factorial de "+p+" is: "+fact;    
		}else {
			Result = "Votre nombre est :  "+p;
		}
	}
	return Result;
}


}
