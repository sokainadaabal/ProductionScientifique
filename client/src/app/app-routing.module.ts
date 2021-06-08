import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { BoardUserComponent } from './board-user/board-user.component';
import { BoardModeratorComponent } from './board-moderator/board-moderator.component';
import { BoardAdminComponent } from './board-admin/board-admin.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AcceuilComponent} from './dashboard/acceuil/acceuil.component';
import { PublicationComponent } from './publication/publication.component';
import { ProfComponent } from './prof/prof.component';
import { DoctorantComponent } from './doctorant/doctorant.component';
import {AuthorComponent} from './author/author.component'
const routes: Routes = [
  
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'user', component: BoardUserComponent },
  { path: 'dashboard', component: DashboardComponent , children:[
    {path:'',component:AcceuilComponent},
    {path:'publication',component:PublicationComponent},
    {path:'prof',component:ProfComponent},
    {path:'doctorant',component:DoctorantComponent},
    {path:'author',component:AuthorComponent},
  ] },
  { path: 'admin', component: BoardAdminComponent },
  
 ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
