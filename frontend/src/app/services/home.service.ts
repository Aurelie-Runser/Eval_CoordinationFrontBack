import { HttpClient } from "@angular/common/http";
import { inject, Injectable } from "@angular/core";
import { HomeTitle } from "../models/home";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})

export class HomeService {

    private http = inject(HttpClient);
    private readonly apiUrl = "http://localhost:8080";

    public getHome():Observable<HomeTitle> {
        return this.http.get<HomeTitle>(this.apiUrl);
    }
}