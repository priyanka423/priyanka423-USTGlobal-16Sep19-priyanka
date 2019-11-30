import { Component, OnInit } from "@angular/core";
import { Validators, FormControl, FormGroup } from "@angular/forms";

@Component({
  selector: "app-adduser",
  templateUrl: "./adduser.component.html",
  styleUrls: ["./adduser.component.css"]
})
export class AdduserComponent implements OnInit {
  get fname() {
    return this.form.get("fname");
  }
  get mname() {
    return this.form.get("mname");
  }
  get lname() {
    return this.form.get("lname");
  }
  get email() {
    return this.form.get("email");
  }
  get password() {
    return this.form.get("password");
  }
  get gender() {
    return this.form.get("gender");
  }
  get address() {
    return this.form.get("address");
  }

  form = new FormGroup({
    fname: new FormControl("", [Validators.required]),
    lname: new FormControl("", [Validators.required]),
    email: new FormControl("", [Validators.required]),
    password: new FormControl("", [Validators.required]),
    gender: new FormControl("", [Validators.required]),
    address: new FormControl("", [Validators.required])
  });

  constructor() {}

  ngOnInit() {}
  requestData(form) {
    console.log(form);
  }
}
