import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';



@Injectable()
export class CustomerService {
constructor(private httpClient: HttpClient) {}

 userFormData(usersData){
  return this.httpClient.post('http://localhost:8080/newCustomer',usersData)
 }

} 