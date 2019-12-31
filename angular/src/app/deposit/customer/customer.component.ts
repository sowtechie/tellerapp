import { Component, OnInit } from '@angular/core';
import { CustomerService } from 'src/app/services/customer.service';
import { Customer } from 'src/app/models/customer';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.scss']
})
export class CustomerComponent implements OnInit {
  

  customer: Customer = new Customer();
  constructor(private customerService: CustomerService) { }
   

  ngOnInit() {
  }
  userFormData(usersFormData){

    this.customerService.userFormData(this.customer).subscribe(backendResponse => {
    })
      
  }

}
