import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HomeTitleComponent } from './components/home-title/home-title';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, HomeTitleComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('frontend');
}
