import { Component, OnInit } from '@angular/core';
import {RadarsService} from "../../services/radars.service";

@Component({
  selector: 'app-radars',
  templateUrl: './radars.component.html',
  styleUrls: ['./radars.component.scss']
})
export class RadarsComponent implements OnInit {

  radars:any;
  constructor(private radarsService:RadarsService) { }

  ngOnInit(): void {
    this.radarsService.getAllRadars().subscribe({
      next: (data) => {
        this.radars = data
        this.radars=this.radars["_embedded"].radars
      },
      error: err => {
        console.error(err)
      }
    })
  }

}
