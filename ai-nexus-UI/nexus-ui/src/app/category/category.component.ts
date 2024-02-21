import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../service/category.service';
import { CardService } from '../service/card.service';
import { MatCardModule } from '@angular/material/card';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.scss']
})
export class CategoryComponent implements OnInit {

  categories: string[] = [];
  selectedCategory: string = '';

  cards: any[] = []; // Array to store card data from api

  sortedCard: any[] = [];
  constructor(private categoryService: CategoryService, private cardService: CardService) { }


  ngOnInit(): void {
    this.categoryService.getCategoryNames().subscribe((data: string[]) => {
      this.categories = data;
      console.log(this.categories);
    });


    // Fetch data from the API once when the component initializes
    this.cardService.getCard("All").subscribe({
      next: (data: any) => {
        console.log(data);
        this.cards = data;
        this.onCategoryClick("All");
      }
    });
  }
  onCategoryClick(category: string): void {
    if (category === "All") {
      this.sortedCard = this.cards
      this.selectedCategory="All";
    }
    else {
      this.sortedCard = this.cards.filter(card => card.category.categoryName === category);
      this.selectedCategory = category;
    }

    console.log(this.sortedCard);
  }



}



