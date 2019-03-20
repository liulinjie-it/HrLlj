export class Hr {
    id: string;
    hrid: string;
    name: string;
    job: string;
    phone: string;
    constructor(hrid?: string, name?: string, job?: string, phone?: string) {
      this.id = '0';
      this.hrid = hrid;
      this.name = name;
      this.job =  job;
      this.phone = phone;
    }
}
