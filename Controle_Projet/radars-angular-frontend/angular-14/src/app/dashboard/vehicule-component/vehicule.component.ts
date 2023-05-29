import { Component, OnInit } from '@angular/core';
import {ImmatriculationService} from "../../services/immatriculation.service";

@Component({
  selector: 'app-vehicule',
  templateUrl: './vehicule.component.html'
})
export class VehiculeComponent implements OnInit {

  //data:any[] = [];
  vehicules:any;

  constructor(private vehiculeService:ImmatriculationService) {
  }

  ngOnInit(): void {

    this.vehiculeService.getAllImmatriculation().subscribe({
      next: (data) => {
        this.vehicules = data
        this.vehicules=this.vehicules["_embedded"].vehicules

      },
      error: err => {
        console.error(err)
      }
    })
  }

}
