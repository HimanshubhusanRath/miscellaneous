Steps to enable HTTPS in an local application
==============================================
1. 'mkcert' is a tool for generating locally-trusted TLS (development) certificates. To install it, run 
    <pre>brew install mkcert </pre> 
3. 'Certificate Authority' is responsible for the certificates created in your system. To create and install a CA (certificate authority) in your machine, run  
   <pre> mkcert -install </pre>
5. To generate a PKCS12 certificate for our application's domain (secured-server), run the below code
   <pre>
   mkcert -pkcs12 DOMAIN_NAME
   <br/>
   e.g. mkcert -pkcs12 secured-server
   </pre>
5. This will generate a certificate 'secured-server.p12' with default password as 'changeit' in the current directory. Add this certificate to the classpath of the application.
6. Add the below configurations to the application.yml
<pre>
server: 
  ssl:  
    key-store: classpath:secured-server.p12   
    key-store-type: PKCS12  
    key-store-password: changeit
</pre>
6. Start the application.
