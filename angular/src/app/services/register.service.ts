import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';

@Injectable()
export class RegisterService {
    constructor(private httpClient: HttpClient) { }

register(registersData){
    return this.httpClient.post('http://localhost:8080/newRegister',registersData)
}

}