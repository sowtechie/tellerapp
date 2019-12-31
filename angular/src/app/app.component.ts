import { Component } from '@angular/core';
import { Router } from '@angular/router';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  persons = [{ name: 'sowmya', age: 26, phn: 9193322123, gender: "female" }, { name: 'suren', age: 32, phn: 121212323, gender: "male" }, { name: 'srimai', age: 5, phn: 1123424212, gender: "female" }];

  isPersonYoungOrOld(person, j) {
    let youngOrOld;
    let gender;
    let name;
    if (person.gender == 'male') {
      gender = 'he';
    }

    else {
      gender = 'she'
    }

    if (person.age < 30) {
      youngOrOld = 'young'
    }
    else {
      youngOrOld = 'old'
    }

    if(person.name)

    return  (j+1) + '.' + ' persons name is' +  person.name + ' persons age is' +  person.age  +'   so '  +  gender  + '  is' +  youngOrOld;


  }


  constructor(private router: Router) { }

  title = 'ang-solutions';
  goToHome() {
    this.router.navigate(['auth']);

  }

  goTocustomer() {
    this.router.navigate(['customer']);
  }

  isUserLoggedIn() {
    // this.router.navigate(['deposit']);
    return true;
  }
}
