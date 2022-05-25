Steps to create Certificate:
==============================
1. brew install mkcert   ---> To install 'mkcert'. This is a tool that generates valid TLS certificate.
2. mkcert -install   -------> To create and install a CA (certificate authority) in your machine. This authority is responsible for the certificates created in your system.
3. mkcert -pkcs12 secured-server ----> To generate a PKCS12 certificate for our application's domain (secured-server)
4. This will generate a certificate 'secured-server.p12' with default password as 'changeit' in the current directory. Add this certificate to the classpath of the application.
5. Add the below configurations to the application.yml

------
server:
  ssl:
    key-store: classpath:secured-server.p12
    key-store-type: PKCS12
    key-store-password: changeit
------

6. Start the application.
