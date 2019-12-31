import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.scss']
})
export class SigninComponent implements OnInit {
 reqInProgress;
  ngOnInit(): void {
    
  }

  email;
  password;

  constructor(private authService: AuthService, private cookieService: CookieService) { }

  authenticate() {
   this.reqInProgress=true;
    let userData = {
      email: this.email,
      password: this.password
    }
    this.authService.authenticate(userData).subscribe(backendResponse => {

      this.cookieService.set("userToken", backendResponse['token']);
      this.reqInProgress=false;
    })
  }

}
