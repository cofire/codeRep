import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EidtuserComponent } from './eidtuser.component';

describe('EidtuserComponent', () => {
  let component: EidtuserComponent;
  let fixture: ComponentFixture<EidtuserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EidtuserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EidtuserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
