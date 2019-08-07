import { Component } from '@angular/core';
import {users} from './users/users.component';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'users';
  detailsFromUsers : users;
  
  getDetailsFromUser($event){
    this.detailsFromUsers = $event;
  }
}
