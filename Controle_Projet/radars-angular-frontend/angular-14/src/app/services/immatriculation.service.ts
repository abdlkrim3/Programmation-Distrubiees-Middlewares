import {Observable, retry} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class ImmatriculationService {

  constructor(private httpClient:HttpClient) { }
  getAllImmatriculation():Observable<any[]>{
    return this.httpClient
      .get<any[]>(`http://localhost:8090/IMMATRICULATION-SERVICE/vehicules`)
      .pipe(retry(1))

  }
}
