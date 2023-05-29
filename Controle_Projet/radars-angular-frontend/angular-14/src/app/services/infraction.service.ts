import {Observable, retry} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class InfractionService {

  constructor(private httpClient:HttpClient) { }
  getAllInfractions():Observable<any[]>{
    return this.httpClient
      .get<any[]>(`http://localhost:8090/INFRACTION-SERVICE/infractions`)
      .pipe(retry(1))

  }
}
