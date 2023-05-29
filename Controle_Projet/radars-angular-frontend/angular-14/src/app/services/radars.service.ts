import {Observable, retry} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class RadarsService {

  constructor(private httpClient:HttpClient) { }
  getAllRadars():Observable<any[]>{
    return this.httpClient
      .get<any[]>(`http://localhost:8090/RADAR-SERVICE/radars`)
      .pipe(retry(1))

  }
}
