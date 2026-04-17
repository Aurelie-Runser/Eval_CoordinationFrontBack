import { Component, inject, OnInit } from '@angular/core';
import { HomeTitle } from '../../models/home';
import { HomeService } from '../../services/home.service';


@Component({
  selector: 'app-home-title',
  imports: [],
  templateUrl: './home-title.html',
  styleUrl: './home-title.css',
})

export class HomeTitleComponent implements OnInit {

  private homeService = inject(HomeService);

  loading: boolean = false;
  home: HomeTitle | null = null;

  ngOnInit(): void {
    this.loading = true

    this.homeService.getHome().subscribe({
      next: (home) => {
        this.home = home
        this.loading = false
      },
      error: (err: unknown) => {
        console.error("erreur api :", err)
        this.loading = false
      }
    });

  }

}
