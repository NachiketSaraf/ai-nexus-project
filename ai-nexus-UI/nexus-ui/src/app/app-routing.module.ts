import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoryComponent } from './category/category.component';
import { HomeComponent } from './home/home.component';
import { CardComponent } from './card/card.component';
import { AiToolsComponent } from './ai-tools/ai-tools.component';
import { FullToolPageComponent } from './full-tool-page/full-tool-page.component'

const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "category", component: CategoryComponent },
  { path: "ai-tools/card/:category", component: CardComponent },
  { path: "ai-tools", component: AiToolsComponent },
  { path: "full-tool-page", component: FullToolPageComponent }
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }