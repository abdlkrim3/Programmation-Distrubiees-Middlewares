import { Component, OnInit } from '@angular/core';
import {ProprietaireService} from "../../services/proprietaire.service";

@Component({
  selector: 'app-proprietaires',
  templateUrl: './proprietaires.component.html',
  styleUrls: ['./proprietaires.component.scss']
})
export class ProprietairesComponent implements OnInit {
//data:any[] = [];
  proprietaires:any;
  constructor(private proprietaireService:ProprietaireService) { }

  ngOnInit(): void {
    this.proprietaireService.getAllProprietaires().subscribe({
      next: (data) => {
        this.proprietaires = data
        this.proprietaires=this.proprietaires["_embedded"].proprietaires
      },
      error: err => {
        console.error(err)
      }
    })
  }

}
