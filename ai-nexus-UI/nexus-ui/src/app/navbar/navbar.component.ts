import { Component, Renderer2 } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent {
  selectedButton: string = ''; // Variable to keep track of the selected button
  isDropdownVisible: boolean = false;

  constructor(private renderer: Renderer2,) {}

  toggleDropdown() {
    this.isDropdownVisible = !this.isDropdownVisible;
  }

  selectButton(button: string) {
    this.selectedButton = button;
    this.scrollToTop(); // Scroll to the top when button is clicked
  }

  hideDropdown() {
    this.isDropdownVisible = false;
  }

  scrollToTop() {
    // Using Renderer2 to access the DOM and perform the scroll
    if (typeof window !== 'undefined') {
      window.scrollTo({
        top: 0,
        behavior: 'smooth' // Smooth scroll behavior
      });
    }
  }
  reloadPage() {
    window.location.reload();
  }
}
