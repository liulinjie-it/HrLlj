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
  hrid: string;
  name: string;
  job = 'java';
  phone: string;
  title = '人力资源管理';
  author = '刘林洁';
  hrlist: Array<Hr>;
  hr: Hr;
  jobs = ['java', 'c++'];
  constructor(private service: DataService,
    ) {
    service.getHttpHrlist().subscribe(
      (hr) => {
        this.hrlist = hr;
        console.log('成功得到');
      }
    );
  }

  ngOnInit() {
  }
  add(hrid: string, name: string , job: string , phone: string) {
     hrid = this.hrid.trim();
     name = this.name.trim();
     job  = this.job.trim();
     phone = this.phone.trim();
     this.service.postHttpHradd({ hrid, name, job, phone} as Hr).subscribe(
       (add) => {
         this.hrlist = add;
       }
     );
     this.hrid = '';
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
  }
}
