import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../service/category.service';
import { CardService } from '../service/card.service';
@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.scss']
})
export class CategoryComponent implements OnInit {
<<<<<<< HEAD
<<<<<<< HEAD
  categories: string[] = [];
  selectedCategory: string = '';
<<<<<<< HEAD
  
=======
=======
  categories!: string[];
  selectCategory: string ='' ;
>>>>>>> 9b18927 (..)
=======
  categories!: string[];
  selectCategory: string ='' ;
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3

>>>>>>> cc2e4e1 (card)
  cards!: any[]; // Array to store card data
  constructor(private categoryService: CategoryService,private cardService : CardService) { }

  fetchCard(category: string): void {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

    this.cardService.getCard(category).subscribe({

   
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9ea63d0 (card)
    this.cardService.getCard( category).subscribe({
>>>>>>> 5550945 (card)
=======

    this.cardService.getCard(category).subscribe({
>>>>>>> 9b18927 (..)
=======

    this.cardService.getCard(category).subscribe({
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
      next: (data: any) => {
        console.log(data);
        this.cards = data;
      },
      complete: () => {


      }
    } 
    )
<<<<<<< HEAD
<<<<<<< HEAD
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
=======

    this.selectCategory = category;

>>>>>>> 9b18927 (..)
=======

    this.selectCategory = category;

>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
  }
  ngOnInit(): void {
    // Fetch categories from your backend service
    this.categoryService.getCategoryNames().subscribe((data: string[]) => {
      this.categories = data;
    });

    this.fetchCard("All");

  } 
}




