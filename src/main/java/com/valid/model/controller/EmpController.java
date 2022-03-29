package com.valid.model.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.valid.model.Employee;
import com.valid.model.repository.EmoRepo;
import com.valid.utility.Sendresponse;

@RestController
public class EmpController
{
	@Autowired
	Sendresponse sendresponse;
	@Autowired
	EmoRepo emoRepo;

	@PostMapping("/saveEmp")
	public Sendresponse saveEmp(@Valid @RequestBody Employee emp, BindingResult bindingResult)
	{

		if (bindingResult.hasErrors())
		{
			List<FieldError> allErrors = bindingResult.getFieldErrors();

			sendresponse.setMessage(allErrors);
			sendresponse.setResponse(emp);
			sendresponse.setStatuscode(HttpStatus.BAD_REQUEST);
		}
		else if (!bindingResult.hasErrors())
		{
			sendresponse.setResponse(emp);
			sendresponse.setStatuscode(HttpStatus.ACCEPTED);

			System.out.println(emp);
		}
		return sendresponse;
	}
}
