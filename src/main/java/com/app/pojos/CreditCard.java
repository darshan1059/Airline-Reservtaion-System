/**
 * 
 */
package com.app.pojos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreditCard implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private Integer creditCardId;
	private Long cardNumber;
	private String name;
	private String expiryYear;
	private String expiryMonth;
	private Integer cvv;
	
	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}
}
