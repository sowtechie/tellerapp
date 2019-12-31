import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import { RouterModule } from '@angular/router';
import { AuthService } from './services/auth.service';
import { HttpClientModule } from '@angular/common/http'; 
import {MatPaginatorModule} from '@angular/material/paginator';
import { CookieService } from 'ngx-cookie-service';
import { CustomerService } from './services/customer.service';
import { RegisterService } from './services/register.service';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatIconModule,
    MatPaginatorModule,
  
  ],
  providers: [AuthService, CookieService,CustomerService,RegisterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
