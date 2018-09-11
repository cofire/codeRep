import { Component, OnInit ,ViewEncapsulation} from '@angular/core';

@Component({
  selector: 'app-editmodal',
  encapsulation: ViewEncapsulation.None,
  templateUrl: './editmodal.component.html',
  styleUrls: ['./editmodal.component.css']
})
export class EditmodalComponent implements OnInit {

  isVisible = false;
  isConfirmLoading = false;
  cid = null;
  
  constructor() { }

  ngOnInit() {
  }

  showModal(cid): void {
    this.cid = cid;
    this.isVisible = true;
  }

  handleOk(): void {
    this.isConfirmLoading = true;
    setTimeout(() => {
      this.isVisible = false;
      this.isConfirmLoading = false;
    }, 3000);
  }

  handleCancel(): void {
    this.isVisible = false;
  }
  
  inputValue: string;
  options = [];

  onChange(value: string): void {
    if (!value || value.indexOf('@') >= 0) {
      this.options = [];
    } else {
      this.options = ['gmail.com', '163.com', 'qq.com'].map(domain => `${value}@${domain}`);
    }
  }
}
