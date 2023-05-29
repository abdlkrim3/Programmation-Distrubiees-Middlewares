import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { FullComponent } from './layouts/full/full.component';
import {VehiculeComponent} from "./dashboard/vehicule-component/vehicule.component";
import {ProprietairesComponent} from "./dashboard/proprietaires/proprietaires.component";
import {IfractionsComponent} from "./dashboard/ifractions/ifractions.component";
import {RadarsComponent} from "./dashboard/radars/radars.component";

export const Approutes: Routes = [
  {
    path: '',
    component: FullComponent,
    children: [
      { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
      {
        path: 'dashboard',
        loadChildren: () => import('./dashboard/dashboard.module').then(m => m.DashboardModule)
      },
      {
        path: 'about',
        loadChildren: () => import('./about/about.module').then(m => m.AboutModule)
      },
      {
        path: 'component',
        loadChildren: () => import('./component/component.module').then(m => m.ComponentsModule)
      },
      {
        path: 'vehicle', component: VehiculeComponent
      },
      {
        path:'proprietaires',component: ProprietairesComponent
      },
      {
        path:'infractions',component: IfractionsComponent
      },
      {
        path:'radars',component: RadarsComponent
      }

    ]
  },
  {
    path: '**',
    redirectTo: '/starter'
  }
];
