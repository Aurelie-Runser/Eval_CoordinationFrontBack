import { Component, inject, OnInit } from '@angular/core';
import { Commande } from '../../models/commande';
import { CommandesService } from '../../services/commandes.service';

@Component({
  selector: 'app-commande-list',
  imports: [],
  templateUrl: './commande-list.html',
  styleUrl: './commande-list.css',
})
export class CommandeList {

  private commandesService = inject(CommandesService);

  loading: boolean = false;
  commandes: Commande[] = [];
  
    ngOnInit(): void {
      this.loading = true
  
      this.commandesService.getCommandes().subscribe({
        next: (commandes) => {
          this.commandes = commandes
          this.loading = false
          console.log(commandes)
        },
        error: (err: unknown) => {
          console.error("erreur api :", err)
          this.loading = false
        }
      });
  
    }
}
