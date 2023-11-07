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

  cards!: any[]; // Array to store card data
  constructor(private categoryService: CategoryService,private cardService : CardService) { }

  fetchCard(category: string): void {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9ea63d0 (card)
    this.cardService.getCard( category).subscribe({
      next: (data: any) => {
        console.log(data);
        this.cards = data;
      },
      complete: () => {

      }
    } 
    )
<<<<<<< HEAD
=======
    this.selectedCategory = category;
>>>>>>> 32be760 (stuff)
=======
>>>>>>> 9ea63d0 (card)
  }
  ngOnInit(): void {
    // Fetch categories from your backend service
    this.categoryService.getCategoryNames().subscribe((data: string[]) => {
      this.categories = data;
    });
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