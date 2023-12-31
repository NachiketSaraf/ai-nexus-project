import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../service/category.service';
import { CardService } from '../service/card.service';
// import {MatCardModule} 
@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.scss']
})
export class CategoryComponent implements OnInit {

  categories: string[] = [];
  selectedCategory: string = '';

  cards!: any[]; // Array to store card data from api
  constructor(private categoryService: CategoryService, private cardService: CardService) { }


  fetchCard(category: string): void {
    this.cardService.getCard(category).subscribe({
      next: (data: any) => {
        console.log(data);
        this.cards = data;
      },
      complete: () => {
      }
    }
    )
    this.selectedCategory = category;
  }
 
  ngOnInit(): void {
    this.categoryService.getCategoryNames().subscribe((data: string[]) => {
      this.categories = data;
    });

    this.fetchCard("All");
  }
}



