import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SheduleinterviewComponent } from './sheduleinterview.component';

describe('SheduleinterviewComponent', () => {
  let component: SheduleinterviewComponent;
  let fixture: ComponentFixture<SheduleinterviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SheduleinterviewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SheduleinterviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
