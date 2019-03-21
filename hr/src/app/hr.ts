export class Hr {
    id: string;
    hrid: string;
    name: string;
    job: string;
    phone: string;
    constructor(id?: string, hrid?: string, name?: string, job?: string, phone?: string) {
      this.id = id;
      this.hrid = hrid;
      this.name = name;
      this.job =  job;
      this.phone = phone;
    }
}
