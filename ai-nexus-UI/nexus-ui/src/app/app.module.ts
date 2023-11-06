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
import { HomeComponent } from './home/home.component';
<<<<<<< HEAD
<<<<<<< HEAD
import { TrendingComponent } from './trending/trending.component';
import { RecommendedComponent } from './recommended/recommended.component';
import { FullToolPageComponent } from './full-tool-page/full-tool-page.component';
import { FullToolPageService } from './service/full-tool-page.service';


=======
import { ViewComponent } from './view/view.component';
=======

import { TrendingComponent } from './trending/trending.component';
import { RecommendedComponent } from './recommended/recommended.component';
>>>>>>> d37c9a7 (category)
//import {MatIconModule} from '@angular/material/icon';
>>>>>>> 3e6e2ac (stuff)





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
    FullToolPageComponent,
    
=======
    ViewComponent
>>>>>>> 3e6e2ac (stuff)
=======
    TrendingComponent,
    RecommendedComponent,
    
>>>>>>> d37c9a7 (category)

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatCardModule,
  //MatIconModule


    BrowserAnimationsModule


  ],
  providers: [CategoryService, CardService,FullToolPageService],
  bootstrap: [AppComponent]
})
export class AppModule { }





