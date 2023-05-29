import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IfractionsComponent } from './ifractions.component';

describe('IfractionsComponent', () => {
  let component: IfractionsComponent;
  let fixture: ComponentFixture<IfractionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IfractionsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IfractionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
