import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoryComponent } from './category/category.component';
import { HomeComponent } from './home/home.component';
import { CardComponent } from './card/card.component';
import { AiToolsComponent } from './ai-tools/ai-tools.component';
<<<<<<< HEAD
import { FullToolPageComponent } from './full-tool-page/full-tool-page.component'
=======
>>>>>>> d37c9a7 (category)

const routes: Routes = [
<<<<<<< HEAD
  { path: "", component: HomeComponent },
  { path: "category", component: CategoryComponent },
  { path: "ai-tools/card/:category", component: CardComponent },
  { path: "ai-tools", component: AiToolsComponent },
  { path: "full-tool-page", component: FullToolPageComponent }
=======
  { path : "", component : HomeComponent},
 { path : "category" , component :CategoryComponent},
 { path : "ai-tools/card/:category" , component : CardComponent},
 { path : "ai-tools" , component : AiToolsComponent}
>>>>>>> cc2e4e1 (card)
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }