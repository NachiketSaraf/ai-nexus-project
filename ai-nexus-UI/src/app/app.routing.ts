import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule  } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { AiToolsComponent } from './ai-tools/ai-tools.component';



const routes: Routes =[
  {
    path: 'navbar',
    component:NavbarComponent
  },
  {
    path: 'ai-tool',
    component:AiToolsComponent
  }
];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes,{
       useHash: true
    })
  ],
  exports: [
  ],
})
export class AppRoutingModule { }
