import { Component, OnInit } from '@angular/core';
import { Hr } from '../hr';
import { DataService } from '../data.service';

@Component({
  selector: 'app-hr',
  templateUrl: './hr.component.html',
  styleUrls: ['./hr.component.css']
})
export class HrComponent implements OnInit {
  id: string;
  hrid: number;
  name: string;
  job = 'java';
  phone: string;
  uid: string;
  uhrid: number;
  uname: string;
  ujob: string;
  uphone: string;
  nt = '1';
  title = '人力资源管理';
  author = '刘林洁';
  hrlist: Array<Hr>;
  uphr: Hr;
  jobs = ['java', 'c++', '运维' , '数据库'];
  nums: Array<number>;
  constructor(private service: DataService,
    ) {
    service.getHttpHrlist().subscribe(
      (hr) => {
        this.hrlist = hr;
        console.log(hr);
        console.log('成功得到');
      }
    );
    service.getHttphrnums().subscribe(
      (nm) => {
        this.nums = nm;
        console.log(nm);
      }
    );
  }

  ngOnInit() {
  }
  add(hrid: number, name: string , job: string , phone: string) {
     hrid = this.hrid;
     name = this.name.trim();
     job  = this.job.trim();
     phone = this.phone.trim();
     this.service.postHttpHradd({ hrid, name, job, phone} as Hr).subscribe(
       (add) => {
         this.hrlist = add;
       }
     );
     this.service.getHttphrnums().subscribe(
      (nm) => {
        this.nums = nm;
        console.log(nm);
      }
    );
     this.hrid = 0;
     this.name = '';
     this.job = 'java';
     this.phone = '';
  }
  dlt(id: string) {
    this.service.postHttpHrdlt({id} as Hr ).subscribe(
      (dlt) => {
        this.hrlist = dlt;
        console.log('成功得到');
      }
    );
    this.service.getHttphrnums().subscribe(
      (nm) => {
        this.nums = nm;
        console.log(nm);
      }
    );

  }
  updt(hr: Hr) {
        this.uid = hr.id;
        this.uhrid = hr.hrid;
        this.uname = hr.name;
        this.ujob = hr.job;
        this.uphone = hr.phone  ;
  }
  save(id: string, hrid: number, name: string , job: string , phone: string) {
    id = this.uid.trim();
    hrid = this.uhrid;
    name = this.uname.trim();
    job = this.ujob.trim();
    phone = this.uphone.trim();
    this.service.postHttpHrsave({ id, hrid, name, job, phone} as Hr).subscribe(
      (updt) => {
        this.hrlist = updt;
      }
    );
    this.service.getHttphrnums().subscribe(
      (nm) => {
        this.nums = nm;
        console.log(nm);
      }
    );
  }
   nm(nm: string) {
     console.log(nm);
     this.nt = nm;
     this.service.getHttphrnm(nm).subscribe(
       (hr) => {
         this.hrlist = hr;
       }
     );
     this.service.getHttphrnums().subscribe(
      (n) => {
        this.nums = n;
        console.log(n);
      }
    );
   }
   next() {
      this.nt = this.nt + 1;
      console.log(this.nt);
   }
   perv() {

   }
}
