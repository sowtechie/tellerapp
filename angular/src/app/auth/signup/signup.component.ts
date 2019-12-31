import { Component, OnInit } from '@angular/core';
import { Customer } from 'src/app/models/customer';
import { RegisterService } from 'src/app/services/register.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {
  customer: Customer = new Customer();

   
  constructor(private registerService: RegisterService) { }

  ngOnInit() {
  }
  register(registersData){
    this.registerService.register(this.customer).subscribe(backendResponse => {
    })

  }

}
