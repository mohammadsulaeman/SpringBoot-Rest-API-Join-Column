# SpringBoot Rest API Join Column
Belajar Membuat Spring Boot REST API untuk Join  antar Column 
# Kolom Yang Di Join <br>
![Screenshot 2023-08-08 091643](https://github.com/mohammadsulaeman/springbootjoincolumn/assets/68136244/8b61e2ef-2481-4fee-8588-545e3beb9744) <br>
# API SPEC
## Create Department
  Method : POST <br>
  EndPoint : http://localhost:8080/api/v1/department <br>
  Header : <br>
  Content-Type: application/json <br>
  Body : <br>
 ![Screenshot 2023-08-08 090516](https://github.com/mohammadsulaeman/springbootjoincolumn/assets/68136244/0db661cb-f03c-4439-8aaa-58cfa02818c7) <br>
  Response : <br>
 ![Screenshot 2023-08-08 090056](https://github.com/mohammadsulaeman/springbootjoincolumn/assets/68136244/3a12fddd-e2fa-4fe1-969b-155f852be7a9) <br>

 ## Create Organization
   Method : POST <br>
   EndPoint : http://localhost:8080/api/v1/organization
   Header : <br>
    Content-Type: application/json <br>
   Body : <br>
   ![Screenshot 2023-08-08 090606](https://github.com/mohammadsulaeman/springbootjoincolumn/assets/68136244/584e650b-9df1-4b56-a9ca-90718ecfda73) <br>
   Response : <br>
  ![Screenshot 2023-08-08 090633](https://github.com/mohammadsulaeman/springbootjoincolumn/assets/68136244/8491f67a-3ddb-42c7-9095-0efdc2c1ba4c) <br>

  ## Create Employee
   Method : Post <br>
   Endpoint : http://localhost:8080/api/v1/employee/{deptId}/{orgId} <br>
   Header : <br>
    Content-Type: application/json <br>
   Body : <br>
   ![Screenshot 2023-08-08 091119](https://github.com/mohammadsulaeman/springbootjoincolumn/assets/68136244/d1c01da3-eacf-4d45-9cef-2d2fbb01679d) <br>
   Response : <br>
   ![Screenshot 2023-08-08 091226](https://github.com/mohammadsulaeman/springbootjoincolumn/assets/68136244/5542a2c5-9772-4d5d-942c-21cf61bc2374) <br>

   ## Get Employee
   Method : Get <br>
   EndPoint : http://localhost:8080/api/v1/employee <br>
   Header : <br>
    Content-Type: application/json <br>
   Response : <br>
   ![Screenshot 2023-08-08 091506](https://github.com/mohammadsulaeman/springbootjoincolumn/assets/68136244/34151f13-aeb6-437d-9098-6a460c41e1c7)
    
