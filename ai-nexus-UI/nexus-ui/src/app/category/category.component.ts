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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9ea63d0 (card)
    this.cardService.getCard( category).subscribe({
>>>>>>> 5550945 (card)
      next: (data: any) => {
        console.log(data);
        this.cards = data;
      },
      complete: () => {


      }
    } 
    )
<<<<<<< HEAD

  fetchCard(category: string): void {
    this.selectedCategory = category;

    } 
  


    this.selectedCategory = category;

=======
<<<<<<< HEAD
=======
    this.selectedCategory = category;
>>>>>>> 32be760 (stuff)
=======
>>>>>>> 9ea63d0 (card)
>>>>>>> 5550945 (card)
  }
  ngOnInit(): void {
    // Fetch categories from your backend service
    this.categoryService.getCategoryNames().subscribe((data: string[]) => {
      this.categories = data;
    });

    this.fetchCard("All");

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