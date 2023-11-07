import { Component, Input, OnInit } from '@angular/core';
import { CardService } from '../service/card.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7cda774 (stuff)
=======
>>>>>>> d81d070 (card)
 })
export class CardComponent implements OnInit{
  selectedCategory: string="";
  cards!: any[]; // Array to store card data
<<<<<<< HEAD

  constructor(private cardService: CardService) {}
=======

 })
export class CardComponent implements OnInit{
  selectCategory: string="All";
  card!: any[]; // Array to store card data
 constructor(private cardService: CardService) {}
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3

  ngOnInit() : void {
        // Subscribe to the getCard method to fetch and update card data
    this.cardService.getCards().map((cards: any[]) => {
      this.card = cards;
    });
<<<<<<< HEAD
  };
  }
=======
  // standalone: true, 
})
<<<<<<< HEAD
<<<<<<< HEAD
=======
 })
>>>>>>> 5e16aff (card)
export class CardComponent implements OnInit{
  selectedCategory: string="All";
  card!: any[]; // Array to store card data
=======
>>>>>>> cc2e4e1 (card)

  constructor(private cardService: CardService) {}

  ngOnInit() : void {
        // Subscribe to the getCard method to fetch and update card data
    this.cardService.getCards().map((cards: any[]) => {
      this.cards = cards;
    });
<<<<<<< HEAD
  }

  fetchCard(category: string) : void {
    this.selectedCategory = category;
    
=======
=======
=======
 })
>>>>>>> a7afa04 (card)
>>>>>>> d81d070 (card)
export class CardComponent implements OnInit{
  selectedCategory: string="All";
=======

 })
export class CardComponent implements OnInit{
  selectCategory: string="All";
>>>>>>> 9b18927 (..)
  card!: any[]; // Array to store card data
 constructor(private cardService: CardService) {}

  ngOnInit() : void {
        // Subscribe to the getCard method to fetch and update card data
    this.cardService.getCards().map((cards: any[]) => {
      this.card = cards;
    });
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7cda774 (stuff)
=======
<<<<<<< HEAD
>>>>>>> 5550945 (card)
=======
>>>>>>> 9b18927 (..)
=======
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
  }

  fetchCard(category: string) : void {
    this.selectCategory = category;
    
  }
}
  
//previous code 1
// @Input() selectedCategory: string="";
// card: any[] = [];
// constructor(private cardService: CardService , private route: ActivatedRoute) { }

// ngOnInit(): void{
//   this.route.params.subscribe((params) => {
//     this.selectedCategory = params['selectedCategory'];
//     if(this.selectedCategory){
//       this.cardService.getCard(this.selectedCategory).subscribe((card) => {
//         console.log(card);
//         this.card =card ;
//       });
//     }
//   });
// }

//previous code 
// ngOnInit(): void {
  //   this.getCard()
  //   console.log(this.getCard());
  // }
  // getCard() {
  //   this.cardService.getCard().subscribe((data: any) => {
  //     this.card = data;
  //     console.log(this.card);
  //   })
  // }
  // ngOnChanges(): void {
  //   // Fetch cards for the selected category from your backend service
  //   if (this.selectedCategory) {
  //     this.cardService.getCard(this.selectedCategory).subscribe((card) => {
  //       this.card = card;

  //     });
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3e6e2ac (stuff)
=======
  };
  }
>>>>>>> cc2e4e1 (card)
=======
>>>>>>> 32be760 (stuff)
<<<<<<< HEAD
>>>>>>> 7cda774 (stuff)
=======
=======
  };
  }
>>>>>>> 9ea63d0 (card)
>>>>>>> 5550945 (card)
=======

>>>>>>> 9b18927 (..)
=======

>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
