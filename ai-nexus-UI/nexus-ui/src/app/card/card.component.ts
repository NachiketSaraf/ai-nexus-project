import { Component, Input } from '@angular/core';
import { CardService } from '../service/card.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
  // standalone: true, 
})
export class CardComponent {
  @Input() selectedCategory: string="";
  card: any[] = [];
  constructor(private cardService: CardService) { }
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
  ngOnChanges(): void {
    // Fetch cards for the selected category from your backend service
    if (this.selectedCategory) {
      this.cardService.getCard(this.selectedCategory).subscribe((data: any[]) => {
        this.card = data;

      });
    }
  }
}
