import { Component, OnInit } from '@angular/core';
import { TrendingService } from '../service/trending.service';

@Component({
  selector: 'app-trending',
  templateUrl: './trending.component.html',
  styleUrls: ['./trending.component.scss']
})
export class TrendingComponent implements OnInit {
  trendingCards!: any[];

  constructor(private trendingservice: TrendingService) { }
  
  ngOnInit(): void {
    const toolTag = 'trending'; // Define the tag you want to fetch
    this.trendingservice.getTrendingCards(toolTag)
      .subscribe((data: any) => {
        this.trendingCards = data;
        console.log(data);
        
      });
  }
}
