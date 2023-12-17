In the above code: 
Exceptions,DTOs,Transformer are implimented in user-respective Classes only.      
For autenthication: one can get emailid, password as input from @GetMapping(int userid,String pass) ==>  and then can verify the same with the database that if(pass==db_user_password){give access}
For autorization: we can create an enum name_Privacy:(SELF,ADMIN) ==>  Later we can check ,give access accordingly.
For mail verification: we can include mail_sender dependency ==> from that we can generate an otp as per requirement. Due to spam detection,mail part is not implemented.
              
