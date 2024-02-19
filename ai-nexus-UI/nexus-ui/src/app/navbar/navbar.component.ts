import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent {
// openSearch(){}
selectedButton: string = ''; // Variable to keep track of the selected button

  // Method to update the selected button
  selectButton(button: string): void {
    this.selectedButton = button;
    this.hideDropdown();
  }

  isDropdownVisible: boolean = false;

  toggleDropdown(): void {
      this.isDropdownVisible = !this.isDropdownVisible;
  }

  hideDropdown(): void {
      this.isDropdownVisible = false;
  }
}
