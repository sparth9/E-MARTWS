E-MARTWS
========

Web service bean module

1. This is a webservice Module to verify the valid credit card. The mod10 algorithm runs to check if the credit xard is valid or not.
2. The Module is a webservice so follow the below steps for deploying it
3. Deploy the entire project on Glass fish server.
4. Check the wsdl file , this url is present in the class in the Class CreditCardVerification_Service( Eg : http://localhost:8089/CreditCardVerification/CreditCardVerification?wsdl ).
5. Check the port it running. There is a webservice folder in the project expand it and you will find the same class in this webservice folder, if you do a mouse hover you will find the url for the wsdl where it is actually deployed. Check the wsdl address  on the wsdl address on the class CreditCardVerification_Service.
6. If the wsdl address is not different change the port in the class and redeploy it. It should work fine.
