import { Component, OnInit, Output, EventEmitter, SystemJsNgModuleLoader } from '@angular/core';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  users:users[]
  count:number = 3;
  aUser:number=2;
  dUser:number=1;
  @Output() userDetails = new EventEmitter();
  constructor() { }

  ngOnInit() {
    this.users = [ {
      id:1,
      name:'poorvik',
      age:21,
      status:true
    },
    {
      id:2,
      name:'punit',
      age:21,
      status:false
    },
    {
      id:3,
      name:'prakash',
      age:21,
      status:true
    },
   ]  
  }
  checkStatus(){
    this.aUser = 0;
    this.dUser = 0;
    this.users.forEach((u)=>{
      if(u.status == true){
        this.aUser +=1;
      }else{
        this.dUser -=1;
      }
    })
  }
  addUser(){
    this.users.push({
      id:4,
      name:'prashant',
      age:21,
      status:false
    })
    this.count +=1; 
    this.checkStatus();   
  }
  deleteUser(){
    this.users.pop();
    this.count-=1;
    this.checkStatus();
  }
}

  export interface users{
    id:number,
    name:string,
    age:number,
    status:boolean
  }


