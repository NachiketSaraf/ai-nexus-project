import { Component, Input, OnInit } from '@angular/core';
import { CardService } from '../service/card.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
 })
export class CardComponent implements OnInit{
  selectedCategory: string="";
  cards!: any[]; // Array to store card data

  constructor(private cardService: CardService) {}

  ngOnInit() : void {
        // Subscribe to the getCard method to fetch and update card data
    this.cardService.getCards().map((cards: any[]) => {
      this.cards = cards;
    });
  };
  }