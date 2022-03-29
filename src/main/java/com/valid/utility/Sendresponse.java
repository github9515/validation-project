package com.valid.utility;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;

@Component
public class Sendresponse
{
	private Object response;
	private List<FieldError> message;
	private HttpStatus statuscode;

	public Object getResponse()
	{
		return response;
	}

	public void setResponse(Object response)
	{
		this.response = response;
	}

	public List<FieldError> getMessage()
	{
		return message;
	}

	public void setMessage(List<FieldError> allErrors)
	{
		this.message = allErrors;
	}

	public HttpStatus getStatuscode()
	{
		return statuscode;
	}

	public void setStatuscode(HttpStatus statuscode)
	{
		this.statuscode = statuscode;
	}

	@Override
	public String toString()
	{
		return "Sendresponse [response=" + response + ", message=" + message + ", statuscode=" + statuscode + "]";
	}

}
