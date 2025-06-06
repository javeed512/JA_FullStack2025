import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactusComponent } from './contactus/contactus.component';
import { AboutusComponent } from './aboutus/aboutus.component';

const routes: Routes = [
      {path:'',redirectTo:'home',pathMatch:'full'},
      {path:'call',redirectTo:'contactus',pathMatch:'full'},
      {path:'home',component:HomeComponent},
      {path:'contactus',component:ContactusComponent},
      {path:'aboutus',component:AboutusComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
