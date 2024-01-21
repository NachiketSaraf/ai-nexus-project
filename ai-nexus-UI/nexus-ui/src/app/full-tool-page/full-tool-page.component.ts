import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FullToolPageService } from '../service/full-tool-page.service';

@Component({
  selector: 'app-full-tool-page',
  templateUrl: './full-tool-page.component.html',
  styleUrls: ['./full-tool-page.component.scss']
})
export class FullToolPageComponent implements OnInit {
  toolDetail: any = {};
  toolName: string = '';

  constructor(private toolService: FullToolPageService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params.subscribe((params: { [key: string]: string }) => {
      this.toolName = params?.['toolName'];
      console.log(this.toolName);
      
      // Now that you have the toolName, you can fetch the tool details
      this.fetchToolDetail();
    });
  }

  fetchToolDetail() {
    this.toolService.getTool(this.toolName).subscribe({
      next: (data: any) => {
        console.log(data);
        this.toolDetail = data;
      },
      error: (error) => {
        console.error(error);
      }
    });
  }
}
