import { TestBed } from '@angular/core/testing';
<<<<<<< HEAD
import { AppComponent } from './app.component';


describe('AppComponent', () => {
  beforeEach(() => TestBed.configureTestingModule({
=======
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  beforeEach(() => TestBed.configureTestingModule({
    imports: [RouterTestingModule],
>>>>>>> c93b5b0eb5657f6efd9c980f1ebb61a93bd1044f
    declarations: [AppComponent]
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

<<<<<<< HEAD
  it(`should have as title 'ai-nexus-UI'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('ai-nexus-UI');
=======
  it(`should have as title 'nexus-ui'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('nexus-ui');
>>>>>>> c93b5b0eb5657f6efd9c980f1ebb61a93bd1044f
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
<<<<<<< HEAD
    expect(compiled.querySelector('.content span')?.textContent).toContain('ai-nexus-UI app is running!');
=======
    expect(compiled.querySelector('.content span')?.textContent).toContain('nexus-ui app is running!');
>>>>>>> c93b5b0eb5657f6efd9c980f1ebb61a93bd1044f
  });
});
