import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
<<<<<<< HEAD
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
//import {MatIconModule} from '@angular/material/icon';


=======
>>>>>>> 7f41df5b520686d065e29140432f73ce13358150

@NgModule({
  declarations: [
    AppComponent,
    CategoryComponent,
    NavbarComponent,
    CardComponent,
    AiToolsComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
<<<<<<< HEAD
    HttpClientModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatCardModule,
    // MatIconModule
=======
    BrowserAnimationsModule
>>>>>>> 7f41df5b520686d065e29140432f73ce13358150
  ],
  providers: [CategoryService, CardService],
  bootstrap: [AppComponent]
})
export class AppModule { }





