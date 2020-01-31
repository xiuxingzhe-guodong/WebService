package com.zzz;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Jueyuan
 * this interface will be public service.
 *
 */
@WebService
public interface IDoer  {
	@WebMethod @WebResult String doSth(@WebParam String thing);
}
