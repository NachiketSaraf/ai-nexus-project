import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../service/category.service';
import { CardService } from '../service/card.service';
@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.scss']
})
export class CategoryComponent implements OnInit {
  categories: string[] = [];
  selectedCategory: string = '';
<<<<<<< HEAD
  
=======

>>>>>>> cc2e4e1 (card)
  cards!: any[]; // Array to store card data
  constructor(private categoryService: CategoryService,private cardService : CardService) { }

  fetchCard(category: string): void {
<<<<<<< HEAD
    this.cardService.getCard(category).subscribe({
=======
    this.cardService.getCard( category).subscribe({
>>>>>>> cc2e4e1 (card)
      next: (data: any) => {
        console.log(data);
        this.cards = data;
      },
      complete: () => {

<<<<<<< HEAD
<<<<<<< HEAD
      }
    } 
    )
=======
  fetchCard(category: string): void {
    this.selectedCategory = category;
>>>>>>> 3e6e2ac (stuff)
=======
      }
    } 
    )
>>>>>>> cc2e4e1 (card)
  }
  ngOnInit(): void {
    // Fetch categories from your backend service
    this.categoryService.getCategoryNames().subscribe((data: string[]) => {
      this.categories = data;
    });
<<<<<<< HEAD
    this.fetchCard("All");
=======
>>>>>>> d37c9a7 (category)
  } 


  //   ngOnInit(): void {
  //     this.getCategory()
  //     console.log(this.getCategory());
  //   }
  //   getCategory() {
  //     this.categoryService.getCategoryNames().subscribe((data: any) => {
  //       this.categories = data;
  //       console.log(this.categories);
  //     })
  //   }
  //   selectCategory(category: string): void {
  //     this.selectedCategory = category;
  //   }


}