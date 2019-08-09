/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author shivam
 */
import java.io.Serializable;


/*
 * public class message
 * 
 * 					Creates an serializable object with contains the message 
 * 					to be exchanged between Client and Server.
 */


public class message implements Serializable{
		
		private static final long serialVersionUID = 1L;
			byte[] data; 
			
			message(byte[] data){
				this.data = data;
			}
			
			/*
			 *getData method
			 *				returns the byte array.
			 */
			
			byte[] getData(){
				return data;
			}
			
		}	