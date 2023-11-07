import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FullToolPageComponent } from './full-tool-page.component';

describe('FullToolPageComponent', () => {
  let component: FullToolPageComponent;
  let fixture: ComponentFixture<FullToolPageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FullToolPageComponent]
    });
    fixture = TestBed.createComponent(FullToolPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
