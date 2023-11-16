import { Component, OnInit } from '@angular/core';
import { FullToolPageService } from '../service/full-tool-page.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-full-tool-page',
  templateUrl: './full-tool-page.component.html',
  styleUrls: ['./full-tool-page.component.scss']
})
export class FullToolPageComponent implements OnInit {
  toolDetail: any = {};
  toolname: string = '';
  constructor(private toolService: FullToolPageService,
    private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params.subscribe((params) => {
      this.toolname = params?.["toolname"]
      console.log(this.toolname);

    })
    // getTool(this.toolname : String): void{
    //   this.toolService.getTool(this.toolname).subscribe({
    //     next: (data: any) => {
    //       console.log(data);
    //       this.toolDetail = data;
    //     },
    //     complete: () => {
  
    //     }
    //   }
    // }
    
  }
  // setSelectedToolName(setSelectedToolName : string){
  //   this.toolname = setSelectedToolName;
  // }

  // fetchToolDetail() {



}

