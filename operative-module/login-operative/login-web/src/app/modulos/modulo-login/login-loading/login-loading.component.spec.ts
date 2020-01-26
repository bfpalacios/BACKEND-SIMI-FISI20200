import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginLoadingComponent } from './login-loading.component';

describe('LoginLoadingComponent', () => {
  let component: LoginLoadingComponent;
  let fixture: ComponentFixture<LoginLoadingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginLoadingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginLoadingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
