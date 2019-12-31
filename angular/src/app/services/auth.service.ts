import { Injectable } from "@angular/core";
import { Identifiers } from '@angular/compiler';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class AuthService {

    constructor(private httpClient: HttpClient) { }
    
    authenticate(UsersData) {
        return this.httpClient.post('http://localhost:8080/authenticate', UsersData);

    }
}