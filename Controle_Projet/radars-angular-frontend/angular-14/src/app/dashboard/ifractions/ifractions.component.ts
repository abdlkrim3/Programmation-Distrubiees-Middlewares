import { Component, OnInit } from '@angular/core';
import {InfractionService} from "../../services/infraction.service";

@Component({
  selector: 'app-ifractions',
  templateUrl: './ifractions.component.html',
  styleUrls: ['./ifractions.component.scss']
})
export class IfractionsComponent implements OnInit {

  infractions:any;
  constructor(private infractionService:InfractionService) { }

  ngOnInit(): void {
    this.infractionService.getAllInfractions().subscribe({
      next: (data) => {
        this.infractions = data
        this.infractions=this.infractions["_embedded"].infractions
      },
      error: err => {
        console.error(err)
      }
    })
  }

}
