import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { CategoryComponent } from './category/category.component';
import { CategoryService } from './service/category.service';
import { NavbarComponent } from './navbar/navbar.component';
import { HttpClientModule } from '@angular/common/http';
import { MatToolbarModule } from '@angular/material/toolbar';
import { CardComponent } from './card/card.component';
import { CardService } from './service/card.service';
import { AiToolsComponent } from './ai-tools/ai-tools.component';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
<<<<<<< HEAD
import { HomeComponent } from './home/home.component';
<<<<<<< HEAD
<<<<<<< HEAD
import { TrendingComponent } from './trending/trending.component';
import { RecommendedComponent } from './recommended/recommended.component';
=======
import { ViewComponent } from './view/view.component';
>>>>>>> 32be760 (stuff)
=======

import { TrendingComponent } from './trending/trending.component';
import { RecommendedComponent } from './recommended/recommended.component';
>>>>>>> d5a9c5c (category)
=======
>>>>>>> 39281af7f2aad36404aeb5eb48de6a6c10bdefbb
//import {MatIconModule} from '@angular/material/icon';



<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 39281af7f2aad36404aeb5eb48de6a6c10bdefbb
import { HomeComponent } from './home/home.component';
import { RecommendedComponent } from './recommended/recommended.component';
import { TrendingComponent } from './trending/trending.component';

>>>>>>> 39281af (..)

@NgModule({
  declarations: [
    AppComponent,
    CategoryComponent,
    NavbarComponent,
    CardComponent,
    AiToolsComponent,
    HomeComponent,
<<<<<<< HEAD
<<<<<<< HEAD
    TrendingComponent,
    RecommendedComponent,
    
=======
    ViewComponent
>>>>>>> 32be760 (stuff)
=======
    TrendingComponent,
    RecommendedComponent,
    
>>>>>>> d5a9c5c (category)

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,

    HttpClientModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatCardModule,
    // MatIconModule
<<<<<<< HEAD

    BrowserAnimationsModule

=======
    BrowserAnimationsModule
>>>>>>> 39281af7f2aad36404aeb5eb48de6a6c10bdefbb
  ],
  providers: [CategoryService, CardService],
  bootstrap: [AppComponent]
})
export class AppModule { }





