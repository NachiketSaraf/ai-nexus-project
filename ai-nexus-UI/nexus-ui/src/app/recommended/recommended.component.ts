import { Component, OnInit } from '@angular/core';
import { RecommendedService } from '../service/recommended.service';

@Component({
  selector: 'app-recommended',
  templateUrl: './recommended.component.html',
  styleUrls: ['./recommended.component.scss']
})
export class RecommendedComponent implements OnInit {
  recommendedCards !: any[]; 

  constructor(private recommendedservice : RecommendedService){}


  ngOnInit(): void {
    const toolTag = 'recommended'; // Define the tag you want to fetch
    this.recommendedservice.getRecommendedCards(toolTag).subscribe({
      next: (data: any) => {
        // console.log(data);
        this.recommendedCards = data;
      },
      complete: () => {
      }
      });
  }

}
