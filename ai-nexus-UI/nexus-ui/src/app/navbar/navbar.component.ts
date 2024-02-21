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
  

  isDropdownVisible: boolean = false;
  toggleDropdown() {
    this.isDropdownVisible = !this.isDropdownVisible;
  }

  selectButton(button: string) {
    this.selectedButton = button;
  }

  hideDropdown() {
    this.isDropdownVisible = false;
  }
}
