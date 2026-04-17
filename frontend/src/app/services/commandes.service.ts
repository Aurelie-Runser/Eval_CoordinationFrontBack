import { HttpClient } from "@angular/common/http";
import { inject, Injectable } from "@angular/core";
import { Commande } from "../models/commande";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})

export class CommandesService {

    private http = inject(HttpClient);
    private readonly apiUrl = "http://localhost:8080/commandes";

    public getCommandes():Observable<Commande[]> {
        return this.http.get<Commande[]>(this.apiUrl);
    }
}