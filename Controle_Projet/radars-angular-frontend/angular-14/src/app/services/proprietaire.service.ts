import {Observable, retry} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class ProprietaireService {

  constructor(private httpClient:HttpClient) { }
  getAllProprietaires():Observable<any[]>{
    return this.httpClient
      .get<any[]>(`http://localhost:8090/IMMATRICULATION-SERVICE/proprietaires`)
      .pipe(retry(1))

  }
}
