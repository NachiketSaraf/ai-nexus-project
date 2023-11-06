import { Component, Input, OnInit } from '@angular/core';
import { CardService } from '../service/card.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
 })
export class CardComponent implements OnInit{
  selectedCategory: string="All";
  card!: any[]; // Array to store card data

  constructor(private cardService: CardService) {}

  ngOnInit() : void {
    this.cardService.getCard(this.selectedCategory).subscribe((card) => {
      this.card = card;
    });
  }

  fetchCard(category: string) : void {
    this.selectedCategory = category;
    
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